@Search @TaggedAgain
Feature: Search feature
  As a user
  I want to be able to search for given search term
  So that i can perform and navigate to link based on search term

  Background:
    Given the user is on home page

  @Search
  Scenario: Search for given search term
    And user provides the search term as BusinessCards
    Then user should navigate to respective page of BusinessCards

  @Search
  Scenario: Search for given search term
    And user provides the search term as abcfgh
    Then user should navigate to respective page of abcfgh

