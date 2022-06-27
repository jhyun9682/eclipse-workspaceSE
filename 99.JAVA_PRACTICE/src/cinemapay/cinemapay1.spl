DROP TABLE Account CASCADE CONSTRAINTS;
DROP TABLE Card CASCADE CONSTRAINTS;
DROP TABLE CinemaPay CASCADE CONSTRAINTS;

CREATE TABLE CinemaPay(
		PAY                           		VARCHAR2(10)		 NOT NULL,
		COUPON                        		VARCHAR2(10)		 NULL ,
		USER_POINT                    		VARCHAR2(10)		 NULL ,
		ADMIN_MOVIE_PRICE             		VARCHAR2(20)		 NOT NULL,
		USER_TOTAL_PRICE              		VARCHAR2(20)		 NOT NULL,
		TICKET                        		VARCHAR2(30)		 NOT NULL
);


CREATE TABLE Card(
		USER_TOTAL_DISCOUNT           		VARCHAR2(10)		 NOT NULL,
		CARD_COMPANY                  		VARCHAR2(30)		 NOT NULL,
		CARD_NO                       		VARCHAR2(20)		 NOT NULL,
		CARD_PASSWORD                 		NUMBER		 NOT NULL,
		PAY                           		VARCHAR2(10)		 NULL 
);


CREATE TABLE Account(
		USSER_TOTAL_DISCOUNT          		VARCHAR2(10)		 NOT NULL,
		ACCOUNT                       		VARCHAR2(20)		 NOT NULL,
		USER_NAME                     		VARCHAR2(10)		 NOT NULL,
		PAY                           		VARCHAR2(10)		 NULL 
);



ALTER TABLE CinemaPay ADD CONSTRAINT IDX_CinemaPay_PK PRIMARY KEY (PAY);

ALTER TABLE Card ADD CONSTRAINT IDX_Card_FK0 FOREIGN KEY (PAY) REFERENCES CinemaPay (PAY);

ALTER TABLE Account ADD CONSTRAINT IDX_Account_FK0 FOREIGN KEY (PAY) REFERENCES CinemaPay (PAY);

