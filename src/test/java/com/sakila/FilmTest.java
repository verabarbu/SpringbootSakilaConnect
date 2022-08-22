package com.sakila;

import com.sakila.film.Film;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmTest {
    Film testFilm = new Film();
    @Test
    void test_setFilmId() {
        testFilm.setFilmId(1010);
        assertEquals(1010, testFilm.getFilmId(), "Can't get id");
    }
    @Test
    void test_setTitle() {
        testFilm.setTitle("Bourne Identity");
        assertEquals("Bourne Identity", testFilm.getTitle(), "Can't get title");
    }
    @Test
    void test_setDescription() {
        testFilm.setDescription("Blackwater project");
        assertEquals("Blackwater project", testFilm.getDescription(), "Can't get description");
    }
    @Test
    void test_setReleaseYear() {
        testFilm.setReleaseYear(2002);
        assertEquals(2002, testFilm.getReleaseYear(), "Can't get release year");
    }
    @Test
    void test_setLanguageId() {
        testFilm.setLanguageId(1);
        assertEquals(1, testFilm.getLanguageId(), "Can't get language id");
    }
    @Test
    void test_setOriginalLanguageId() {
        testFilm.setOriginalLanguageId(1);
        assertEquals(1, testFilm.getOriginalLanguageId(), "Can't get original language id");
    }
    @Test
    void test_setLength() {
        testFilm.setLength(50);
        assertEquals(50, testFilm.getLength(), "Can't get length");
    }
    @Test
    void test_setRating() {
        testFilm.setRating("G");
        assertEquals("G", testFilm.getRating(), "Can't get rating");
    }
    @Test
    void test_setFilmActor(){
        Set<com.sakila.actor.Actor> filmActor = new java.util.HashSet<>();
        testFilm.setFilmActor(filmActor);
        assertEquals(filmActor, testFilm.getFilmActor(), "Can't film actor");
    }
    @Test
    void test_setFilmCategory(){
        List<com.sakila.category.Category> filmCategory = new java.util.ArrayList<>();
        testFilm.setFilmCategory(filmCategory);
        assertEquals(filmCategory, testFilm.getFilmCategory(), "Can't get film category");
    }

}
