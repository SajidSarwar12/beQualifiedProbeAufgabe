


@Login
Feature: Application Login

  @success
  Scenario: standard Login
    Given User is on saucedemo Login Page
    When User logs in with username standard_user and password secret_sauce
    And User clicks on Login button
    Then Homepage is displayed
    
    
  @failure
  Scenario: Lockedout Login
    Given User is on saucedemo Login Page
    When User logs in with username locked_out_user and password secret_sauce
    And User clicks on Login button
    Then Lockedout error Message is displayed
   
   @failure
  Scenario: Problem Login
    Given User is on saucedemo Login Page
    When User logs in with username problem_user and password secret_sauce
    And User clicks on Login button
    Then Problem Message is displayed
    
    @success
  Scenario: Performance_glitch Login
    Given User is on saucedemo Login Page
    When User logs in with username performance_glitch_user and password secret_sauce
    And User clicks on Login button
    Then Homepage is displayed after a delay
    
    @failure
  Scenario: Error Login
    Given User is on saucedemo Login Page
    When User logs in with username Error_user and password secret_sauce
    And User clicks on Login button
    Then Homepage is displayed
    
    @success
  Scenario: Visual Login
    Given User is on saucedemo Login Page
    When User logs in with username Visual_user and password secret_sauce
    And User clicks on Login button
    Then Homepage is displayed
