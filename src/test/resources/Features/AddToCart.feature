Feature: Add To Cart

  Scenario Outline: As a user i want to add aa product to the cart and verify that the product is added
    Given I am  in the login page
    And I enter the username <username>
    And I enter the password <password>
    When I click login button
    And Landing page is displayed
    And I click on the <product>
    Then I verify the <product> details
##    And I click on the add to cart button
    Examples:
      | username | password | product |
      | standard_user | secret_sauce | Sauce Labs Backpack |