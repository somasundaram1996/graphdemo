package com.soma.reviews.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LocationReviewInput {
    private String comment;
    private int rating;
    private String locationId;
}
