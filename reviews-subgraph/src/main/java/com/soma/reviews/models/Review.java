package com.soma.reviews.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Review {
    private String id;
    private String comment;
    private int rating;
}
