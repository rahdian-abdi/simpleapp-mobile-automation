package com.example.stepsdef;

import com.example.BaseTest;
import io.cucumber.java.en.And;

public class MultiTapStepDefinitions extends BaseTest {
    @And("multi tap on first column")
    public void multiTapOnFirstColumn() {
        multiTap.multiTapListOne();
    }
}
