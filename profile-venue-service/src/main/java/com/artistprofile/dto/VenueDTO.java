package com.artistprofile.dto;

import com.artistprofile.services.Venue;

public record VenueDTO(Long id, String name, String email, String blurb) {

    public static VenueDTO from(Venue v) {
        return new VenueDTO(v.getId(), v.getName(), v.getEmail(), v.getBlurb());
    }

    public Venue toEntity() {
        Venue venue = new Venue();
        venue.setName(this.name);
        venue.setEmail(this.email);
        venue.setBlurb(this.blurb);
        // Map other fields if necessary
        return venue;
    }
}