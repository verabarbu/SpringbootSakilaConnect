package com.sakila.film;

import com.sakila.actor.Actor;
import com.sakila.category.Category;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="film")

public class Film {

    @Id
    @Column(name="film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int film_id;

    //@ManyToMAny relationship with Actor
    @ManyToMany
    @JoinTable(
            name = "film_actor",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    Set<Actor> filmActor;

    //ManyToMany relationship with Category
    @ManyToMany
    @JoinTable(
            name = "film_category",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    List<Category> filmCategory = new ArrayList<>();

    //Attributes
    private String title;
    private String description;
    private Integer release_year;
    private Integer language_id;
    private Integer original_language_id;
    private Integer length;
    private String rating;

    //Data Transfer Object Constructor
    public Film(FilmNews filmNews){
        this.updateFromFilmNews(filmNews);
    }

    //Empty Constructor
    public Film(){}

    //Methods
    public void updateFromFilmNews(FilmNews filmNews){
        this.title = filmNews.getTitle().orElse(title);
        this.description = filmNews.getDescription().orElse(description);
        this.release_year = filmNews.getRelease_year().orElse(release_year);
        this.language_id = filmNews.getLanguage_id().orElse(language_id);
        this.original_language_id = filmNews.getOriginal_language_id().orElse(original_language_id);
        this.length = filmNews.getLength().orElse(length);
        this.rating = filmNews.getRating().orElse(rating);
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRelease_year() {
        return release_year;
    }

    public void setRelease_year(Integer release_year) {
        this.release_year = release_year;
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public Integer getOriginal_language_id() {
        return original_language_id;
    }

    public void setOriginal_language_id(Integer original_language_id) {
        this.original_language_id = original_language_id;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Set<Actor> getFilmActor(){
        return filmActor;
   }
   public void setFilmActor(Set<Actor> filmActor){
        this.filmActor = filmActor;
   }

    public List<Category> getFilmCategory() {
        return filmCategory;
    }

    public void setFilmCategory(List<Category> filmCategory) {
        this.filmCategory = filmCategory;
    }


}
