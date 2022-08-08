Feature: Add a film
  As a user
  I want to add a film
  So that it displays in the database

  Scenario: User adds a film
    Given the user inputed the title
    And the user inputed the description
    And the user inputed the release_year
    And the user inputed the language_id
    When the user submits the set method
    Then the film is added
