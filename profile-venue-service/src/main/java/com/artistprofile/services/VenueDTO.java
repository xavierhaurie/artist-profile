package com.artistprofile.services;

public record VenueDTO(Long id, String name, String email, String blurb) {
    static VenueDTO from(Venue v) {
        return new VenueDTO(v.id, v.name, v.email, v.blurb);
    }
}