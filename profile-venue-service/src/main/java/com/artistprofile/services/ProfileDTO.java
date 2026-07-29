package com.artistprofile.services;

public record ProfileDTO(Long id, String name, String email, String blurb) {

    static public ProfileDTO from(Profile p) {
        return new ProfileDTO(p.id, p.name, p.email, p.blurb);
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
