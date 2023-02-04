@Login
  Feature: Login
    As a user I want to login website source demo

    Scenario Outline: Invalid login
      Given User open the website sauce demo
      When User input "<userName>" as userName and Input "<password>" as password
      Then User see error "<errorText>" on login page
      Examples:
        | userName      | password     | errorText                                                                 |
        | standard_user |              | Epic sadface: Password is required                                        |
        |               | secret_sauce | Epic sadface: Username is required                                        |
        | asd           | 123          | Epic sadface: Username and password do not match any user in this service |

    Scenario: Normal login
      Given User open the website sauce demo
      When User input "standard_user" as userName and Input "secret_sauce" as password
      Then User already on landing page