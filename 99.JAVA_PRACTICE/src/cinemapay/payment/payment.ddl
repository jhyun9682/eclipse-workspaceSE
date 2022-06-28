DROP TABLE Account CASCADE CONSTRAINTS;
DROP TABLE Card CASCADE CONSTRAINTS;
DROP TABLE payment CASCADE CONSTRAINTS;
DROP TABLE reservation CASCADE CONSTRAINTS;
DROP TABLE customer CASCADE CONSTRAINTS;

CREATE TABLE customer(
		user_uid                      		NUMBER(6)		 NOT NULL,
		user_id                       		VARCHAR2(30)		 NULL ,
		user_pw                       		VARCHAR2(30)		 NULL ,
		user_name                     		VARCHAR2(20)		 NULL ,
		user_tel                      		VARCHAR2(12)		 NULL 
);


CREATE TABLE reservation(
		reservation_uid               		NUMBER(6)		 NOT NULL,
		ticket_uid1                   		NUMBER(6)		 NULL 
);


CREATE TABLE payment(
		payment_uid                   		NUMBER(10)		 NULL ,
		coupon                        		VARCHAR2(10)		 NULL ,
		user_point                    		VARCHAR2(10)		 NOT NULL,
		admin_movie_price             		VARCHAR2(20)		 NOT NULL,
		total_price                   		NUMBER(8)		 NOT NULL,
		payment_option                		VARCHAR2(20)		 NOT NULL,
		payment_date                  		DATE		 NULL ,
		user_uid                      		NUMBER(6)		 NULL ,
		reservation_uid               		NUMBER(6)		 NULL 
);


CREATE TABLE Card(
		card_company                  		VARCHAR2(10)		 NULL ,
		card_no                       		NUMBER(12)		 NOT NULL,
		card_password                 		NUMBER(4)		 NOT NULL,
		total_price                   		NUMBER(8)		 NULL 
);


CREATE TABLE Account(
		account                       		VARCHAR2(10)		 NOT NULL,
		user_name                     		VARCHAR2(10)		 NOT NULL,
		total_price                   		NUMBER(8)		 NULL 
);



ALTER TABLE customer ADD CONSTRAINT IDX_customer_PK PRIMARY KEY (user_uid);

ALTER TABLE reservation ADD CONSTRAINT IDX_reservation_PK PRIMARY KEY (reservation_uid);

ALTER TABLE payment ADD CONSTRAINT IDX_payment_PK PRIMARY KEY (total_price);
ALTER TABLE payment ADD CONSTRAINT IDX_payment_FK0 FOREIGN KEY (user_uid) REFERENCES customer (user_uid);
ALTER TABLE payment ADD CONSTRAINT IDX_payment_FK1 FOREIGN KEY (reservation_uid) REFERENCES reservation (reservation_uid);

ALTER TABLE Card ADD CONSTRAINT IDX_Card_FK0 FOREIGN KEY (total_price) REFERENCES payment (total_price);

ALTER TABLE Account ADD CONSTRAINT IDX_Account_FK0 FOREIGN KEY (total_price) REFERENCES payment (total_price);

