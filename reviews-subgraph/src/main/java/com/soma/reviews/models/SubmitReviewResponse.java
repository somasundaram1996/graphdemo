package com.soma.reviews.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubmitReviewResponse {
    private int code;
    private String message;
    private boolean success;
    private Review locationReview;
}
