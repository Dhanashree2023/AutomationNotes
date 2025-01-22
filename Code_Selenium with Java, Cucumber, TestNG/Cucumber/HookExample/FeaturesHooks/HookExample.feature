Feature: Test Hooks


Background: login
  Given I navigate to the login page
	When I submit username and password
	Then I should be logged in 
  

Scenario: This scenario is to test hooks functionality
	Given this is the first step
	When this is the second step
	Then this is the third step
	
	
	Scenario: Home Page functionality
	Given this is the manual step
	When this is the Automation step
