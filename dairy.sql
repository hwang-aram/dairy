create user aram3288 identified by 11111111;

grant dba to aram3288;

create table dairy(
id number primary key,
u_id varchar2(15),
title varchar2(50),
content clob,
regdate date not null);
drop table dairy;
create sequence seq_dairy_id;

insert into dairy values(seq_dairy_id.nextval, 'aram', '첫', '1시다', sysdate);
insert into dairy values(seq_dairy_id.nextval, 'test', '첫', '1시다', sysdate);
