package com.artistprofile.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfilesController {

    private final ProfileRepository profileRepository;
    private final VenueRepository venueRepository;
    private final ProfileVenueRepository profileVenueRepository;

    public ProfilesController(ProfileRepository profileRepository,
                              VenueRepository venueRepository,
                              ProfileVenueRepository profileVenueRepository) {
        this.profileRepository = profileRepository;
        this.venueRepository = venueRepository;
        this.profileVenueRepository = profileVenueRepository;
    }

    private Logger logger = LoggerFactory.getLogger(ProfilesController.class);

    @GetMapping("/profiles")
    public List<ProfileDTO> getAllProfiles(
    ) {
        logger.info("getAllProfiles() called");

        List<ProfileDTO> profiles = profileRepository.findAll()
                        .stream()
                        .map(ProfileDTO::from)
                        .toList();

        logger.info("getAllProfiles() is returning {} records", profiles.size());

        return profiles;
    }

    @GetMapping("/profile/{profileId}")
    public ProfileDTO getProfile(@PathVariable Long profileId) {
        logger.info("getProfile() called with profile_id {}", profileId);
        ProfileDTO profileDTO = profileRepository.findById(profileId)
                .map(ProfileDTO::from)
                .orElseThrow(() -> new ProfileNotFoundException(profileId));

        return profileDTO;
    }

    @GetMapping("/profile/{profileId}/venues")
    public List<VenueDTO> getProfileVenues(@PathVariable Long profileId) {
        logger.info("getProfileVenues() called with profile_id {}", profileId);
        List<VenueDTO> profileVenues = profileVenueRepository.findById_ProfileId(profileId)
                .stream()
                .map( ProfileVenue::getVenue)
                .map(VenueDTO::from)
                .toList();
        logger.info("getProfileVenues({}) is returning {} records", profileId, profileVenues.size());

        return profileVenues;
    }

    @PostMapping("/profile/create")
    public ProfileDTO createProfile(@RequestBody ProfileDTO profileDTO) {
        logger.info("createProfile() called with profileDTO {}", profileDTO);
        Profile profile = profileRepository.save(profileDTO.toEntity());
        return ProfileDTO.from(profile);
    }

}
