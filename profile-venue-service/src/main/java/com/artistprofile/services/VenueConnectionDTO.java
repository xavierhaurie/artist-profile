package com.artistprofile.services;

public record VenueConnectionDTO(String blurb, VenueDTO venueDTO) {
    static VenueConnectionDTO from(ProfileVenue pv) {
        return new VenueConnectionDTO(pv.getBlurb(), VenueDTO.from(pv.getVenue()));
    }
}