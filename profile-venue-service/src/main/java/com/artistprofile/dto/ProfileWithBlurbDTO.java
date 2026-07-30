package com.artistprofile.dto;

import com.artistprofile.entity.VenueProfile;

public record ProfileWithBlurbDTO(String blurb, ProfileDTO profile) {
    public static ProfileWithBlurbDTO from(VenueProfile vp) {
        return new ProfileWithBlurbDTO(vp.getBlurb(), ProfileDTO.from(vp.getProfile()));
    }
}
