package com.soma.reviews.resolvers;

import com.soma.reviews.models.Review;
import com.soma.reviews.repository.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewsResolver {

    @Autowired
    private ReviewsRepository reviewsRepository;
    @QueryMapping
    public List<Review> latestReviews() {
        return reviewsRepository.getReviews();
    }
}
