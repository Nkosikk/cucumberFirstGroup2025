Feature: Login

  Scenario Outline: As a user i want to login and verify that i am logged in
    Given I am  in the login page
    And I enter the username <username>
    And I enter the password <password>
    When I click login button
    And Landing page is displayed
    And I add item to cart
    And I click on the cart button
    Then Cart page is displayed
    And I click on the checkout button
    Then Checkout page is displayed
    And I enter the name<name>
    And I enter the lastname<lastname>
    And I enter the postal code<postalcode>
    And I click on continue button
    Then Overview page is displayed
    And I click on the finish button
    Then Confirmation page is displayed
    Examples:
      | username      | password      | name   | lastname | postalcode |
      | standard_user | secret_sauce  | Linda   | Ntanjana      | 12345      |
#      | performance_glitch_user | secret_sauce |

#  Scenario Outline: As a user i want to login and verify that i am logged in
#    Given I am  in the login page
#    And I enter the username <username>
#    And I enter the password <password>
#    When I click login button
#    Then Landing page is displayed
#    And I select the cart
#    Examples:
#      | username      | password     |
#      | standard_user | secret_sauce |
##      | problem_user | secret_sauce |
##      | performance_glitch_user | secret_sauce |