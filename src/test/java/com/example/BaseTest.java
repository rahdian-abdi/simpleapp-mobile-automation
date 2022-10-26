package com.example;

import com.example.app.pages.CalculatorPage;
import com.example.app.pages.ListPage;
import com.example.app.pages.LoginPage;
import com.example.app.pages.NavigationMenu;
import com.example.app.steps.CalculatorStep;
import com.example.app.steps.LoginStep;
import com.example.app.steps.LongTapStep;
import com.example.app.steps.MultiTapStep;

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
