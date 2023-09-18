# comment -Feature File for Add new customers
Feature: Customers
Scenario: Add New Customer
Given User Launch Chrome browser 
	When User opens URL "http://admin-demo.nopcommerce.com/login" 
	And User enters Email as "admin@yourstore.com" and Password as "admin" 
	And Click on Login 
   Then User can view dashboard
   When user clicks on customers Menu
   And click on customers Menu Item
   And click on Add New button
   Then user can view Add new customer page
   When user enter customer info
   And click on Save button
   Then user can view confirmation message as "The new customer has been added successfully."
   And close browser