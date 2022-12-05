package com.example.stepsdef;

import com.example.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class LoginStepDefinitions extends BaseTest {
    @Given("user is on login page")
    public void userIsOnLoginPage() {
        // EMPTY
    }

    @When("user input username {string}")
    public void userInputUsername(String username) {
        loginStep.inputUsername(username);
    }
    @Then("user can't click on sign-in button")
    public void user_can_t_click_on_sign_in_button() {
       assertFalse(loginPage.verifySignIn());
    }
}
