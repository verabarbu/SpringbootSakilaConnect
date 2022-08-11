package com.tsi.v.sakila.connect.SpringbootSakilaProject.category;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
    Optional<Category> findCategoryByName(String name);
}
