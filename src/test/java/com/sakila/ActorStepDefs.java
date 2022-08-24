//package com.sakila;

/*import com.sakila.actor.Actor;
import com.sakila.actor.ActorNews;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ActorStepDefs {

    Actor actor;
    ActorNews actorNews;
    Exception exception;

    @Given("the ActorNews has values for all not-null fields")
    public void createFullActorNews() {
        actorNews = new ActorNews();
        actorNews.setFirstName("First");
        actorNews.setLastName("Last");
    }

    @When("I create a new Actor")
    public void createActor() {
        try {
            actor = new Actor(actorNews);
        } catch (Exception ex) {
            exception = ex;
        }
    }

    @Then("the Actor should have all not-null fields")
    public void actorHasAllNotNullFields() {
        assertNotNull("firstName should not be null", actor.getFirstName());
        assertNotNull("lastName should not be null", actor.getLastName());
    }
}*/
