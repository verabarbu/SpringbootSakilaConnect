package com.sakila;

import com.sakila.filmcategory.FilmCategoryKey;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilmCategoryKeyTest {
    @Test
    void test_filmCategoryKeyConstructor(){
        FilmCategoryKey testFilmCategoryKey = new FilmCategoryKey(1, 1);
        assertEquals(1, testFilmCategoryKey.getFilmId(), "Can't get value");
        assertEquals(1, testFilmCategoryKey.getCategoryId(), "Can't get value");
    }
    @Test
    void test_setFilmId() {
        FilmCategoryKey testFilmCategoryKey = new FilmCategoryKey(1, 1);
        testFilmCategoryKey.setFilmId(1);
        assertEquals(1, testFilmCategoryKey.getFilmId(), "Can't get id");
    }
    @Test
    void test_setCategoryId() {
        FilmCategoryKey testFilmCategoryKey = new FilmCategoryKey(1, 1);
        testFilmCategoryKey.setCategoryId(1);
        assertEquals(1, testFilmCategoryKey.getCategoryId(), "Can't get id");
    }
}
