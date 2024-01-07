package com.soma.reviews.repository;

import com.soma.reviews.models.Review;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReviewsRepository {
    private List<Review> reviews = new ArrayList<>(List.of(
            Review.builder()
                    .id("review1")
                    .rating(7)
                    .comment("Good Place to visit")
                    .build(),
            Review.builder()
                    .id("review2")
                    .rating(2)
                    .comment("There are frequent Traffic Jams.")
                    .build(),
            Review.builder()
                    .id("review3")
                    .rating(10)
                    .comment("Excellent Location to spend time with your loved one.")
                    .build(),
            Review.builder()
                    .id("review4")
                    .rating(1)
                    .comment("Very bad experience. This city people should never be trusted")
                    .build(),
            Review.builder()
                    .id("review5")
                    .rating(8)
                    .comment("Nice place and climate. Check this place out.")
                    .build()
    ));

    public List<Review> getReviews() {
        return reviews;
    }

    public boolean addReview(Review review) {
        return reviews.add(review);
    }
}
