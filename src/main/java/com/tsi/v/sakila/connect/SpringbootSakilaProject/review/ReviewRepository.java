package com.tsi.v.sakila.connect.SpringbootSakilaProject.review;

import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Integer> {

    Iterable<Review> findAllByFilmId(Integer filmId);
    Iterable<Review> findAllByTitle(String title);
}
