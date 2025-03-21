Feature: Login

  Scenario Outline: As a user i want to login and verify that i am logged in
    Given I am  in the login page
    And I enter the username <username>
    And I enter the password <password>
    When I click login button
    And Landing page is displayed
    And I click sauce-labs-bike-light add to cart button
    And I click sauce-labs-backpack add to cart button
    And I click the cart button
    And I confirm on the cart page
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |



#      | problem_user | secret_sauce |
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