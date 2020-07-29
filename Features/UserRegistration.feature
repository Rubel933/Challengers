@UserRegistration
Feature: user registration
Scenario Outline: register a valid user
Given I am on new tours homepage
When I click on the register link
And I enter "<first name> <"last name>" "<phone number>" "<email>" "<user name>" "<password>"  "<confirm password>"
And i click on submit button
Then I receive confirmation page and message

Examples:
|first name | last name  | phone number  |     email      |   user name   |  password   |confirm password|
|Rubel      |    Ahmed   |7777777777     |mypet@gmail.com  |  Rubrel       |password2   |   password2     |