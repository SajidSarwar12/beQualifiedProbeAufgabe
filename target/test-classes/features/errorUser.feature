@ErrorUser
Feature: Error User Login

  @failure
  Scenario: Error Login
    Given User is on saucedemo Login Page
    When User logs in with username error_user and password secret_sauce
    And User clicks on Login button
    Then Error Message is displayed
    
  @success
  Scenario: Add to cart
    Given User is on saucedemo Homepage
    When User can see Swag Labs heading
    And User clicks on Add to cart button
    Then Cart is incremented with 1 item
    
  @success
  Scenario: Remove from Cart
    Given User is on saucedemo Homepage
    When User can see Swag Labs heading
    And Add to cart button is clicked
    And User clicks on Remove button
    Then Remove button is non-clickable
    
  @success
  Scenario: Article details
    Given User is on saucedemo Homepage
    When User can see Swag Labs heading
    And User clicks on Article Name
    Then Article details page is displayed
    
  @success
  Scenario: Add to cart
    Given User is on Article details page
    When User can see Swag Labs heading
    And User clicks on Add to cart button
    Then Cart is incremented with 1 item
    
  @success
  Scenario: Go to cart
    Given User is on Article details page
    When User can see Swag Labs heading
    And User clicks on Cart Icon on top right
    Then User Navigates to cart page
    
  @success
  Scenario: Checkout
    Given User is on cart page
    When User can see Swag Labs heading
    And User clicks on Checkout button
    Then User Navigates to Personal Information Page
    
  @success
  Scenario: Checkout: Your Information
    Given User is on Checkout Information page
    When User can see Swag Labs heading
    And User Enters First Name , Last Name and Zipcode
    And User clicks on Continue button
    Then User Navigates to Checkout Confirmation Page
    
   @success
  Scenario: Checkout: Overview
    Given User is on Checkout Overview page
    When User can see Swag Labs heading
    And User clicks on Finish button
    Then Finish button is non-clickable
    
  @success
  Scenario: Cancel
    Given User is on Checkout Overview page
    When User can see Swag Labs heading
    And User clicks on cancel button
    Then User Navigates to Home page
    
  @success
  Scenario: Logout
    Given User is on saucedemo Homepage
    When User clicks on hamburger menu icon
    And Menu is opened
    And User clicks Logout menu item
    Then User navigates to Login Page.