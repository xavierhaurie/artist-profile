package com.artistprofile.services;

public record VenueDTO(Long id, String name, String email, String blurb) {

    static VenueDTO from(Venue v) {
        return new VenueDTO(v.id, v.name, v.email, v.blurb);
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