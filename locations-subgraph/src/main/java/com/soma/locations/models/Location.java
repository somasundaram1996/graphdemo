package com.soma.locations.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Location {
    private String id;
    private String name;
    private String description;
}
