drop table if exists celphones;

create table celphones(
 id_celphones bigint auto_increment,
 model varchar(30) not null,
 mark varchar(30) not null,
 RAM varchar(30) not null,
 memory varchar(30) not null,
 primary key(id_celphones));