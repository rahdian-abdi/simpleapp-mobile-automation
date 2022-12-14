package com.example.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePageObject {

  public String getTitle() {
    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
  }

  public boolean validatePage() {
    final By mainPage = MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
    return isDisplayed(mainPage);
  }

  public boolean checkHamburgerBtnAppear() {
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }

  public String validateResult() {
    final By result = MobileBy.id("com.isl.simpleapp:id/tv_result");
//    return driver.findElement(result).getText();
    return getText(result);
  }

  public boolean validateButtonEnabled() {
    final By eql = MobileBy.id("com.isl.simpleapp:id/acb_calculate");
    return isEnabled(eql);
  }

}
