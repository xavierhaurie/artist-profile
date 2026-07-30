package com.artistprofile.dto;

import com.artistprofile.entity.VenueProfile;

public record ProfileWithNotesDTO(String notes, ProfileDTO profile) {
    public static ProfileWithNotesDTO from(VenueProfile vp) {
        return new ProfileWithNotesDTO(vp.getInteractionNotes(), ProfileDTO.from(vp.getProfile()));
    }
}
