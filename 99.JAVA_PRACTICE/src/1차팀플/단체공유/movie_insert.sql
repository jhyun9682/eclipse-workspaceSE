--insert
--ticket insert
insert into ticket values(1, 11000, 14000); --일반
insert into ticket values(2, 8000, 10000); -- 조조
insert into ticket values(3, 9000, 13000); -- 심야

--movie insert
insert into movie values(1, '마녀2', '액션', 15);
insert into movie values(2, '탑건-매버릭', '액션', 12);
insert into movie values(3, '헤어질 결심', '로맨스', 15);
insert into movie values(4, '토르-러브 앤 썬더', '액션', 12);
insert into movie values(5, '범죄도시2', '액션', 15);

--movieseat insert
insert into movieseat values(1, to_date('07/24 08:00', 'mm/dd hh24:mi'), (select sum(seat_valid) from seat group by seat_valid), 1, 4);
insert into movieseat values(2, to_date('07/24 12:00', 'mm/dd hh24:mi'), (select sum(seat_valid) from seat group by seat_valid), 2, 3);
insert into movieseat values(3, to_date('07/24 16:00', 'mm/dd hh24:mi'), (select sum(seat_valid) from seat group by seat_valid), 2, 1);
insert into movieseat values(4, to_date('07/24 20:00', 'mm/dd hh24:mi'), (select sum(seat_valid) from seat group by seat_valid), 2, 5);
insert into movieseat values(5, to_date('07/24 00:00', 'mm/dd hh24:mi'), (select sum(seat_valid) from seat group by seat_valid), 3, 2);

--seat insert
insert into seat values(1, 1, 1, null);
insert into seat values(1, 2, 1, null);
insert into seat values(1, 3, 1, null);
insert into seat values(1, 4, 1, null);
insert into seat values(1, 5, 1, null);
insert into seat values(1, 6, 1, null);
insert into seat values(1, 7, 1, null);
insert into seat values(1, 8, 1, null);
insert into seat values(1, 9, 1, null);
insert into seat values(1, 10, 1, null);

insert into seat values(2, 1, 1, null);
insert into seat values(2, 2, 1, null);
insert into seat values(2, 3, 1, null);
insert into seat values(2, 4, 1, null);
insert into seat values(2, 5, 1, null);
insert into seat values(2, 6, 1, null);
insert into seat values(2, 7, 1, null);
insert into seat values(2, 8, 1, null);
insert into seat values(2, 9, 1, null);
insert into seat values(2, 10, 1, null);

insert into seat values(3, 1, 1, null);
insert into seat values(3, 2, 1, null);
insert into seat values(3, 3, 1, null);
insert into seat values(3, 4, 1, null);
insert into seat values(3, 5, 1, null);
insert into seat values(3, 6, 1, null);
insert into seat values(3, 7, 1, null);
insert into seat values(3, 8, 1, null);
insert into seat values(3, 9, 1, null);
insert into seat values(3, 10, 1, null);

insert into seat values(4, 1, 1, null);
insert into seat values(4, 2, 1, null);
insert into seat values(4, 3, 1, null);
insert into seat values(4, 4, 1, null);
insert into seat values(4, 5, 1, null);
insert into seat values(4, 6, 1, null);
insert into seat values(4, 7, 1, null);
insert into seat values(4, 8, 1, null);
insert into seat values(4, 9, 1, null);
insert into seat values(4, 10, 1, null);

insert into seat values(5, 1, 1, null);
insert into seat values(5, 2, 1, null);
insert into seat values(5, 3, 1, null);
insert into seat values(5, 4, 1, null);
insert into seat values(5, 5, 1, null);
insert into seat values(5, 6, 1, null);
insert into seat values(5, 7, 1, null);
insert into seat values(5, 8, 1, null);
insert into seat values(5, 9, 1, null);
insert into seat values(5, 10, 1, null);

--update movieseat
update movieseat set rest_seat = (select sum(seat_valid) from seat where m_seat_no = 1) where m_seat_no = 1;
update movieseat set rest_seat = (select sum(seat_valid) from seat where m_seat_no = 2) where m_seat_no = 2;
update movieseat set rest_seat = (select sum(seat_valid) from seat where m_seat_no = 3) where m_seat_no = 3;
update movieseat set rest_seat = (select sum(seat_valid) from seat where m_seat_no = 4) where m_seat_no = 4;
update movieseat set rest_seat = (select sum(seat_valid) from seat where m_seat_no = 5) where m_seat_no = 5;


--coupon insert
insert into coupon values(1,'회원가입할인',10);
insert into coupon values(2,'오픈기념할인',20);
insert into coupon values(3,'우리모두할인',30);



--cus insert
insert into customer_info values(cus_no_seq.nextval, '사과성민', '정성민', 'seongmin', '1234', to_date('19970902', 'yyyy/mm/dd'), 'M', 01012345678, 'seongmin@naver.com', 0, null);
insert into customer_info values(cus_no_seq.nextval, '포도예지', '한예지', 'yeji', '2345', '19951211', 'F', 01011112222, 'yeji@naver.com', 0, null);
insert into customer_info values(cus_no_seq.nextval, '감귤준영', '박준영', 'junyeung', '3456', '19910120', 'M', 01033335555, 'junyeung@naver.com', 0, null);
insert into customer_info values(cus_no_seq.nextval, '참외우혁', '이우혁', 'woohuck', '4567', '19971120', 'M', 01066667777, 'woohuck@naver.com', 0, null);
insert into customer_info values(cus_no_seq.nextval, '멜론정현', '이정현', 'jeonghun', '5678', '19961008', 'F', 01088889999, 'jeonghun@naver.com', 0, null);
insert into customer_info values(cus_no_seq.nextval, '키위희진', '이희진', 'hejin', '6789', '19930204', 'F', 01099991111, 'hejin@naver.com', 0, null);
insert into customer_info values(cus_no_seq.nextval, '자두현정', '임현정', 'hunjung', '7891', '19940504', 'F', 01022223333, 'hunjung@naver.com', 0, null);


commit;

------------------------여기까지 기본데이터 ------------------------------------
select * from cus;
update cus set cus_nickname='', cus_password='', cus_phone= '', cus_email = '' where cus_id = 'se';
delete cus where cus_id = 'aa';

select to_char(cus_birthday, 'mm/dd') from cus where cus_no = 3;

insert into cus values(cus_no_seq.nextval, 'aa', 'aa', 'aa', '1234', '19970902', 'F', 'aa', 'aa');
