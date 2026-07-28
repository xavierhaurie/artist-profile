package com.artistprofile.services;

public record ProfileConnectionDTO(String blurb, ProfileDTO profile) {
    static ProfileConnectionDTO from(ProfileVenue pv) {
        return new ProfileConnectionDTO(pv.getBlurb(), ProfileDTO.from(pv.getProfile()));
    }
}