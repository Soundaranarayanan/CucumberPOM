
Feature: Login to HRM application

 @ValidCredentials
  Scenario: Login with valid credentials
    Given user is on the Login Page "https://opensource-demo.orangehrmlive.com/"
    When user enters unername and password
    Then User should be able to login successfully and new page open
