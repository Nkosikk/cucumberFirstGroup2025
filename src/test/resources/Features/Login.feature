Feature: Login

  Scenario Outline:As a user I want to very am login
    Given I am in the login page
    And I enter the username <username>
    And I enter the password <password>
    When I click  the button
    Then Landing page is displayed
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
     # | problem_user            | secret_sauce |
      #| performance_glitch_user | secret_sauce |
