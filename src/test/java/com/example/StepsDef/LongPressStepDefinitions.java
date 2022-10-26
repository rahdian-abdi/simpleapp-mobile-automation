package com.example.StepsDef;

import com.example.BaseTest;
import io.cucumber.java.en.When;

public class LongPressStepDefinitions extends BaseTest {

    @When("user click on the drawer")
    public void user_click_on_the_drawer() {
        longTap.clickDrawer();
    }

    @When("long tap on first column")
    public void long_tap_on_first_column() {
        longTap.longTapListOne();
    }
}
