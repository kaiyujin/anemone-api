CREATE TABLE reservations
(
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT 'ユーザID',
    last_name VARCHAR(20) NOT NULL COMMENT '性',
    first_name VARCHAR(20) NOT NULL COMMENT '名',
    status_id SMALLINT NOT NULL COMMENT 'ステータスID',
    stay_time SMALLINT UNSIGNED NOT NULL COMMENT '滞在時間',
    persons SMALLINT UNSIGNED NOT NULL COMMENT '予約人数',
    chileren SMALLINT UNSIGNED NOT NULL DEFAULT 0 COMMENT '予約人数',
    inflow_id SMALLINT UNSIGNED NOT NULL DEFAULT 0 COMMENT '流入経路',
    created_by BIGINT NOT NULL COMMENT '作成者ID',
    created_in TEXT NOT NULL COMMENT '作成モジュール名',
    created_at TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '作成日時',
    updated_by BIGINT NOT NULL COMMENT '更新者ID',
    updated_in TEXT NOT NULL COMMENT '更新モジュール名',
    updated_at TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新日時'
)
    comment='ユーザマスタ'
;