package com.sakila;

import com.sakila.category.Category;
import com.sakila.film.Film;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CategoryTest {
    Category testCategory = new Category("Animation");
    @Test
    void test_actorConstructor(){

    }
    @Test
    void test_getCategoryId() {
        Category testCategory = new Category("Animation");
        testCategory.setCategoryId(2);
        assertEquals(2, testCategory.getCategoryId(), "Can't get id");
    }
    @Test
    void test_getName() {
        Category testCategory = new Category("Animation");
        assertEquals("Animation", testCategory.getName(), "Can't get name");
    }

    @Test
    void test_setName() {
        Category testCategory = new Category("Animation");
        testCategory.setName("Animation");
        assertEquals("Animation", testCategory.getName(), "Can't set name");
    }

    @Test
    void test_setFilms(){
        List<Film> films = new java.util.ArrayList<>();
        testCategory.setFilms(films);
        assertEquals(films, testCategory.getFilms(), "Can't get film category");
    }
}
