package com.sakila.actor;


import com.sakila.film.Film;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="actor")

public class Actor {

    @Id
    @Column(name="actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actorId;

    //@ManyToMany relationship with Film
    @ManyToMany(mappedBy = "filmActor")
    Set<Film> actorFilm;

    //Attributes
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

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

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
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
