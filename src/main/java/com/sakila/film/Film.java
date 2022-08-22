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
    private int filmId;

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
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "release_year")
    private Integer releaseYear;
    @Column(name = "language_id")
    private Integer languageId;
    @Column(name = "original_language_id")
    private Integer originalLanguageId;
    @Column(name = "length")
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
        this.releaseYear = filmNews.getReleaseYear().orElse(releaseYear);
        this.languageId = filmNews.getLanguageId().orElse(languageId);
        this.originalLanguageId = filmNews.getOriginalLanguageId().orElse(originalLanguageId);
        this.length = filmNews.getLength().orElse(length);
        this.rating = filmNews.getRating().orElse(rating);
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
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

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Integer getOriginalLanguageId() {
        return originalLanguageId;
    }

    public void setOriginalLanguageId(Integer originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
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
