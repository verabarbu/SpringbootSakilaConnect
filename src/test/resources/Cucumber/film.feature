Feature: Film Data Transfer Object
  Film Entities can be created and updated using FilmDTOs

  Scenario: A film is created with a full DTO
    Given the DTO has values for all fields
    When I create a new Film
    Then the Film should have all fields
