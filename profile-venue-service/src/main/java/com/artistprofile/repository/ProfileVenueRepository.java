package com.artistprofile.repository;

import com.artistprofile.entity.ProfileVenue;
import com.artistprofile.entity.ProfileVenueId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfileVenueRepository extends JpaRepository<ProfileVenue, ProfileVenueId> {
    @Query("select pv from ProfileVenue pv join fetch pv.venue where pv.profile.id = :profileId")
    List<ProfileVenue> findWithVenueByProfileId(@Param("profileId") Long profileId);
}

