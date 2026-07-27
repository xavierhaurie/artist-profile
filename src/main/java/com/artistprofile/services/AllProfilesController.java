package com.artistprofile.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AllProfilesController {

    private Logger logger = LoggerFactory.getLogger(AllProfilesController.class);

    @GetMapping("/profiles")
    public List<Profile> getAllProfiles(
    ) {
        logger.info("getAllProfiles() called");

        List<Profile> profiles = new ArrayList<>();
        profiles.add(new Profile("Alice", "alice@example.com", "Alice enjoys painting landscapes with watercolors"));
        profiles.add(new Profile("Bob", "bob@example.com", "Bob likes to paint portraits with oil"));

        logger.info("getAllProfiles() is returning {} records", profiles.size());

        return profiles;
    }

}
