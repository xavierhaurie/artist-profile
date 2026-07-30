package com.artistprofile.repository;

import com.artistprofile.entity.ProfileVenue;
import com.artistprofile.services.ProfileVenueId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileVenueRepository extends JpaRepository<ProfileVenue, ProfileVenueId> {
    List<ProfileVenue> findById_ProfileId(Long profileId);
}

