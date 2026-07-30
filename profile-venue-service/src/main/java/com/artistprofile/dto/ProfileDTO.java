package com.artistprofile.dto;

import com.artistprofile.entity.Profile;

public record ProfileDTO(Long id, String name, String email, String profileNotes) {

    static public ProfileDTO from(Profile p) {
        return new ProfileDTO(p.getId(), p.getName(), p.getEmail(), p.getNotes());
    }

    public Profile toEntity() {
        Profile profile = new Profile();
        profile.setName(this.name);
        profile.setEmail(this.email);
        profile.setNotes(this.profileNotes);
        // Map other fields if necessary
        return profile;
    }
}
