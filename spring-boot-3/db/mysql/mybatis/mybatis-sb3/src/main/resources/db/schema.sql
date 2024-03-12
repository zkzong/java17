-- drop database if exists mybatis;
-- CREATE database mybatis;
-- use mybatis;

drop table if exists t_user;
CREATE TABLE t_user(
  id int not null auto_increment primary key comment 'id',
  user_name varchar(20) not null comment '姓名',
  age int not null comment '年龄'
) comment '用户表';