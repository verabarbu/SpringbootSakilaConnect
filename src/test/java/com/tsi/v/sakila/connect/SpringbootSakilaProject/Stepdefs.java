package com.tsi.v.sakila.connect.SpringbootSakilaProject;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsItFriday {
    static String isItFriday(String today) {
        return today.equals("Friday") ? "Yes" : "No";
    }
}

public class Stepdefs {
    private String today;
    private String actualAnswer;

    @Given("today is {string}")
    public void today_is_string(String day) {
        today = day;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
