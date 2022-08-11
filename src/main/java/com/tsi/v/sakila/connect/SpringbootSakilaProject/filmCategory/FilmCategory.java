package com.tsi.v.sakila.connect.SpringbootSakilaProject.filmCategory;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Optional;

@Entity
@Table(name = "film_category")
@IdClass(FilmCategoryKey.class)
public class FilmCategory implements Serializable {
    @Id
    private int film_id;
    @Id
    private Optional<Integer> category_id;

    public FilmCategory(int film_id, Optional<Integer> category_id){
        this.film_id = film_id;
        this.category_id = category_id;
    }

    public FilmCategory(){}

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public Optional<Integer> getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Optional<Integer> category_id) {
        this.category_id = category_id;
    }
}
