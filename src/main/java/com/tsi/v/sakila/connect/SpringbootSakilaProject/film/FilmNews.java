package com.tsi.v.sakila.connect.SpringbootSakilaProject.film;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Set;

//Data Transfer Object for PATCH Request
public class FilmNews {

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
    private Set<Integer> actorIds;
    private Set<Integer> categoryIds;

    //Constructor
    public FilmNews(String title, String description, Integer release_year, Integer language_id, Integer original_language_id, Integer rental_duration, BigDecimal rental_rate, Integer length, BigDecimal replacement_cost, String rating, String special_features){
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.language_id = language_id;
        this.original_language_id = original_language_id;
        this.rental_duration = rental_duration;
        this.rental_rate = rental_rate;
        this.length = length;
        this.replacement_cost = replacement_cost;
        this.rating = rating;
        this.special_features = special_features;
    }

    //Empty Constructor
    public FilmNews(){}

    //Methods
    public Optional<String> getTitle(){return Optional.ofNullable(title);}
    public void setTitle(String title){this.title = title;}
    public Optional<String> getDescription(){return Optional.ofNullable(description);}
    public void setDescription(String description){this.description = description;}
    public Optional<Integer> getRelease_year(){return Optional.ofNullable(release_year);}
    public void setRelease_year(Integer release_year){this.release_year = release_year;}
    public Optional<Integer> getLanguage_id(){return Optional.ofNullable(language_id);}
    public void setLanguage_id(Integer language_id){this.language_id = language_id;}
    public Optional<Integer> getOriginal_language_id(){return Optional.ofNullable(original_language_id);}
    public void setOriginal_language_id(Integer original_language_id){this.original_language_id = original_language_id;}
    public Optional<Integer> getRental_duration(){return Optional.ofNullable(rental_duration);}
    public void setRental_duration(Integer rental_duration){this.rental_duration = rental_duration;}
    public Optional<BigDecimal> getRental_rate(){return Optional.ofNullable(rental_rate);}
    public void setRental_rate(BigDecimal rental_rate){this.rental_rate = rental_rate;}
    public Optional<Integer> getLength(){return Optional.ofNullable(length);}
    public void setLength(Integer length){this.length = length;}
    public Optional<BigDecimal> getReplacement_cost(){return Optional.ofNullable(replacement_cost);}
    public void setReplacement_cost(BigDecimal replacement_cost){this.replacement_cost = replacement_cost;}
    public Optional<String> getRating(){return Optional.ofNullable(rating);}
    public void setRating(String rating){this.rating = rating;}
    public Optional<String> getSpecial_features(){return Optional.ofNullable(special_features);}
    public void setSpecial_features(String special_features){this.special_features = special_features;}
    public Set<Integer> getActorIds() {
        return actorIds;
    }
    public void setActorIds(Set<Integer> actorIds) {
        this.actorIds = actorIds;
    }
    public Set<Integer> getCategoryIds() {
        return categoryIds;
    }
    public void setCategoryIds(Set<Integer> categoryIds) {
        this.categoryIds = categoryIds;
    }
}
