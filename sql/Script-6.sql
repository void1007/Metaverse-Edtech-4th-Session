/*1.고객테이블에서 고객회사명과 전화번호를 아래 규칙에 따르도록 변경하고 변경된 컬럼
 * 의 이름은 고객회사명2,전화번호2로 만드시오
 * 고객회사명2의 조건 : 기존 고객회사명 앞 2자리를 *로 변환
 * 전화번호2의 조건 : (02)978-1984의 형태를 02-978-1984로 변환*/

-- select concat(repeat('*',2) , substring(고객회사명,'3','20')) as 고객회사명2 , substring(replace(전화번호,')','-'),'2','15')  as 전화번호2 from 고객;

select concat('**',substr(고객회사명, 3)) as 고객회사명2, 
replace (substr(전화번호 , 2),')','-') as 전화번호2 
from 고객



/* 2.주문세부 테이블에서 아래3개의 컬럼을 조건대로 만드시오
 * 주문금액: 주문수량 * 단가
 * 할인금액: 주문수량 * 단가 * 할인율
 * 실주문금액: 주문금액 - 할인금액
 */

select 주문수량*단가 as 주문금액 , 
주문수량*단가*할인율 as 할인금액 ,
(주문수량*단가)-(주문수량*단가*할인율) as 실주문금액 
from 주문세부;

/* 3.사원테이블에서 전체사원의 이름,생일,만나이(as 만나이), 입사일, 입사일수(as 입사일수, 입사한지 500일 후(as 입사 500일후)의 날짜를 만드시오)
 * */

-- select 이름, 생일 , year(now()) - year(생일)  as 만나이, 입사일, datediff(now(), 입사일) as 입사일수, adddate(now(),500) as 입사500일후  from 사원;
select 이름,
생일,
timestampdiff(year,생일,now()) as 만나이,
입사일,
timestampdiff(day,입사일,now()) as 입사일수,
adddate(입사일, 500) as 입사500일후 
from 사원;

/* 4.주문테이블에서 요청일보다 발송일이 7일 이상 늦은 주문내역
 */
select *,
datediff(발송일, 요청일) as 지연일수
from 주문
where datediff(발송일, 요청일) >= 7; 

/*5.고객테이블에서 아래와 같은 컬럼을 만드시오. 단, 도시구분과 마일리지구분 컬럼의 조건은
 * 아래 조건을 따르시오
 * 담당자명,고객회사명,도시,도시구분,마일리지,마일리지구분
 * 조건1 (도시구분):특별시나 광역시는 '대도시',나머지 도시는 '도시'로 표현
 * 조건2 (마일리지구분):마일리지가 100,000점 이상이면 'VVIP', 10,000점 이상이면 'VIP',
 * 나머지는 '일반고객'으로 표현
 */



/*주문테이블에서 아래 컬럼을 만드시오
 * 주문번호,고객번호,주문일,주문년도,주문분기,주문월,주문일,주문요일,한글요일
 * 조건1 : 한글요일은 case문을 이용하여 정수값을 '월요일'같은 한글 요일표시로 표현
 * */

select 주문번호,
고객번호,
주문일,
year(주문일) as 주문년도,
quarter(주문일) as 주문분기,
month(주문일) as 주문월,
day(주문일) as 주문일,
weekday(주문일) as 주문요일,
case 
when weekday(주문일) = 0 then '일요일'
when weekday(주문일) = 1 then '월요일'
when weekday(주문일) = 2 then '화요일'
when weekday(주문일) = 3 then '수요일'
when weekday(주문일) = 4 then '목요일'
when weekday(주문일) = 5 then '금요일'
when weekday(주문일) = 6 then '토요일'
end 
as 한글요일
from 주문;
