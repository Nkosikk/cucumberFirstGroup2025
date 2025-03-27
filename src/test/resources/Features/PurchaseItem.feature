@Regression @Sanity @PurchaseItem
Feature: purchase Item

  Scenario Outline: As a user i want to purchase an item
    Given I am  in the login page
    And I enter the username <username>
    And I enter the password <password>
    When I click login button
    And Landing page is displayed
    And I click sauce-labs-bike-light add to cart button
    And I click sauce-labs-backpack add to cart button
    And I click the cart button
    And I confirm on the cart page
    And I click the checkout button
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |



#  Scenario Outline: As a user i want to purchase an item
#    Given I am  in the login page
#    And I enter the username <username>
#    And I enter the password <password>
#    When I click login button
#    And Landing page is displayed
#    And I click sauce-labs-bike-light add to cart button
#    And I click sauce-labs-backpack add to cart button
#    And I click the cart button
#    And I confirm on the cart page
#    Examples:
#      | username      | password     |
#      | performance_glitch_user | secret_sauce |