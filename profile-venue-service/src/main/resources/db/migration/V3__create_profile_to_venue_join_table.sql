CREATE TABLE profile_venue (
                       id    BIGINT AUTO_INCREMENT PRIMARY KEY,
                       profile_id BIGINT,
                       venue_id BIGINT,
                       blurb VARCHAR(1000)
);


INSERT INTO profile_venue (profile_id, venue_id, blurb) VALUES
                                           (1, 1, 'Met on January 1st, not a good fit'),
                                           (1, 2, 'Emailed, put me on waiting list'),
                                           (2, 1, 'They like my work')
