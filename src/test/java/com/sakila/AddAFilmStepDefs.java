//package com.tsi.v.sakila.connect.SpringbootSakilaProject;


/*import com.tsi.v.sakila.connect.SpringbootSakilaProject.film.Film;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AddAFilmStepDefs {

    Film film;
    Exception exception;

    @Given("the user inputed all the values")
    public void addNewFilm(){
        film = new Film();
        film.setTitle("The Northmen");
        film.setDescription("Viking");
        film.setRelease_year(2002);
        film.setLanguage_id(1);
        film.setOriginal_language_id(1);
        film.setRental_duration(3);
        film.setRental_rate(BigDecimal.valueOf(4.99));
        film.setLength(120);
        film.setRating("G");
        film.setSpecial_features("Trailers");
    }

    @When("the user submits the add a new film method")
    public void addFilm(){
        try {
            film = new Film();
        } catch (Exception e){
            exception = e;
        }
    }
    @Then("the film has all fields completed")
    public void the_film_has_all_fields_completed(){
        assertNotNull(film.getTitle(), "title not null");
        assertNotNull(film.getDescription(), "description not null");
        assertNotNull(film.getRelease_year(), "release year not null");
        assertNotNull(film.getLanguage_id(), "language id not null");
        assertNotNull(film.getOriginal_language_id(), "original language it not null");
        assertNotNull(film.getRental_duration(), "rental duration not null");
        assertNotNull(film.getRental_rate(), "rental rate not null");
        assertNotNull(film.getLength(), "length not null");
        assertNotNull(film.getRating(), "rating not null");
        assertNotNull(film.getSpecial_features(), "special features not null");
    }

}*/

