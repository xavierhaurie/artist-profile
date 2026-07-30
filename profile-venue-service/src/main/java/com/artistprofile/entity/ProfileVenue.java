package com.artistprofile.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "profile_venue")
public class ProfileVenue {

    @EmbeddedId
    private ProfileVenueId id = new ProfileVenueId();

    @ManyToOne
    @MapsId("profileId")               // maps this FK to part of the composite key
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @ManyToOne
    @MapsId("venueId")
    @JoinColumn(name = "venue_id")
    private Venue venue;

    @Column(name = "blurb")
    private String blurb;

    public ProfileVenueId getId() {
        return id;
    }

    public void setId(ProfileVenueId id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }
}

