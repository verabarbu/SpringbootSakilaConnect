package com.sakila;

import com.sakila.film.Film;
import com.sakila.film.FilmNews;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilmNewsTest {
    @Test
    void test_filmNewsConstructor(){
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 50, "G");
        assertEquals(Optional.of("Bourne Identity"), testFilmNews.getTitle(),"Can't get value" );
        assertEquals(Optional.of("Blackwater project"), testFilmNews.getDescription(),"Can't get value" );
        assertEquals(Optional.of(2002), testFilmNews.getReleaseYear(),"Can't get value" );
        assertEquals(Optional.of(1), testFilmNews.getLanguageId(),"Can't get value" );
        assertEquals(Optional.of(1), testFilmNews.getOriginalLanguageId(),"Can't get value" );
        assertEquals(Optional.of(50), testFilmNews.getLength(),"Can't get value" );
        assertEquals(Optional.of("G"), testFilmNews.getRating(),"Can't get value" );

    }

    @Test
    void test_setFilmId() {
        Film testFilm = new Film();
        testFilm.setFilmId(1010);
        assertEquals(1010, testFilm.getFilmId(), "Can't get id");
    }

    @Test
    void test_getTitle() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 50, "G");
        assertEquals(Optional.of("Bourne Identity"), testFilmNews.getTitle(), "Can't get title");
    }

    @Test
    void test_setTitle() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 50, "G");
        testFilmNews.setTitle("Bourne Identity");
        assertEquals(Optional.of("Bourne Identity"), testFilmNews.getTitle(), "Can't set title");
    }

    @Test
    void test_getDescription() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 50, "G");
        assertEquals(Optional.of("Blackwater project"), testFilmNews.getDescription(), "Can't get description");
    }

    @Test
    void test_setDescription() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 50, "G");
        testFilmNews.setDescription("Blackwater project");
        assertEquals(Optional.of("Blackwater project"), testFilmNews.getDescription(), "Can't set description");
    }
    @Test
    void test_getReleaseYear() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 50, "G");
        assertEquals(Optional.of(2002), testFilmNews.getReleaseYear(), "Can't get release year");
    }

    @Test
    void test_setReleaseYear() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1,50, "G");
        testFilmNews.setReleaseYear(2002);
        assertEquals(Optional.of(2002), testFilmNews.getReleaseYear(), "Can't set release year");
    }
    @Test
    void test_getLanguageId() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 50, "G");
        assertEquals(Optional.of(1), testFilmNews.getLanguageId(), "Can't get language id");
    }

    @Test
    void test_setLanguageId() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 50, "G");
        testFilmNews.setLanguageId(1);
        assertEquals(Optional.of(1), testFilmNews.getLanguageId(), "Can't set language id");
    }
    @Test
    void test_getOriginalLanguageId() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 50, "G");
        assertEquals(Optional.of(1), testFilmNews.getOriginalLanguageId(), "Can't get original language id");
    }

    @Test
    void test_setOriginalLanguageId() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 50,  "G");
        testFilmNews.setOriginalLanguageId(1);
        assertEquals(Optional.of(1), testFilmNews.getOriginalLanguageId(), "Can't set original language id");
    }
    
    @Test
    void test_getLength() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 50, "G");
        assertEquals(Optional.of(50), testFilmNews.getLength(), "Can't get length");
    }

    @Test
    void test_setLength() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 50, "G");
        testFilmNews.setLength(50);
        assertEquals(Optional.of(50), testFilmNews.getLength(), "Can't set length");
    }
    @Test
    void test_getRating() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1,null, 50, "G");
        assertEquals(Optional.of("G"), testFilmNews.getRating(), "Can't get rating");
    }

    @Test
    void test_setRating() {
        FilmNews testFilmNews = new FilmNews("Bourne Identity", "Blackwater project", 2002, 1, 1, 50, "G");
        testFilmNews.setRating("G");
        assertEquals(Optional.of("G"), testFilmNews.getRating(), "Can't set rating");
    }
    @Test
    void test_setCategoryIds(){
        FilmNews testFilmNews = new FilmNews();
        testFilmNews.setCategoryIds(Set.of(1, 2));
        assertEquals(Set.of(1, 2), testFilmNews.getCategoryIds(), "Can't set category ids");
    }
    @Test
    void test_setActorIds(){
        FilmNews testFilmNews = new FilmNews();
        testFilmNews.setActorIds(Set.of(1, 2));
        assertEquals(Set.of(1, 2), testFilmNews.getActorIds(), "Can't set actor ids");
    }
}
