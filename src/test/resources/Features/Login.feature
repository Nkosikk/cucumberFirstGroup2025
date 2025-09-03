Feature: Login

  Scenario Outline:As a user I want to very am login
    Given I am in the login page
    And I enter the username <username>
    And I enter the password <password>
    When I click  the button
    And Landing page is displayed
    And I click  sauce-labs-bike-light add to cart button
    And I click sauce-labs-backpack add to cart button
    And I click the cart button
    And I confirm on the cart page
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

      | performance_glitch_user | secret_sauce |
