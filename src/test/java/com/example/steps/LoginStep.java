package com.example.steps;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LoginStep extends BasePageObject {
    public void inputUsername(String username) {
        final By usernameField = MobileBy.id("com.isl.simpleapp:id/username");
        type(usernameField, username);
    }

    public void inputPassword(String password) {
        type(MobileBy.id("com.isl.simpleapp:id/password"), password);
    }

    public void clickLoginBtn() {
        click(MobileBy.id("com.isl.simpleapp:id/login"));
    }

    public void fullLogin() {
        inputUsername("admin");
        inputPassword("admin");
        clickLoginBtn();
    }
}
