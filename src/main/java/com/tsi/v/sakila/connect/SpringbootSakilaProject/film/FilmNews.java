package com.tsi.v.sakila.connect.SpringbootSakilaProject.film;

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
    private Integer length;
    private String rating;
    private Set<Integer> actorIds;
    private Set<Integer> categoryIds;
    private Set<Integer> languageIds;

    //Constructor
    public FilmNews(String title, String description, Integer release_year, Integer language_id, Integer original_language_id, Integer length, String rating){
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.language_id = language_id;
        this.original_language_id = original_language_id;
        this.length = length;
        this.rating = rating;
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
    public Optional<Integer> getLength(){return Optional.ofNullable(length);}
    public void setLength(Integer length){this.length = length;}
    public Optional<String> getRating(){return Optional.ofNullable(rating);}
    public void setRating(String rating){this.rating = rating;}
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

    public Set<Integer> getLanguageIds() {
        return languageIds;
    }

    public void setLanguageIds(Set<Integer> languageIds) {
        this.languageIds = languageIds;
    }
}
