package com.tsi.v.sakila.connect.SpringbootSakilaProject;

import com.tsi.v.sakila.connect.SpringbootSakilaProject.film.Film;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmTest {
    @Test
    public void test_getFilm_id() {
        Film testFilm = new Film();
        testFilm.setFilm_id(1010);
        assertEquals(1010, testFilm.getFilm_id(), "Can't get id");
    }

    @Test
    public void test_getTitle() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        assertEquals("Bourne Identity", testFilm.getTitle(), "Can't get title");
    }

    @Test
    public void test_setTitle() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        testFilm.setTitle("Bourne Identity");
        assertEquals("Bourne Identity", testFilm.getTitle(), "Can't set title");
    }

    @Test
    public void test_getDescription() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        assertEquals("Blackwater project", testFilm.getDescription(), "Can't get description");
    }

    @Test
    public void test_setDescription() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        testFilm.setDescription("Blackwater project");
        assertEquals("Blackwater project", testFilm.getDescription(), "Can't set description");
    }
    @Test
    public void test_getRelease_year() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        assertEquals(2002, testFilm.getRelease_year(), "Can't get release year");
    }

    @Test
    public void test_setRelease_year() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        testFilm.setRelease_year(2002);
        assertEquals(2002, testFilm.getRelease_year(), "Can't set release year");
    }
    @Test
    public void test_getLanguage_id() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        assertEquals(1, testFilm.getLanguage_id(), "Can't get language id");
    }

    @Test
    public void test_setLanguage_id() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        testFilm.setLanguage_id(1);
        assertEquals(1, testFilm.getLanguage_id(), "Can't set language id");
    }
    @Test
    public void test_getOriginal_language_id() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        assertEquals(1, testFilm.getOriginal_language_id(), "Can't get original language id");
    }

    @Test
    public void test_setOriginal_language_id() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        testFilm.setOriginal_language_id(1);
        assertEquals(1, testFilm.getOriginal_language_id(), "Can't set original language id");
    }
    @Test
    public void test_getRental_duration() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        assertEquals(3, testFilm.getRental_duration(), "Can't get rental duration");
    }

    @Test
    public void test_setRental_duration() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        testFilm.setRental_duration(3);
        assertEquals(3, testFilm.getRental_duration(), "Can't set rental duration");
    }
    @Test
    public void test_getLength() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        assertEquals(50, testFilm.getLength(), "Can't get length");
    }

    @Test
    public void test_setLength() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        testFilm.setLength(3);
        assertEquals(3, testFilm.getLength(), "Can't set length");
    }
    @Test
    public void test_getRating() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        assertEquals("G", testFilm.getRating(), "Can't get rating");
    }

    @Test
    public void test_setRating() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        testFilm.setRating("G");
        assertEquals("G", testFilm.getRating(), "Can't set rating");
    }
    @Test
    public void test_getSpecial_features() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        assertEquals("Trailers", testFilm.getSpecial_features(), "Can't get special features");
    }

    @Test
    public void test_setSpecial_features() {
        Film testFilm = new Film("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers");
        testFilm.setSpecial_features("Trailers");
        assertEquals("Trailers", testFilm.getSpecial_features(), "Can't set special features");
    }


}
