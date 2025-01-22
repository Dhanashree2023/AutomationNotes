# Login with valid credentials
Feature: login
Scenario: Successfull Login with Valid Credentials
Given User Launches the URL "https://www.saucedemo.com/"
When user enters Email as "standard_user" and password as "secret_sauce"
And click on Login 
Then Page title should be "Swag Labs"

#Cucumber Tags
@SmokeTest 
Scenario Outline: Successfull Login with Valid Credentials
Given User Launches the URL "https://www.saucedemo.com/"
When user enters Email as "<email>" and password as "<password>"
And click on Login 
Then Page title should be "Swag Labs"

Examples:
|email | password |
|standard_user |secret_sauce |


