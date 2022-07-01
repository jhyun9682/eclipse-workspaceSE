/***************회원******************/
--회원정보보기(select pk)
select * from userinfo where userid='guard1';
--회원정보수정(update pk)
update userinfo set password='1111',name='김변경',email='change@naver.com' where userid='guard1';
--회원탈퇴(delete pk)
delete userinfo where userid='guard4';



/****************제품*****************/
--제품리스트
select * from product;
--제품상세보기
select * from product where p_no=1;
--제품수정(X)
--제품삭제(X)
--제품추가(X)

/**************cart******************/


--로그인한멤버(guard1) 의 카트아이템리스트(cart)
select * from cart where userid='guard1';
--로그인한멤버(guard1) 의 카트아이템리스트(cart + product)
select * from cart c join product p on c.p_no=p.p_no where userid='guard1';

--로그인한멤버(guard1) 의 카트아이템한개삭제(pk) 
delete from cart where cart_no=1;

--로그인한멤버(guard1) 의 카트아이템 제품1개의수량변경(pk)
update cart set cart_qty = 8 where  cart_no = 2;

--로그인한멤버(guard1) 의 카트아이템 리스트에 제품의수 
select count(*) as "cnt" from cart where userid='guard1' and p_no=7;
select count(*) as "cnt" from cart where userid='guard1' and p_no=1;

--로그인한멤버(guard1)의 카트에제품추가시에수정
update cart set cart_qty = cart_qty+1 where p_no=7 and userid='guard1';



















