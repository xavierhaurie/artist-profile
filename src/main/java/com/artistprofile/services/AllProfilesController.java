package com.artistprofile.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AllProfilesController {

    private final ProfileRepository profileRepository;

    public AllProfilesController(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    private Logger logger = LoggerFactory.getLogger(AllProfilesController.class);

    @GetMapping("/profiles")
    public List<Profile> getAllProfiles(
    ) {
        logger.info("getAllProfiles() called");

        List<Profile> profiles = profileRepository.findAll();

        logger.info("getAllProfiles() is returning {} records", profiles.size());

        return profiles;
    }

}
