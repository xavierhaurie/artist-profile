-- Profile/Venue DB
CREATE DATABASE IF NOT EXISTS artistprofile CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER IF NOT EXISTS 'artist'@'%' IDENTIFIED BY 'artistpass';
GRANT ALL PRIVILEGES ON artistprofile.* TO 'artist'@'%';

-- Images DB
CREATE DATABASE IF NOT EXISTS images CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER IF NOT EXISTS 'images'@'%' IDENTIFIED BY 'imagespass';
GRANT ALL PRIVILEGES ON images.* TO 'images'@'%';

FLUSH PRIVILEGES;
