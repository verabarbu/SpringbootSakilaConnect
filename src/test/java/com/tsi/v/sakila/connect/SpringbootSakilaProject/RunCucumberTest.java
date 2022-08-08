package com.tsi.v.sakila.connect.SpringbootSakilaProject;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/cucumber",
        glue = "src/test/java/com/tsi/v/sakila/connect/SpringbootSakilaProject/AddAFilmStepDefs.java"
)

public class RunCucumberTest {
}
