drop table if exists member CASCADE;

create table member
    (
    if bigint gennerated by default as identity ,
    name varchar(255),
    primary key (id)
    );