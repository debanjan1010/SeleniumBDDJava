@UI
Feature: As a user of the application I want to validate login functionality

  Background: Login in the application
    When User entered following credentials
      | Username      | password     |
      | standard_user | secret_sauce |
    And User has clicked on the login button

  Scenario: Validate login functionality with valid username and password
    Given User has launched the url "https://www.saucedemo.com/"
    When User entered following credentials
      | Username      | password     |
      | standard_user | secret_sauce |
    And User has clicked on the login button
    Then User should see "Products" in homepage

  @DataTableExample
  Scenario: Validate login functionality with invalid username and password
    Given User has launched the url "https://www.saucedemo.com/"
    When User entered following credentials
      | Username      | password     |
      | standard_user | secret_sauce |
    And User has clicked on the login button
    Then User should see "Products" in homepage

  @ScenarioOutlineExample
  Scenario Outline: Validate login functionality
    Given User has launched the url "https://www.saucedemo.com/"
    When User entered "<username>" and "<password>"
    And User has clicked on the login button
    Then User should see "Products" in homepage

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      | standard_user | sample1      |

  @HooksTest
  Scenario: Validate login functionality with invalid username and password
    When User entered following credentials
      | Username      | password     |
      | standard_user | secret_sauce |
    And User has clicked on the login button
    Then User should see "Products" in homepage

  @Chrome
  Scenario: Validate login functionality with invalid username and password
    When User entered following credentials
      | Username      | password     |
      | standard_user | secret_sauce |
    And User has clicked on the login button
    Then User should see "Products" in homepage

  @sample @Firefox
  Scenario: Validate login functionality with invalid username and password
    When User entered following credentials
      | Username      | password     |
      | standard_user | secret_sauce |
    And User has clicked on the login button
    Then User should see "Products" in homepage

  @Background @Chrome
  Scenario: Validate Products in home page
    Then User should see "Products" in homepage

  @Background @Chrome
  Scenario: Validate Swag Labs in home page
    Then User should see "Swag Labs" in homepage

  @PageObjectModel @Chrome
  Scenario: Validate Swag Labs in home page
    Then User should see "Swag Labs" in homepage
