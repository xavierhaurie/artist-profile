package com.artistprofile.dto;

import com.artistprofile.services.ProfileVenue;

public record VenueConnectionDTO(String blurb, VenueDTO venueDTO) {
    static VenueConnectionDTO from(ProfileVenue pv) {
        return new VenueConnectionDTO(pv.getBlurb(), VenueDTO.from(pv.getVenue()));
    }
}