@Signup @TaggedAgain
Feature: Search feature
  As a user
  I want to be able to search for given search term
  So that i can perform and navigate to link based on search term

  Background:
    Given the user is on home page

  @Signup
  Scenario: Sign up on HomePage
    And user clicks the Sign in on HomePage
    And user selects I don't have account
    Then user should view SignUpPage
    And user provides firstName as Varuna
    And user provides lastName as  Srivastava
    And user provides email as
    And user provides password as Password
    And user provides confirm password as Password
    And user selects industry as Technology
    And user selects businessType as Software
    And user selects businessSize as More than 10 people
    And user click CreateAccount
    Then user should be naviagted to MyAccount as Varuna Srivastava


