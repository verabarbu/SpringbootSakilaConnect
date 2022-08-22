package com.sakila;

import com.sakila.review.ReviewNews;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewNewsTest {
    @Test
    void test_setFilmId(){
        ReviewNews testReviewNews = new ReviewNews();
        testReviewNews.setFilmId(1);
        assertEquals(Optional.of(1), testReviewNews.getFilmId(), "Can't set film id");
    }
    @Test
    void test_setTitle(){
        ReviewNews testReviewNews = new ReviewNews();
        testReviewNews.setTitle("Test");
        assertEquals(Optional.of("Test"), testReviewNews.getTitle(), "Can't set title");
    }
    @Test
    void test_setAuthor(){
        ReviewNews testReviewNews = new ReviewNews();
        testReviewNews.setAuthor("Tester");
        assertEquals(Optional.of("Tester"), testReviewNews.getAuthor(), "Can't set author");
    }
    @Test
    void test_setComment(){
        ReviewNews testReviewNews = new ReviewNews();
        testReviewNews.setComment("Comment");
        assertEquals(Optional.of("Comment"), testReviewNews.getComment(), "Can't set comment");
    }
    @Test
    void test_setScore(){
        ReviewNews testReviewNews = new ReviewNews();
        testReviewNews.setScore(BigDecimal.valueOf(1));
        assertEquals(Optional.of(BigDecimal.valueOf(1)), testReviewNews.getScore(), "Can't set Score(");
    }
}
