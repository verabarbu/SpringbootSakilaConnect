package com.sakila;

import com.sakila.filmcategory.FilmCategory;
import com.sakila.filmcategory.FilmCategoryKey;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilmCategoryTest {
    FilmCategory testFilmCategory = new FilmCategory();
    @Test
    void test_setFilmCategoryKey(){
        FilmCategoryKey filmCategoryKey = new FilmCategoryKey();
        testFilmCategory.setFilmCategoryKey(filmCategoryKey);
        assertEquals(filmCategoryKey, testFilmCategory.getFilmCategoryKey(), "Can't get film actor key");
    }
}
