package com.example.app.base;

import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class BasePageObject {

  public AndroidDriver<AndroidElement> getDriver(){
    return AndroidDriverInit.driver;
  }
  public AndroidElement find(By by){
    return getDriver().findElement(by);
  }
  public void type(By by, String text){
    find(by).sendKeys(text);
  }
  public void inputNumber(By by, int num) {
    find(by).sendKeys(Integer.toString(num));
  }
  public void click(By by){
    find(by).click();
  }
  public void longTap(By by){
    AndroidElement element = find(by);
    TouchAction action = new TouchAction(getDriver());
    action.longPress(PointOption.point(element.getCenter()))
            .waitAction(WaitOptions.waitOptions(Duration.of(10, ChronoUnit.SECONDS)))
            .release()
            .perform();
  }
  public void multiTap(By by){
    AndroidElement element = find(by);
    TouchAction action = new TouchAction(getDriver());
    action.tap(TapOptions
            .tapOptions()
            .withTapsCount(10)
            .withElement(ElementOption.element(element)))
            .perform();
  }
  public String getText(By by){
    return find(by).getText();
  }
  public boolean isDisplayed(By by){
    return find(by).isDisplayed();
  }
  public boolean isEnabled(By by) {
    return find(by).isEnabled();
  }
  public void selectDropdown(By by, String text){
    Select dropDown = new Select(find(by));
    dropDown.selectByVisibleText(text);
  }
}
