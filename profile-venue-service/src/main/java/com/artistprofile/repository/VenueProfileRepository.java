package com.artistprofile.repository;

import com.artistprofile.entity.ProfileVenueId;
import com.artistprofile.entity.VenueProfile;
import org.springframework.data.domain.Limit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VenueProfileRepository extends JpaRepository<VenueProfile, ProfileVenueId> {
    List<VenueProfile> findById_VenueId(Long idVenueId, Limit limit);
}

