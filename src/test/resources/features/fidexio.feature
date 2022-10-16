
Feature: Login to Fidexio with valid credentials

Background:
  Given user goes to the fidexio login page


  Scenario: User goes to the login page
    Then user lands the login page


  Scenario: Login as posmanager
    When user enter posmanager username
    And user enter posmanager pwssword
    And user click on login button
    Then user should see posmanager dashboard


  Scenario: Login as salemanager
    When user enter salemanager username
    And user enter salemanager pwssword
    But user click on login button
    Then user should see salemanager dashboard