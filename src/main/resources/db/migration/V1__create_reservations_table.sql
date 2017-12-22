-- 予約
CREATE TABLE reservations
(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    shop_id BIGINT UNSIGNED NOT NULL,
    reservation_type TINYINT UNSIGNED NOT NULL, -- 1:TEL 2:WEB 3:Work in 4:other
    status_id TINYINT UNSIGNED NOT NULL,
    come_date DATETIME NOT NULL, -- 来店日
    stay_time SMALLINT UNSIGNED NOT NULL,
    person_number SMALLINT UNSIGNED NOT NULL,
    child_number SMALLINT UNSIGNED NOT NULL, -- adults + children
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    language_id SMALLINT UNSIGNED NOT NULL,
    created_by BIGINT UNSIGNED NOT NULL,
    created_in TEXT NOT NULL,
    created_at TIMESTAMP NOT NULL,
    updated_by BIGINT UNSIGNED NOT NULL,
    updated_in TEXT NOT NULL,
    updated_at TIMESTAMP NOT NULL
);

-- 店舗
CREATE TABLE shops
(
    id BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    section_id BIGINT UNSIGNED NOT NULL,
    phone_number VARCHAR(15) NOT NULL,
    fax_number VARCHAR(15) NOT NULL,
    web_site_url TEXT NOT NULL,
    email VARCHAR(200) NOT NULL,
    country_id SMALLINT UNSIGNED NOT NULL,
    state_id INT UNSIGNED NOT NULL,
    city_id INT UNSIGNED NOT NULL,
    zip_code VARCHAR(20) NOT NULL,
    options BIT(8) NOT NULL,
    sort_no SMALLINT UNSIGNED NOT NULL,
    created_by BIGINT UNSIGNED NOT NULL,
    created_in TEXT NOT NULL,
    created_at TIMESTAMP NOT NULL,
    updated_by BIGINT UNSIGNED NOT NULL,
    updated_in TEXT NOT NULL,
    updated_at TIMESTAMP NOT NULL
);