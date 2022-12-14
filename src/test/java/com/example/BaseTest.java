package com.example;

import com.example.pages.CalculatorPage;
import com.example.pages.ListPage;
import com.example.pages.LoginPage;
import com.example.pages.NavigationMenu;
import com.example.steps.CalculatorStep;
import com.example.steps.LoginStep;
import com.example.steps.LongTapStep;
import com.example.steps.MultiTapStep;

public class BaseTest {

  public LoginPage loginPage = new LoginPage();
  public LoginStep loginStep = new LoginStep();
  public CalculatorPage calculatorPage = new CalculatorPage();
  public CalculatorStep calculatorStep = new CalculatorStep();
  public NavigationMenu navigationMenu = new NavigationMenu();
  public ListPage listPage = new ListPage();
  public LongTapStep longTap = new LongTapStep();
  public MultiTapStep multiTap = new MultiTapStep();

}
