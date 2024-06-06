-- 各種テーブル削除
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS reservations;
DROP TABLE IF EXISTS stars;
DROP TABLE IF EXISTS favorites;
DROP TABLE IF EXISTS coupons;
-- 会員テーブル
CREATE TABLE users
(
   -- 会員ID
   id SERIAL PRIMARY KEY,
   -- 名前
   name TEXT,
   -- メアド
   mail TEXT,
   -- パスワード
   password TEXT,
   -- アカウント名
   accountName TEXT,
   -- ポイント
   point INTEGER
);

-- 顧客テーブル
CREATE TABLE customers
(
   -- 顧客ID
   id SERIAL PRIMARY KEY,
   -- 宿名
   hotelName TEXT,
   -- 価格
   price INTEGER,
   -- 所在地
   address TEXT,
   -- 宿情報
   information TEXT,
   -- 電話番号
   hotelTel TEXT
);

-- 宿予約テーブル
CREATE TABLE reservations
(
   -- 予約ID
   id SERIAL PRIMARY KEY,
   -- ユーザーID
   userId INTEGER,
   -- 顧客ID
   hotelId INTEGER,
   -- 価格
   price INTEGER,
   -- 宿泊日時
   hotelDay DATE,
   -- チェックイン
   checkIn DATE,
   -- 予約人数
   human INTEGER
);

-- 口コミテーブル
CREATE TABLE stars
(
   -- 予約ID
   id SERIAL PRIMARY KEY,
   -- ユーザーID
   userId INTEGER,
   -- 顧客ID
   hotelId INTEGER,
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
   userId INTEGER,
   -- 顧客ID
   hotelId INTEGER
);

-- クーポンテーブル
CREATE TABLE coupons
(
   -- クーポンID
   id SERIAL PRIMARY KEY,
   -- ユーザーID
   userId INTEGER,
   -- 顧客ID
   hotelId INTEGER,
   -- クーポン
   coupon TEXT
);
