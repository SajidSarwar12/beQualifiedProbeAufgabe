@Homepage
Feature: Application Homepage

  @success
  Scenario: Article details
    Given User is on saucedemo Homepage
    When User can see Swag Labs heading
    And User clicks on Article Name
    Then Article details page is displayed
    
    
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
    Then Cart is decremented with 1 item
    
  @success
  Scenario: Change Sorting filters
    Given User is on saucedemo Homepage
    When User can see Swag Labs heading
    And Default Ascending filter is active
    And User clicks on filter dropdown
    And User clicks on Name (Z to A) filter
    Then Name (Z to A filter) is activated