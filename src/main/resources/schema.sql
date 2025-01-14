-- 各種テーブル削除
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS reservations;
DROP TABLE IF EXISTS stars;
DROP TABLE IF EXISTS favorites;
DROP TABLE IF EXISTS coupons;
DROP TABLE IF EXISTS zerorooms;
DROP TABLE IF EXISTS inquiry;
-- 会員テーブル
CREATE TABLE users
(
   -- 会員ID
   id SERIAL PRIMARY KEY,
   -- 名前
   name TEXT,
   -- 生年月日
   year TEXT,
   month TEXT,
   day TEXT,
   -- 住所
   address TEXT,
   -- メアド
   mail TEXT,
   -- 電話番号
   tel TEXT,
   -- パスワード
   password TEXT,
   -- アカウント名
   account_name TEXT,
   -- ポイント
   point INTEGER
);

-- 顧客テーブル
CREATE TABLE customers
(
   -- 顧客ID
   id SERIAL PRIMARY KEY,
   -- 宿名
   hotel_name TEXT,
   -- 価格
   price INTEGER,
   -- 所在地
   address TEXT,
   -- 宿情報
   information TEXT,
   -- 電話番号
   hotel_tel TEXT,
   -- 部屋数
   hotel_room INTEGER,
   -- ホテル画像
   image TEXT
);

-- 宿予約テーブル
CREATE TABLE reservations
(
   -- 予約ID
   id SERIAL PRIMARY KEY,
   -- ユーザーID
   user_id INTEGER,
   -- 顧客ID
   hotel_id INTEGER,
   -- 価格
   price INTEGER,
   -- 宿泊日時
   hotel_day DATE,
   -- チェックイン
   checkIn INTEGER,
   -- 予約人数
   human INTEGER,
      -- 宿名
   hotel_name TEXT,
      -- ホテル画像
   image TEXT
);

-- 口コミテーブル
CREATE TABLE stars
(
   -- 予約ID
   id SERIAL PRIMARY KEY,
   -- ユーザーID
   user_id INTEGER,
   -- 顧客ID
   hotel_id INTEGER,
   -- アカウント名
   account_name TEXT,
   -- 口コミ
   evalue TEXT,
   -- 口コミ評価
   star INTEGER
);

-- お気に入りテーブル
CREATE TABLE favorites
(
   -- お気に入りID
   id SERIAL PRIMARY KEY,
   -- ユーザーID
   user_id INTEGER,
   -- 顧客ID
   hotel_id INTEGER
);

-- クーポンテーブル
CREATE TABLE coupons
(
   -- クーポンID
   id SERIAL PRIMARY KEY,
   -- ユーザーID
   user_id INTEGER,
   -- 顧客ID
   hotel_id INTEGER,
   -- クーポン
   coupon TEXT
);

-- 空室管理テーブル
CREATE TABLE zerorooms
(
   -- 空室ID
   id SERIAL PRIMARY KEY,
   -- 顧客ID
   hotel_id INTEGER,
   -- ルームID
   room_id INTEGER
);

--お問い合わせテーブル
CREATE TABLE inquiry
( 
   --お問い合わせID
   id SERIAL PRIMARY KEY,
   --お問い合わせ内容
   contents TEXT,
   --宿予約ID
   reserve_id INTEGER,
        -- 宿泊日時
   hotel_day DATE,
   -- チェックイン
   checkIn INTEGER,
   -- 予約人数
   human INTEGER
  ); 