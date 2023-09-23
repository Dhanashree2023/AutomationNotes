Feature: Login with valid credentials

      Scenario: Successful login with valid credentials
      Given User is on the Login Page
       When User enters Credentials
         | standard_user | secret_sauce |
      Then User should see the  Home page
      
       Scenario: Successful login with valid credentials Ex map

      Given User is on the Login Page

       When User enters Credentials details
         | username | password |
         | standard_user | secret_sauce |
      
      Then User should see the  Home page