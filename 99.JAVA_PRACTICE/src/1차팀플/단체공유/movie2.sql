DROP TABLE reservation_info CASCADE CONSTRAINTS;
DROP TABLE payment CASCADE CONSTRAINTS;
DROP TABLE customer_info CASCADE CONSTRAINTS;



CREATE TABLE customer_info(
		cus_id                        		VARCHAR2(12)		 NULL ,
		cus_no                        		NUMBER(5)		 NULL ,
		cus_nickname                  		VARCHAR2(15)		 NULL ,
		cus_name                      		VARCHAR2(15)		 NULL ,
		cus_password                  		VARCHAR2(12)		 NULL ,
		cus_birthday                  		DATE		 NULL ,
		cus_gender                    		CHAR(1)		 NULL ,
		cus_phone                     		VARCHAR2(13)		 NULL ,
		cus_email                     		VARCHAR2(30)		 NULL ,
		cus_point                     		NUMBER(10)		 NULL ,
		coupon_no                     		NUMBER(10)		 NULL 
);

DROP SEQUENCE customer_info_cus_no_SEQ;

CREATE SEQUENCE customer_info_cus_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




CREATE TABLE payment(
		payment_no                    		NUMBER(10)		 NULL ,
		payment_date                  		DATE		 DEFAULT sysdate		 NULL ,
		coupon_no                     		NUMBER(10)		 NULL ,
		card_name                     		VARCHAR2(10)		 NULL ,
		seat_no                       		NUMBER(2)		 NULL ,
		price_no                      		NUMBER(10)		 NULL 
);


CREATE TABLE reservation_info(
		reservation_no                		NUMBER(10)		 NULL ,
		payment_no                    		NUMBER(10)		 NULL ,
		cus_id                        		VARCHAR2(12)		 NULL 
);




ALTER TABLE customer_info ADD CONSTRAINT IDX_customer_info_PK PRIMARY KEY (cus_id);
ALTER TABLE customer_info ADD CONSTRAINT IDX_customer_info_FK0 FOREIGN KEY (coupon_no) REFERENCES coupon_info (coupon_no);

ALTER TABLE payment ADD CONSTRAINT IDX_payment_PK PRIMARY KEY (payment_no);
ALTER TABLE payment ADD CONSTRAINT IDX_payment_FK0 FOREIGN KEY (coupon_no) REFERENCES coupon_info (coupon_no);
ALTER TABLE payment ADD CONSTRAINT IDX_payment_FK1 FOREIGN KEY (card_name) REFERENCES credit_card (card_name);
ALTER TABLE payment ADD CONSTRAINT IDX_payment_FK2 FOREIGN KEY (seat_no) REFERENCES seat (seat_no);
ALTER TABLE payment ADD CONSTRAINT IDX_payment_FK3 FOREIGN KEY (price_no) REFERENCES price_info (price_no);

ALTER TABLE reservation_info ADD CONSTRAINT IDX_reservation_info_PK PRIMARY KEY (reservation_no);
ALTER TABLE reservation_info ADD CONSTRAINT IDX_reservation_info_FK0 FOREIGN KEY (cus_id) REFERENCES customer_info (cus_id);
ALTER TABLE reservation_info ADD CONSTRAINT IDX_reservation_info_FK1 FOREIGN KEY (payment_no) REFERENCES payment (payment_no);

