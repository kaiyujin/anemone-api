-- ユーザテーブル
CREATE TABLE users
(
    id BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    email VARCHAR(200) NOT NULL,
    password text NOT NULL,
    default_shop_id BIGINT UNSIGNED NOT NULL,
    created_by BIGINT UNSIGNED NOT NULL,
    created_in TEXT NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT current_timestamp,
    updated_by BIGINT UNSIGNED NOT NULL,
    updated_in TEXT NOT NULL,
    updated_at TIMESTAMP NOT NULL DEFAULT current_timestamp
);

-- 権限マスタ
CREATE TABLE authorities
(
    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL,
    options BIT(20) NOT NULL default 524288,
    created_by BIGINT UNSIGNED NOT NULL,
    created_in TEXT NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT current_timestamp,
    updated_by BIGINT UNSIGNED NOT NULL,
    updated_in TEXT NOT NULL,
    updated_at TIMESTAMP NOT NULL DEFAULT current_timestamp
);
/*
options
 1桁目: 予約登録,  2桁目: 予約参照,  3桁目: 予約変更,  4桁目: 予約削除
 5桁目: 顧客登録,  6桁目: 顧客参照,  7桁目: 顧客変更,  8桁目: 顧客削除
 9桁目: 店舗登録, 10桁目: 店舗参照 ,11桁目: 店舗変更, 12桁目: 店舗削除
13桁目: レポート
*/
-- ユーザ/権限交差テーブル
CREATE TABLE users_authorities
(
    user_id BIGINT UNSIGNED NOT NULL,
    authority_id INT UNSIGNED NOT NULL,
    shop_id BIGINT UNSIGNED NOT NULL,
    created_by BIGINT UNSIGNED NOT NULL,
    created_in TEXT NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT current_timestamp,
    updated_by BIGINT UNSIGNED NOT NULL,
    updated_in TEXT NOT NULL,
    updated_at TIMESTAMP NOT NULL DEFAULT current_timestamp
);
