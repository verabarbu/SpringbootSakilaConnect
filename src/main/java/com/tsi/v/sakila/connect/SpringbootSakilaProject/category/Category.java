package com.tsi.v.sakila.connect.SpringbootSakilaProject.category;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tsi.v.sakila.connect.SpringbootSakilaProject.film.Film;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")

public class Category {

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    //@ManyToMany relationship with Film
    @JsonIgnore
    @ManyToMany(mappedBy = "filmCategory")
    List<Film> films = new ArrayList<>();

    //Attribute
    private String name;

    //Constructor
    public Category(String name){
        this.name = name;
    }

    //Empty Constructor
    public Category(){}

    //Methods
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
