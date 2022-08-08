package com.tsi.v.sakila.connect.SpringbootSakilaProject.actor;

import java.util.Optional;

//Data Transfer Object for PATCH Request
public class ActorNews {

    //Attributes
    private String firstName;
    private String lastName;

    //Methods
    public Optional<String> getFirstName(){return Optional.ofNullable(firstName);}
    public void getFirstName(String firstName){this.firstName = firstName;}

    public Optional<String> getLastName(){return Optional.ofNullable(lastName);}
    public void getLastName(String lastName){this.lastName = lastName;}
}
