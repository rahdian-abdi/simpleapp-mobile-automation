package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {

  public boolean verifySignIn() {
    final By signButton = MobileBy.id("com.isl.simpleapp:id/login");
    return isEnabled(signButton);
  }

}
