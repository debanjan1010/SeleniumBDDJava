#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@UI
Feature: As a user of the application I want to validate login functionality

	@FirstTestCase
  Scenario: Validate login functionality with valid username and password
    Given User has launched the url "https://www.saucedemo.com/"
    When User entered following credentials
      | Username      | password     |
      | standard_user | secret_sauce |
    And User has clicked on the login button
    Then User should see "Products" in homepage

  Scenario: Validate login functionality with invalid username and password
    Given User has launched the url "https://www.saucedemo.com/"
    When User entered following credentials
      | Username      | password      |
      | standard_user | secret_sauce1 |
    And User has clicked on the login button
    Then User should see "Products" in homepage
