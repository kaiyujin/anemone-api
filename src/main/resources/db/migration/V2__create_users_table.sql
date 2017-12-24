CREATE TABLE users
(
    id BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT 'ユーザID',
    name VARCHAR(20) NOT NULL COMMENT '氏名',
    email VARCHAR(200) NOT NULL COMMENT 'メールアドレス',
    password text NOT NULL COMMENT 'パスワードハッシュ値',
    default_shop_id BIGINT UNSIGNED NOT NULL COMMENT 'デフォルトショップID',
    created_by BIGINT UNSIGNED NOT NULL COMMENT '作成者ID',
    created_in TEXT NOT NULL COMMENT '作成モジュール名',
    created_at TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '作成日時',
    updated_by BIGINT UNSIGNED NOT NULL COMMENT '更新者ID',
    updated_in TEXT NOT NULL COMMENT '更新モジュール名',
    updated_at TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '更新日時'
)
comment='ユーザマスタ'
;
CREATE TABLE authorities
(
    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT '権限ID',
    name VARCHAR(30) NOT NULL COMMENT '権限名',
    authority_bit BIT(20) NOT NULL default 524288 COMMENT '権限ビット',
    created_by BIGINT UNSIGNED NOT NULL COMMENT '作成者ID',
    created_in TEXT NOT NULL COMMENT '作成モジュール名',
    created_at TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '作成日時',
    updated_by BIGINT UNSIGNED NOT NULL COMMENT '更新者ID',
    updated_in TEXT NOT NULL COMMENT '更新モジュール名',
    updated_at TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '更新日時'
)
comment='権限マスタ'
;
/*
options
 1桁目: 予約登録,  2桁目: 予約参照,  3桁目: 予約変更,  4桁目: 予約削除
 5桁目: 顧客登録,  6桁目: 顧客参照,  7桁目: 顧客変更,  8桁目: 顧客削除
 9桁目: 店舗登録, 10桁目: 店舗参照 ,11桁目: 店舗変更, 12桁目: 店舗削除
13桁目: レポート
*/
CREATE TABLE users_authorities
(
    user_id BIGINT UNSIGNED NOT NULL COMMENT 'ユーザID',
    authority_id INT UNSIGNED NOT NULL COMMENT '権限ID',
    shop_id BIGINT UNSIGNED NOT NULL COMMENT '店舗ID',
    created_by BIGINT UNSIGNED NOT NULL COMMENT '作成者ID',
    created_in TEXT NOT NULL COMMENT '作成モジュール名',
    created_at TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '作成日時',
    updated_by BIGINT UNSIGNED NOT NULL COMMENT '更新者ID',
    updated_in TEXT NOT NULL COMMENT '更新モジュール名',
    updated_at TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '更新日時'
)
comment='ユーザ/権限交差テーブル'
;
