package com.artistprofile.services;

import jakarta.persistence.*;

@Entity
public class Venue {
    @Id
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "email")
    String email;
    @Column(name = "blurb")
    String blurb;

    public Venue() {
    }

    public Venue(String name, String email, String blurb) {
        this.name = name;
        this.email = email;
        this.blurb = blurb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

}
