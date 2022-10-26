package com.example.StepsDef;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class CalculationStepDefinitions extends BaseTest {
    @Given("user is already login")
    public void userIsAlreadyLogin() {
        loginStep.fullLogin();
        assertTrue(calculatorPage.validatePage());
    }
    @When("user input number {int} on angka1 field")
    public void user_input_number_on_angka1_field(Integer number) {
        calculatorStep.inputNumber1(number);
    }
    @When("user input number {int} on angka2 field")
    public void user_input_number_on_angka2_field(Integer number) {
        calculatorStep.inputNumber2(number);
    }
    @And("user click dropdown operator")
    public void userClickDropdownOperator() {
        calculatorStep.clickDropDown();
    }
    @And("user select {string} operator")
    public void userSelectOperator(String op) {
        switch (op){
            case "+":
                calculatorStep.clickPlusOperator();
                break;
            case "-":
                calculatorStep.clickMinusOperator();
                break;
            case "/":
                calculatorStep.clickDivOperator();
                break;
            case "x":
                calculatorStep.clickTimeOperator();
                break;
        }
    }
    @And("user click on equal button")
    public void userClickOnEqualButton() {
        calculatorStep.clickEqual();
    }
    @Then("result should be {int}")
    public void result_should_be(Integer result) {
        String temp = "Hasil : ";
        assertEquals(temp+result, calculatorPage.validateResult());
    }
    @When("user input character {string} on angka2 field")
    public void user_input_character_on_angka2_field(String string) {
        calculatorStep.inputStringOnField(string);
    }
    @Then("user can't click on equal button")
    public void user_can_t_click_on_equal_button() {
        assertFalse(calculatorPage.validateButtonEnabled());

    }
}
