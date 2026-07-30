package com.artistprofile.dto;

import com.artistprofile.entity.Profile;

public record ProfileDTO(Long id, String name, String email, String blurb) {

    static public ProfileDTO from(Profile p) {
        return new ProfileDTO(p.getId(), p.getName(), p.getEmail(), p.getBlurb());
    }

    public Profile toEntity() {
        Profile profile = new Profile();
        profile.setName(this.name);
        profile.setEmail(this.email);
        profile.setBlurb(this.blurb);
        // Map other fields if necessary
        return profile;
    }
}
