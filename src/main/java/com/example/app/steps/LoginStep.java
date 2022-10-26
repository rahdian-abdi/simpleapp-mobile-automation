package com.example.app.steps;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;

public class LoginStep extends BasePageObject {
    public void inputUsername(String username) {
        type(MobileBy.id("com.isl.simpleapp:id/username"), username);
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
