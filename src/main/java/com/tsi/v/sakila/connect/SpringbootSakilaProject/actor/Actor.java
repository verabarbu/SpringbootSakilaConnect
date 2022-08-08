package com.tsi.v.sakila.connect.SpringbootSakilaProject.actor;


import com.tsi.v.sakila.connect.SpringbootSakilaProject.film.Film;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="actor")

public class Actor {

    @Id
    @Column(name="actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actor_id;

    //@ManyToMany relationship with Film
    @ManyToMany(mappedBy = "filmActor")
    Set<Film> actorFilm;

    //Attributes
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    //Constructor
    public Actor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Data Transfer Object Constructor
    public Actor(ActorNews actorNews){
        this.updateFromActorNews(actorNews);
    }

    //Empty Constructor
    public Actor(){}

    //Methods
    public void updateFromActorNews(ActorNews actorNews){
        this.firstName = actorNews.getFirstName().orElse(firstName);
        this.lastName = actorNews.getLastName().orElse(lastName);

    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
