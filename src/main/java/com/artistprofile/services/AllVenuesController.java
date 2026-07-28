package com.artistprofile.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AllVenuesController {

    private final VenueRepository venueRepository;

    public AllVenuesController(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    private Logger logger = LoggerFactory.getLogger(AllVenuesController.class);

    @GetMapping("/venues")
    public List<Venue> getAllVenues(
    ) {
        logger.info("getAllVenues() called");

        List<Venue> venues = venueRepository.findAll();

        logger.info("getAllVenues() is returning {} records", venues.size());

        return venues;
    }

}
