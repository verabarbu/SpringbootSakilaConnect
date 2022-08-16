package com.tsi.v.sakila.connect.SpringbootSakilaProject.review;

import java.util.Optional;

public class ReviewNews {
    private Integer filmId;
    private String title;
    private String author;
    private String comment;

    public Optional<Integer> getFilmId(){
        return Optional.ofNullable(filmId);
    }
    public void setFilmId(Integer filmId){
        this.filmId = filmId;
    }
    public Optional<String> getTitle(){
        return Optional.ofNullable(title);
    }
    public void setTitle(String title){
        this.title = title;
    }
    public Optional<String> getAuthor(){
        return Optional.ofNullable(author);
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public Optional<String> getComment(){
        return Optional.ofNullable(comment);
    }
    public void setComment(String comment){
        this.comment = comment;
    }
}
