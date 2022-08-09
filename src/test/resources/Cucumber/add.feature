Feature: Create a film
  As a user
  I want to create a film
  So that it displays in the database

  Scenario: User creates a film
    Given the user inputed all the values
    When the user submits the add a new film method
    Then the film has all fields completed
