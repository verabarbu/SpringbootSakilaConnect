package com.tsi.v.sakila.connect.SpringbootSakilaProject.film;

import com.tsi.v.sakila.connect.SpringbootSakilaProject.actor.Actor;
import com.tsi.v.sakila.connect.SpringbootSakilaProject.category.Category;

import javax.persistence.*;
import java.math.BigDecimal;
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
    Set<Category> filmCategory;

    /*@ManyToMany
    @JoinTable(
            name = "film_language",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "language_id")
    )
    Set<Language> filmLanguage;*/

    //Attributes
    private String title;
    private String description;
    private Integer release_year;
    private Integer language_id;
    private Integer original_language_id;
    private Integer rental_duration;
    private BigDecimal rental_rate;
    private Integer length;
    private BigDecimal replacement_cost;
    private String rating;
    private String special_features;

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
        this.rental_duration = filmNews.getRental_duration().orElse(rental_duration);
        this.rental_rate = filmNews.getRental_rate().orElse(rental_rate);
        this.length = filmNews.getLength().orElse(length);
        this.replacement_cost = filmNews.getReplacement_cost().orElse(replacement_cost);
        this.rating = filmNews.getRating().orElse(rating);
        this.special_features = filmNews.getSpecial_features().orElse(special_features);

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

    public Integer getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(Integer rental_duration) {
        this.rental_duration = rental_duration;
    }

    public BigDecimal getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(BigDecimal rental_rate) {
        this.rental_rate = rental_rate;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public BigDecimal getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(BigDecimal replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecial_features() {
        return special_features;
    }

    public void setSpecial_features(String special_features) {
        this.special_features = special_features;
    }
   public Set<Actor> getFilmActor(){
        return filmActor;
   }
   public void setFilmActor(Set<Actor> filmActor){
        this.filmActor = filmActor;
   }

    public Set<Category> getFilmCategory() {
        return filmCategory;
    }

    public void setFilmCategory(Set<Category> filmCategory) {
        this.filmCategory = filmCategory;
    }

    /*public Set<Language> getFilmLanguage() {
        return filmLanguage;
    }

    public void setFilmLanguage(Set<Language> filmLanguage) {
        this.filmLanguage = filmLanguage;
    }*/
}
