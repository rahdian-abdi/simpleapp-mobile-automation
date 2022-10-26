package com.example.StepsDef;

import com.example.BaseTest;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class LoginStepDefinitions extends BaseTest {
    @Then("user can't click on sign-in button")
    public void user_can_t_click_on_sign_in_button() {
       assertFalse(loginPage.verifySignIn());
    }
}
