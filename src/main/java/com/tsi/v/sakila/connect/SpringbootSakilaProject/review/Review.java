package com.tsi.v.sakila.connect.SpringbootSakilaProject.review;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "review_id", nullable = false)
    private Integer reviewId;

    @Column(name = "film_id", nullable = false)
    private Integer filmId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "comment", length = 1000)
    private String comment;

    @Column(name = "score", nullable = false)
    private BigDecimal score;

    public Review(ReviewNews reviewNews){
        this.updateFromReviewNews(reviewNews);
    }

    public Review(){}

    public void updateFromReviewNews(ReviewNews reviewNews){
        this.filmId = reviewNews.getFilmId().orElse(filmId);
        this.title = reviewNews.getTitle().orElse(title);
        this.author = reviewNews.getAuthor().orElse(author);
        this.comment = reviewNews.getComment().orElse(comment);
        this.score = reviewNews.getScore().orElse(score);
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }
}
