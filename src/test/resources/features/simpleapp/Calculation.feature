@android @login
Feature: Math Function
  Scenario Outline: Verify that calculation function is working
    When user input number <number1> on angka1 field
    And user input number <number2> on angka2 field
    And user click dropdown operator
    And user select "<operator>" operator
    And user click on equal button
    Then result should be <result>
    Examples:
      |number1|number2|operator|result|
      |5      |5      |+       |10    |
      |10     |5      |-       |5     |
      |10     |7      |x       |70    |
      |10     |2      |/       |5     |

  Scenario: Verify that equal button is disabled when field filled by character
    When user input number 1 on angka1 field
    And user input character "s" on angka2 field
    Then user can't click on equal button

  Scenario: Verify that equal button is disabled when both field empty
    When user input number 1 on angka1 field
    Then user can't click on equal button

  Scenario: Verify that sign-in button is disabled when password field empty
    Given user is on login page
    When user input username "admin"
    Then user can't click on sign-in button

  Scenario: Verify that long press is enabled in List Menu
    When user click on the drawer
    And user go to list menu
    And long tap on first column
    And user will get "List ke-1" message toast

  Scenario: Verify that multi tap is enabled in List Menu
    When user click on the drawer
    And user go to list menu
    And multi tap on first column