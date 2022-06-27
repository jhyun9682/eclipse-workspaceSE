--guest

desc guest;

--insert

insert into guest values(guest_guest_no_seq.nextval,'김경호',sysdate,
                        'guard@gmail.com','http://itwill.co.kr',
                        '방명록사용법','방명록처럼 사용하시면 됩니다.');

--pk update
update guest set guest_name='이름수정',
                guest_date=sysdate,
                guest_email='change@gmail.com',
                guest_homepage='http://www.change.com',
                guest_title='타이틀변경',
                guest_content='내용변경'
where guest_no=1;

--pk delete
delete guest where guest_no=1;

select * from guest;