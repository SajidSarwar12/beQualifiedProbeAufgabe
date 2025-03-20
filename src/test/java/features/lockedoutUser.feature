@Login
Feature: lockedout User Login

@failure
  Scenario: Lockedout Login
    Given User is on saucedemo Login Page
    When User logs in with username locked_out_user and password secret_sauce
    And User clicks on Login button
    Then Lockedout error Message is displayed