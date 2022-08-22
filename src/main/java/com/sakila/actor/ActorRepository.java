package com.sakila.actor;

import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor, Integer> {

    Iterable<Actor> findByFirstName(String firstName);


}
