package com.artistprofile.dto;

import com.artistprofile.entity.ProfileVenue;

public record VenueWithNotesDTO(String notes, VenueDTO venue) {
    public static VenueWithNotesDTO from(ProfileVenue pv) {
        return new VenueWithNotesDTO(pv.getInteractionNotes(), VenueDTO.from(pv.getVenue()));
    }
}
