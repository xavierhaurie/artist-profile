package com.artistprofile.dto;

import com.artistprofile.entity.Profile;
import com.artistprofile.entity.ProfileVenue;
import com.artistprofile.entity.Venue;

public record ProfileVenueDTO(Long profileId, Long venueId, String interactionNotes) {

    static public ProfileVenueDTO from(ProfileVenue pv) {
        return new ProfileVenueDTO(
                pv.getProfile().getId(),
                pv.getVenue().getId(),
                pv.getInteractionNotes());
    }

    public ProfileVenue toEntity(Profile profile, Venue venue) {
        ProfileVenue pv = new ProfileVenue();
        pv.setProfile(profile);
        pv.setVenue(venue);
        pv.setInteractionNotes(this.interactionNotes);
        return pv;
    }
}
