--reservation_info_예매내역 정보

--insert into reservation_info(reservation_no) values(101);
--부모키 X 안됨
insert into reservation_info(reservation_no,payment_no,cus_id) values();

--검색
select * from reservation_info;
select * from reservation_info order by reservation_no;

--https://solbel.tistory.com/2242
--예매번호 임의번호 부여?
select ROW_NUMBER() OVER (ORDER BY reservation_no asc) re_no,payment_no,cus_id from reservation_info;


--조인? O
select reservation_no re_no,re_info.payment_no pay_no,cus_info.cus_id cus_id
from reservation_info re_info left outer join payment paym
on  re_info.payment_no= paym.payment_no
join customer_info cus_info
on re_info.cus_id= cus_info.cus_id;

--https://cy-baek.tistory.com/125
--날짜별 일련번호 부여?
--http://www.acronet.kr/29984
--select to_number(to_char(sysdate,'YYMMDD') || nvl(to_char(max(substr(sales_no,7))),'00'))+1
--from reservation_info;
--where to_char(reservation_no,'YYYYMMDD') = to_char(sysdate,'YYYYMMDD');

--http://www.acronet.kr/29984
--select to_char(sysdate, 'YYYYMMDD') into reservation_no from reservation_info;

--https://nisne.tistory.com/47(시퀀스 일련번호 생성)
--https://mine-it-record.tistory.com/62 (시퀀스)