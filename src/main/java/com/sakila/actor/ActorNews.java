package com.sakila.actor;

import java.util.Optional;

//Data Transfer Object for PATCH Request
public class ActorNews {

    //Attributes
    private String firstName;
    private String lastName;

    //Constructor
    public ActorNews(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Empty Constructor
    public ActorNews(){}

    //Methods
    public Optional<String> getFirstName(){return Optional.ofNullable(firstName);}
    public void setFirstName(String firstName){this.firstName = firstName;}

    public Optional<String> getLastName(){return Optional.ofNullable(lastName);}
    public void setLastName(String lastName){this.lastName = lastName;}
}
