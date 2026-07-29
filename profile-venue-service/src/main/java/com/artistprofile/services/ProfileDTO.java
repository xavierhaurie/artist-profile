package com.artistprofile.services;

public record ProfileDTO(Long id, String name, String email, String blurb) {
    static ProfileDTO from(Profile p) {
        return new ProfileDTO(p.id, p.name, p.email, p.blurb);
    }
}