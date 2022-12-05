package com.example.stepsdef;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class LongPressStepDefinitions extends BaseTest {

    @When("user click on the drawer")
    public void user_click_on_the_drawer() {
        longTap.clickDrawer();
    }
    @And("user go to list menu")
    public void userGoToListMenu() {
        longTap.clickListPage();
    }
    @When("long tap on first column")
    public void long_tap_on_first_column() {
        longTap.longTapListOne();
    }

    @And("user will get {string} message toast")
    public void userWillGetMessageToast(String toast) {
//        assertEquals(toast, listPage.getToastMessage());
        System.out.println(listPage.getToastMessage());
    }
}
