CREATE TABLE image (
                         id    BIGINT AUTO_INCREMENT PRIMARY KEY,
                         profile_id BIGINT,
                         title  VARCHAR(255),
                         caption VARCHAR(1000),
                         url VARCHAR(1000)
);
