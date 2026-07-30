package com.artistprofile.services;

import com.artistprofile.dto.VenueDTO;
import com.artistprofile.exception.VenueNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VenuesController {

    private final VenueRepository venueRepository;

    public VenuesController(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    private Logger logger = LoggerFactory.getLogger(VenuesController.class);

    @GetMapping("/venues")
    public List<VenueDTO> getAllVenues(
    ) {
        logger.info("getAllVenues() called");

        List<VenueDTO> venues = venueRepository.findAll()
                        .stream()
                        .map(VenueDTO::from)
                        .toList();

        logger.info("getAllVenues() is returning {} records", venues.size());

        return venues;
    }

    @GetMapping("/venue/{venueId}")
    public VenueDTO getVenue(@PathVariable Long venueId) {
        logger.info("getVenue() called with venue_id {}", venueId);
        VenueDTO venueDTO = venueRepository.findById(venueId)
                .map(VenueDTO::from)
                .orElseThrow(() -> new VenueNotFoundException(venueId));

        return venueDTO;
    }

    @PostMapping("/venue/create")
    public VenueDTO createVenue(@RequestBody VenueDTO venueDTO) {
        logger.info("createVenue() called with venueDTO {}", venueDTO);
        Venue venue = venueRepository.save(venueDTO.toEntity());
        return VenueDTO.from(venue);
    }
}
