Feature: Login

Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User enters Credentials to LogIn
    | student | Password123 |
	Then Message displayed Login Successfully