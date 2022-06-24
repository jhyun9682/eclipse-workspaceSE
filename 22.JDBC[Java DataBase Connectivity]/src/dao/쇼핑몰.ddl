DROP TABLE Board CASCADE CONSTRAINTS;

CREATE TABLE Board(
		board_no                      		NUMBER(10)		 NULL ,
		board_title                   		VARCHAR2(100)		 NOT NULL,
		board_content                 		VARCHAR2(512)		 NULL ,
		board_wday                    		DATE		 DEFAULT sysdate		 NULL ,
		board_read_count              		NUMBER(10)		 DEFAULT 0		 NULL 
);



ALTER TABLE Board ADD CONSTRAINT IDX_Board_PK PRIMARY KEY (board_no);

