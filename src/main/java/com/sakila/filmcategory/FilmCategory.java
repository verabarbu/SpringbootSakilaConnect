package com.sakila.filmcategory;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "film_category")
public class FilmCategory implements Serializable {

    @EmbeddedId
    private FilmCategoryKey filmCategoryKey;
    public FilmCategory(Integer filmId, Integer categoryId){
        this.filmCategoryKey = new FilmCategoryKey(filmId, categoryId);
    }
    public FilmCategory(){}

    public FilmCategoryKey getFilmCategoryKey() {
        return filmCategoryKey;
    }

    public void setFilmCategoryKey(FilmCategoryKey filmCategoryKey) {
        this.filmCategoryKey = filmCategoryKey;
    }
}
