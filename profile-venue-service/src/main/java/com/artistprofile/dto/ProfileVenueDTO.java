package com.artistprofile.dto;

import com.artistprofile.entity.Profile;
import com.artistprofile.entity.ProfileVenue;
import com.artistprofile.entity.Venue;

public record ProfileVenueDTO(Long profileId, Long venueId, String blurb) {

    static public ProfileVenueDTO from(ProfileVenue pv) {
        return new ProfileVenueDTO(
                pv.getProfile().getId(),
                pv.getVenue().getId(),
                pv.getBlurb());
    }

    public ProfileVenue toEntity(Profile profile, Venue venue) {
        ProfileVenue pv = new ProfileVenue();
        pv.setProfile(profile);
        pv.setVenue(venue);
        pv.setBlurb(this.blurb);
        return pv;
    }
}
