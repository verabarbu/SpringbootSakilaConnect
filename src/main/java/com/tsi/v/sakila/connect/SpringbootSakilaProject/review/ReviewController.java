package com.tsi.v.sakila.connect.SpringbootSakilaProject.review;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController //handles GET, POST, DELETE, PUT requests
@RequestMapping("/Sakila")
public class ReviewController {
    private ReviewRepository reviewRepository;

    public ReviewController(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }
    @PostMapping("/Add_New_Review")
    public @ResponseBody
    void addNewReview(@RequestBody ReviewNews reviewNews){
        Review review = reviewRepository.save(new Review(reviewNews));
    }
    @GetMapping("/All_Reviews")
    public @ResponseBody
    Iterable<Review> getAllReviews(){
        return reviewRepository.findAll();
    }
    @GetMapping("/Get_Review_By_Id")
    public @ResponseBody
    Optional<Review> getReviewById(@RequestParam int reviewId){
        return reviewRepository.findById(reviewId);
    }
    @GetMapping("/Get_Review_By_Film_Id")
    public @ResponseBody
    Iterable<Review> getReviewByFilmId(@RequestParam Integer filmId){
        return reviewRepository.findAllByFilmId(filmId);
    }
    @GetMapping("/Get_Review_By_Film_Title")
    public @ResponseBody
    Iterable<Review> getReviewByFilmTitle(@RequestParam String title){
        return reviewRepository.findAllByTitle(title);
    }
    @PatchMapping("/Review/{reviewId}")
    public @ResponseBody Review updateReviewById(@PathVariable Integer reviewId, @RequestBody ReviewNews reviewNews){
        Review review = reviewRepository.findById(reviewId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Review id does not exist"));
        review.updateFromReviewNews(reviewNews);
        return reviewRepository.save(review);
    }
    @DeleteMapping("/Delete_Review_By_Id")
    public @ResponseBody
    void deleteReviewById(@RequestParam Integer reviewId){
        reviewRepository.deleteById(reviewId);
    }
}
