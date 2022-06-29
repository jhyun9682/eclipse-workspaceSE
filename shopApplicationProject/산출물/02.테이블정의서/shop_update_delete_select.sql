/****회원****/

--회원정보보기(select pk)
select * from userinfo where userid='guard2';

--회원정보수정(update pk)
update userinfo set password='1111',name='김변경',email='change@naver.com' where userid='guard1';

--회원탈퇴(delete pk)
delete userinfo where userid='guard4';


/****제품****/
--제품리스트
select * from product;
--제품상세보기
select * from product where p_no=1;
--제품수정(X)
--제품삭제(X)
--제품추가(X)

/*****cart*****/
--로그인한 멤버(guard1)의 카트리스트(cart)
select * from cart where userid='guard1';
--로그인한 멤버(guard1)의 카트리스트(cart+product)
select * from cart c join product p on c.p_no=p.p_no where userid='guard1';
--로그인한 멤버(guard2)의 카트리스트(cart+product)
select * from cart c join product p on c.p_no=p.p_no where userid='guard2';
--

