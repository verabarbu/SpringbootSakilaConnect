package com.sakila;

import com.sakila.filmactor.FilmActorKey;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilmActorKeyTest {
    @Test
    void test_filmActorKeyConstructor(){
        FilmActorKey testFilmActorKey = new FilmActorKey(1, 1);
        assertEquals(1, testFilmActorKey.getFilmId(), "Can't get value");
        assertEquals(1, testFilmActorKey.getActorId(), "Can't get value");
    }
    @Test
    void test_setFilmId() {
        FilmActorKey testFilmActorKey = new FilmActorKey(1, 1);
        testFilmActorKey.setFilmId(1);
        assertEquals(1, testFilmActorKey.getFilmId(), "Can't get id");
    }
    @Test
    void test_setActorId() {
        FilmActorKey testFilmActorKey = new FilmActorKey(1, 1);
        testFilmActorKey.setActorId(1);
        assertEquals(1, testFilmActorKey.getActorId(), "Can't get id");
    }
}
