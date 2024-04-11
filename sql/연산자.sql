use testdb; 

-- 산술연산자
select 23 + 5 ,23 - 4, 23 * 5, 23 / 5 , 23 div 5, 23 % 5 , 23 mod 5 ;

/* 23 / 5 = 실수 , 23 div 5 = 정수*/ 

-- div는 정수형나누기

/* 23 % 5 = 23 mod 5 */

-- 비교연산자
select 23 >= 5,23 <= 5, 23 < 23, 23 = 23, 23 != 23, 23 <> 23;

-- !=, <> 는 같지않다는 의미이다.

-- 1 과 0으로 나타낸다
 
-- 1 이true 0 이fales다

-- 논리연산자 (and,or,not)
select * from 고객
where 도시 = '부산광역시' and 마일리지 < 1000;

-- 집합연산자 (Union, Union All)
-- 1. 첫번째와 두번째 select문의 컬럼 갯수 동일!!!
-- 2. 컬럼이 다르다면 데이터타입은 같아야함 ex(하나는 문자 , 하나는 숫자면 오류)!!!
-- 3. Union All은 중복 허용
select 고객번호, 담당자명, 마일리지, 도시
from 고객
where 도시 = '부산광역시'
union all 
select 고객번호, 담당자명, 마일리지, 도시
from 고객
where 마일리지 < 1000
order by 마일리지;

-- Is Null
-- empty value(반값)와 null은 다른 개념임
select * from  고객
where 지역 is null;
select * from 고객
where 지역 = '';

-- IN 연산자
select 고객번호, 담당자명, 담당자직위
from 고객
where 담당자직위 = '영업 과장' or 담당자직위 = '마케팅 과장';

select 고객번호, 담당자명, 담당자직위
from 고객
where 담당자직위 in('영업 과장','마케팅 과장');

-- between and (범위를 표현, ~이상이고 ~이하)
select 담당자명, 마일리지
from 고객
where 마일리지 >= 100000 and 마일리지 <= 200000;

select 담당자명, 마일리지
from 고객
where 마일리지 between 100000 and 200000; -- 시작과 끝 값을 포함

-- Like 연산자(문자열의 특정 패턴을 필터링)
-- 특수문자 %, _ 사용
select * from 고객
where 도시  like '부산%'; -- %는 여러개의 문자가 존재할 수 있음을 의미

select * from 고객
where 도시  like '%광역%'; -- '광역'이 중간에 포함된 문자열

select * from 고객
where 도시  like '%시'; -- '시'로 끝나는 문자열

select * from 고객
where 고객번호 like '_C%'; -- '_'은 정확히 한 개의 문자를 의미, 두번째 자리가 'C'인 문자열

select * from 고객
where 고객번호 like '__C%'; -- 3번째 문자가 'C'

-- 전화번호 뒷자리가 45로 끝나는 고객
select 전화번호 from 고객
where 전화번호 like '%45';

-- 전화번호중 뒤에서 3번째부터가 98인 고객
select 전화번호,담당자명 from 고객
where 전화번호 like '%98_';
 
-- 전화번호에 45가 들어가는 고객
select 전화번호,담당자명 from 고객
where 전화번호 like '%45%';

-- '서울'에 사는 고객중에 마일리지가 15000점 이상 20000점 이하인 고객
select * from 고객
where 도시 like  '서울%' and (마일리지 between 15000 and 20000); 

-- '춘천' 또는 '과천'에 사는 고객중 담당자직위에 '이사'가 들어가는 고객
select *from 고객
where 도시 in('춘천시','과천시') and 담당자직위 like '%이사%' -- in 안에는 like 연산자를 쓸수 없어 정확히 입력해야된다 ex) '%천시'(X) , 과천%(x)

-- '광역시' 또는 '특별시'에 살지 않는 고객중 마일리지가 많은 상위 3명의 고객
select * from 고객 
where 도시 not like '%광역시' and 도시 not like '%특별시'  and 마일리지 
order by 마일리지 desc  
limit 3;

select * from 고객 
where not (도시  like '%광역시' or 도시  like '%특별시')  and 마일리지 
order by 마일리지 desc  
limit 3;

-- 제품중에서 '주스'제품에 대한 정보
select * from 제품
where 제품명 like '%주스%'

-- 단가가 5000원 이상 10000원 이하인 '주스'제품
select *from 제품
where (단가 between 5000 and 10000) and (제품명 like '%주스%');

-- 재품번호가 1,2,4,7,11,20인 제품
select * from 제품
where 제품번호 in (1,2,4,7,11,20);

-- 재고금액이 높은 상위 10개 제품에 대한 제품번호,제품명,단가,재고, 재고금액=(단가*재고)
select 제품번호,제품명,단가,재고,단가*재고 as 재고금액 from 제품
order by 재고금액 desc
limit 10;

-- 같은 식

select 제품번호,제품명,단가,재고,단가*재고 as 재고금액 from 제품
order by 5 desc
limit 10;



