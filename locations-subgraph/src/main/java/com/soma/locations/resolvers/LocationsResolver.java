package com.soma.locations.resolvers;

import com.soma.locations.models.Location;
import com.soma.locations.repository.LocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationsResolver {

    @Autowired
    private LocationsRepository locationsRepository;
    @QueryMapping
    public List<Location> locations() {
        return locationsRepository.getLocations();
    }

    @QueryMapping
    public Location location(@Argument String id) {
        return locationsRepository.findLocationById(id).get();
    }
}
