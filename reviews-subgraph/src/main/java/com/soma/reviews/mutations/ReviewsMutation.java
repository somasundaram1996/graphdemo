package com.soma.reviews.mutations;

import com.soma.reviews.models.LocationReviewInput;
import com.soma.reviews.models.Review;
import com.soma.reviews.models.SubmitReviewResponse;
import com.soma.reviews.repository.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class ReviewsMutation {

    private AtomicInteger counter = new AtomicInteger(6);
    @Autowired
    private ReviewsRepository reviewsRepository;
    @MutationMapping
    public SubmitReviewResponse submitReview(@Argument("locationReview") LocationReviewInput locationReviewInput) {
        Review review = Review.builder()
                .id("review" + counter.getAndIncrement())
                .comment(locationReviewInput.getComment())
                .rating(locationReviewInput.getRating())
                .build();
        boolean isAdded = reviewsRepository.addReview(review);
        SubmitReviewResponse response = new SubmitReviewResponse();
        if (isAdded) {
            response = SubmitReviewResponse.builder()
                    .code(200)
                    .message("Review Successfully Added.")
                    .success(true)
                    .build();
        } else {
            response = SubmitReviewResponse.builder()
                    .code(500)
                    .message("Review Not Added due to some reason.")
                    .success(false)
                    .build();
        }
        return response;
    }
}
