package com.example.steps;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class CalculatorStep extends BasePageObject {
    public void inputNumber1(int num) {
        final By firstField = MobileBy.id("com.isl.simpleapp:id/et_1");
//        AndroidElement element = driver.findElement(firstField);
//        element.sendKeys(Integer.toString(num));
        inputNumber(firstField, num);
    }
    public void inputNumber2(int num) {
        final By secondField = MobileBy.id("com.isl.simpleapp:id/et_2");
//        AndroidElement element = driver.findElement(firstField);
//        element.sendKeys(Integer.toString(num));
        inputNumber(secondField, num);
    }
    public void clickDropDown() {
        final By dropDown = MobileBy.id("com.isl.simpleapp:id/spinner_1");
//        AndroidElement element = driver.findElement(dropDown);
//        element.click();
        click(dropDown);
    }
    public void selectOperator(String op){
        final By dropDown = MobileBy.id("com.isl.simpleapp:id/spinner_1");
        selectDropdown(dropDown, op);
    }
    public void clickPlusOperator() {
        final By add = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
//        AndroidElement element = driver.findElement(add);
//        element.click();
        click(add);
    }
    public void clickMinusOperator() {
        final By minus = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
//        AndroidElement element = driver.findElement(minus);
//        element.click();
        click(minus);
    }
    public void clickDivOperator() {
        final By div = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
//        AndroidElement element = driver.findElement(div);
//        element.click();
        click(div);
    }
    public void clickTimeOperator() {
        final By time = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]");
//        AndroidElement element = driver.findElement(time);
//        element.click();
        click(time);
    }
    public void clickEqual() {
        final By eql = MobileBy.id("com.isl.simpleapp:id/acb_calculate");
//        AndroidElement element = driver.findElement(eql);
//        element.click();
        click(eql);
    }

    public void inputStringOnField(String string){
        final By secondField = MobileBy.id("com.isl.simpleapp:id/et_2");
        type(secondField, string);
    }
}
