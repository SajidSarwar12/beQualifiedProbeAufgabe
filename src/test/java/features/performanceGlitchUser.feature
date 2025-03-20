@Homepage
Feature: Performance Glitch User Login

   @success
  Scenario: Performance_glitch Login
    Given User is on saucedemo Login Page
    When User logs in with username performance_glitch_user and password secret_sauce
    And User clicks on Login button
    Then Homepage is displayed after a delay