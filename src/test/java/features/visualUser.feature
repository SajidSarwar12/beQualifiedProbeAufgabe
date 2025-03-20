@Homepage
Feature: Visual User Login

  @success
  Scenario: Visual Login
    Given User is on saucedemo Login Page
    When User logs in with username Visual_user and password secret_sauce
    And User clicks on Login button
    Then Last Homepage is displayed