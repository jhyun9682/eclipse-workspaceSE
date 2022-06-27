

/* Create Tables */

CREATE TABLE Account
(
	PAY varchar2(10) NOT NULL,
	USER_TOTAL_DISCOUNT varchar2(10) NOT NULL UNIQUE,
	ACCOUNT varchar2(20) NOT NULL UNIQUE,
	USER_NAME varchar2(10) NOT NULL UNIQUE
);


CREATE TABLE Card
(
	PAY varchar2(10) NOT NULL,
	USER_TOTAL_DISCOUNT varchar2(10) NOT NULL UNIQUE,
	CARD_COMPANY varchar2(30) NOT NULL UNIQUE,
	CARD_NO varchar2(20) NOT NULL UNIQUE,
	CARD_PASSWORD number NOT NULL UNIQUE
);


CREATE TABLE CinemaPay
(
	PAY varchar2(10) NOT NULL,
	COUPON varchar2(10),
	USER_POINT varchar2(10),
	ADMIN_MOVIE_PRICE varchar2(20) NOT NULL UNIQUE,
	USER_TOTAL_PRICE varchar2(20) NOT NULL UNIQUE,
	TICKET varchar2(30) NOT NULL,
	PRIMARY KEY (PAY)
);



/* Create Foreign Keys */

ALTER TABLE Account
	ADD FOREIGN KEY (PAY)
	REFERENCES CinemaPay (PAY)
;


ALTER TABLE Card
	ADD FOREIGN KEY (PAY)
	REFERENCES CinemaPay (PAY)
;


