@Homepage
Feature: Problem User Login

   @failure
  Scenario: Problem Login
    Given User is on saucedemo Login Page
    When User logs in with username problem_user and password secret_sauce
    And User clicks on Login button
    Then Problem Message is displayed