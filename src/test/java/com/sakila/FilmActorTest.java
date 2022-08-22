package com.sakila;

import com.sakila.filmactor.FilmActor;
import com.sakila.filmactor.FilmActorKey;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmActorTest {
    FilmActor testFilmActor = new FilmActor();
    @Test
    void test_setFilmActorKey(){
        FilmActorKey filmActorKey = new FilmActorKey();
        testFilmActor.setFilmActorKey(filmActorKey);
        assertEquals(filmActorKey, testFilmActor.getFilmActorKey(), "Can't get film actor key");
    }
}
