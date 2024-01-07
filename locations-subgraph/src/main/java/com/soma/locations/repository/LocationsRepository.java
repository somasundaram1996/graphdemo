package com.soma.locations.repository;

import com.soma.locations.models.Location;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class LocationsRepository {
    private final List<Location> locations = List.of(
            Location.builder()
                    .id("city1")
                    .name("Chennai")
                    .description("Chennai is the Capital of TamilNadu State.")
                    .build(),
            Location.builder()
                    .id("city2")
                    .name("Madurai")
                    .description("Madurai is the Temple Town.")
                    .build(),
            Location.builder()
                    .id("city3")
                    .name("Tenkasi")
                    .description("Tenkasi has chill climate.")
                    .build(),
            Location.builder()
                    .id("city4")
                    .name("Tutucorin")
                    .description("Tutucorin is the Harbour Town.")
                    .build(),
            Location.builder()
                    .id("city5")
                    .name("Dindigul")
                    .description("Dindigul is the Lock City.")
                    .build()
    );

    public List<Location> getLocations() {
        return locations;
    }

    public Optional<Location> findLocationById(String id) {
        return locations.stream().filter(location -> location.getId().equals(id)).findFirst();
    }
}
