package com.tsi.v.sakila.connect.SpringbootSakilaProject;

import com.tsi.v.sakila.connect.SpringbootSakilaProject.film.Film;
import com.tsi.v.sakila.connect.SpringbootSakilaProject.film.FilmNews;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilmTest {

    @Test
    void test_getFilm_id() {
        Film testFilm = new Film();
        testFilm.setFilm_id(1010);
        assertEquals(1010, testFilm.getFilm_id(), "Can't get id");
    }

    @Test
    void test_getTitle() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        assertEquals(Optional.of("Bourne Identity"), testFilmNews.getTitle(), "Can't get title");
    }

    @Test
    void test_setTitle() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        testFilmNews.setTitle("Bourne Identity");
        assertEquals(Optional.of("Bourne Identity"), testFilmNews.getTitle(), "Can't set title");
    }

    @Test
    void test_getDescription() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        assertEquals(Optional.of("Blackwater project"), testFilmNews.getDescription(), "Can't get description");
    }

    @Test
    void test_setDescription() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        testFilmNews.setDescription("Blackwater project");
        assertEquals(Optional.of("Blackwater project"), testFilmNews.getDescription(), "Can't set description");
    }
    @Test
    void test_getRelease_year() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        assertEquals(Optional.of(2002), testFilmNews.getRelease_year(), "Can't get release year");
    }

    @Test
    void test_setRelease_year() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        testFilmNews.setRelease_year(2002);
        assertEquals(Optional.of(2002), testFilmNews.getRelease_year(), "Can't set release year");
    }
    @Test
    void test_getLanguage_id() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        assertEquals(Optional.of(1), testFilmNews.getLanguage_id(), "Can't get language id");
    }

    @Test
    void test_setLanguage_id() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        testFilmNews.setLanguage_id(1);
        assertEquals(Optional.of(1), testFilmNews.getLanguage_id(), "Can't set language id");
    }
    @Test
    void test_getOriginal_language_id() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        assertEquals(Optional.of(1), testFilmNews.getOriginal_language_id(), "Can't get original language id");
    }

    @Test
    void test_setOriginal_language_id() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        testFilmNews.setOriginal_language_id(1);
        assertEquals(Optional.of(1), testFilmNews.getOriginal_language_id(), "Can't set original language id");
    }
    @Test
    void test_getRental_duration() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        assertEquals(Optional.of(3), testFilmNews.getRental_duration(), "Can't get rental duration");
    }

    @Test
    void test_setRental_duration() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        testFilmNews.setRental_duration(3);
        assertEquals(Optional.of(3), testFilmNews.getRental_duration(), "Can't set rental duration");
    }
    @Test
    void test_getLength() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        assertEquals(Optional.of(50), testFilmNews.getLength(), "Can't get length");
    }

    @Test
    void test_setLength() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        testFilmNews.setLength(50);
        assertEquals(Optional.of(50), testFilmNews.getLength(), "Can't set length");
    }
    @Test
    void test_getRating() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        assertEquals(Optional.of("G"), testFilmNews.getRating(), "Can't get rating");
    }

    @Test
    void test_setRating() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        testFilmNews.setRating("G");
        assertEquals(Optional.of("G"), testFilmNews.getRating(), "Can't set rating");
    }
    @Test
    void test_getSpecial_features() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        assertEquals(Optional.of("Trailers"), testFilmNews.getSpecial_features(), "Can't get special features");
    }

    @Test
    void test_setSpecial_features() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        testFilmNews.setSpecial_features("Trailers");
        assertEquals(Optional.of("Trailers"), testFilmNews.getSpecial_features(), "Can't set special features");
    }

    @Test
    void test_getCategory_id(){
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        assertEquals(Optional.of(1), testFilmNews.getCategory_id(), "Can't get category id");
    }
    @Test
    void test_setCategory_id(){
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 3, null, 50, null, "G", "Trailers", 1);
        testFilmNews.setCategory_id(1);
        assertEquals(Optional.of(1), testFilmNews.getCategory_id(), "Can't set category id" );
    }


}
