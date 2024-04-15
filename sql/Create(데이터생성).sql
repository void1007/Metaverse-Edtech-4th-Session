-- create 데이터베이스 생성
create database project1;
char set utf8mb4 collate utf8mb4_general_ci;

use project1;

-- table 테이블 생성

create table 학과
(학과번호 char(2),
학과명 varchar(20),
학과장명 varchar(20));

insert into 학과
values('AA','Computer','steve'),
('BB','Software','tom'),
('CC','design','michae1'); -- > 한글로치면 오류가 날수 있음 원인은 불명;

create table 학생
(학번 char(5),
이름 varchar(20),
생일 date,
연락처 varchar(20),
학과번호 char(2));

insert into 학생
values('S0001','Lee','2020-01-30','01033334444','AA');
insert into 학생
values('S0001','Kim','2020-02-23',null,'AA'),
('S0001','Bak','2020-03-31','01077778888','DD');