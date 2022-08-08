package com.tsi.v.sakila.connect.SpringbootSakilaProject.category;

import com.tsi.v.sakila.connect.SpringbootSakilaProject.film.Film;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "category")

public class Category {

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    //@ManyToMany relationship with Film
    @ManyToMany(mappedBy = "filmCategory")
    Set<Film> categoryFilm;

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
}
