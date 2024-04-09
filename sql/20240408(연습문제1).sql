CREATE DATABASE testDB DEFAULT CHARSET utf8mb4
collate utf8mb4_general_ci;
-- 1.
select  이름,부서번호 from 사원;

-- 2.
select 이름 , 직위 from 사원
where 직위 = '과장'
order by 사원번호 desc;

-- 3.
select 고객회사명 , 담당자명 from 고객
where 고객번호 = 'CCOPI';

-- 4.
select 주문번호 ,주문일 from 주문
where 주문번호 > 'H0288'
order by 주문번호 desc;

-- 5.
select 제품명,재고 from 제품
where 재고 < '50';

-- 6.
select 이름,성별 from 사원
where 성별 = '남'; 

-- 7.
select 고객회사명,마일리지 from 고객
where 마일리지 >= 1000;

-- 8.
select 주문번호,주문수량 from 주문세부
where 제품번호 = '77';

-- 9.
select 주문번호,주문일 from 주문
where  주문번호 <='H0518'
order by 주문번호 desc; 

-- 10.
select 이름,성별,직위 from 사원
where 성별 = '여' and 직위 = '사원';

-- 11.
select 제품명,단가 from 제품
where 단가 >= 8000
order by 제품명 asc;


-- 12.
select 주문번호,주문수량 from 주문세부
where 주문수량 >= 5;

-- 13.
select 생일,이름 from 사원
where 생일 > '1990-01-01';

-- 14.
select 이름,입사일 from 사원
where 직위 = '사원'
order by 입사일 desc
limit 1;

-- 15.
select 고객번호,고객회사명,도시 from 고객
where 도시 = '대전광역시';




