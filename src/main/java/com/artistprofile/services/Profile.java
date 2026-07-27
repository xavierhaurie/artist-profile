package com.artistprofile.services;

public class Profile {

    String name;
    String email;
    String blurb;
    // later, list of images

    public Profile() {
    }

    public Profile(String name, String email, String blurb) {
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
