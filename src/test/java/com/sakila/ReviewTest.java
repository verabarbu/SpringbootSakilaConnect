package com.sakila;

import com.sakila.review.Review;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewTest {
    Review testReview = new Review();
    @Test
    void test_setReviewId(){
        testReview.setReviewId(1);
        assertEquals(1, testReview.getReviewId(), "Can't get value");
    }
    @Test
    void test_setFilmId(){
        testReview.setFilmId(1);
        assertEquals(1, testReview.getFilmId(), "Can't get value");
    }
    @Test
    void test_setTitle(){
        testReview.setTitle("Test");
        assertEquals("Test", testReview.getTitle(), "Can't get value");
    }
    @Test
    void test_setAuthor(){
        testReview.setAuthor("Tester");
        assertEquals("Tester", testReview.getAuthor(), "Can't get value");
    }
    @Test
    void test_setComment(){
        testReview.setComment("Comment");
        assertEquals("Comment", testReview.getComment(), "Can't get value");
    }
    @Test
    void test_setScore(){
        testReview.setScore(BigDecimal.valueOf(1));
        assertEquals(BigDecimal.valueOf(1), testReview.getScore(), "Can't get value");
    }


}
