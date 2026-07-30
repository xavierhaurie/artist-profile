package com.artistprofile.dto;

import com.artistprofile.entity.ProfileVenue;

public record VenueWithBlurbDTO(String blurb, VenueDTO venue) {
    public static VenueWithBlurbDTO from(ProfileVenue pv) {
        return new VenueWithBlurbDTO(pv.getBlurb(), VenueDTO.from(pv.getVenue()));
    }
}
