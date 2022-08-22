package com.sakila.film;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmRepository extends CrudRepository<Film, Integer> {
    Iterable<Film> findByTitle(String title);
    List<Film> findByFilmActorFirstNameAndFilmActorLastName(String firstName, String lastName);
    List<Film> findByFilmCategoryName(String name);

}
