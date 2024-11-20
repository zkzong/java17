-- drop database if exists test;
-- CREATE database test;
-- use test;

drop table if exists user;
CREATE TABLE user(
  id int auto_increment primary key,
  user_name varchar(20),
  user_type varchar(10)
);

drop table if exists product;
CREATE TABLE product(
    id int auto_increment primary key,
    name varchar(20),
    price DECIMAL
);