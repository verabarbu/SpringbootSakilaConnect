Feature: Actor Data Transfer Object
  Actor Entities can be created and updated using ActorDTOs

  Scenario: An actor is created with a full ActorNews
    Given the ActorNews has values for all not-null fields
    When I create a new Actor
    Then the Actor should have all not-null fields

