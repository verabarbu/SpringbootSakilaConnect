package com.sakila;

import com.sakila.filmCategory.FilmCategory;
import com.sakila.filmCategory.FilmCategoryKey;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmCategoryTest {
    FilmCategory testFilmCategory = new FilmCategory();
    @Test
    void test_filmActorConstructor(){

    }
    @Test
    void test_setFilmCategoryKey(){
        FilmCategoryKey filmCategoryKey = new FilmCategoryKey();
        testFilmCategory.setFilmCategoryKey(filmCategoryKey);
        assertEquals(filmCategoryKey, testFilmCategory.getFilmCategoryKey(), "Can't get film actor key");
    }
}
