DROP TABLE IF EXISTS reservations;
CREATE TABLE reservations
(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL
);