DROP DATABASE IF EXISTS CS129_Lot_DB;
CREATE DATABASE IF NOT EXISTS CS129_Lot_DB;
USE CS129_Lot_DB;

CREATE TABLE LOT_BLOCK(
	BLOCK_CODE VARCHAR(20) PRIMARY KEY,
    BLOCK_NAME VARCHAR(20),
    BLOCK_DESC VARCHAR(2048)
);

CREATE TABLE BUYER(
	BUYER_CODE VARCHAR(20) PRIMARY KEY,
    F_NAME VARCHAR(20),
    L_NAME VARCHAR(20),
    MID_INIT VARCHAR(20),
    M_NAME VARCHAR(20),
    CP_NUM VARCHAR(20),
    TEL_NUM VARCHAR(20),
    EMAIL VARCHAR(100),
    AGE INT
);


CREATE TABLE LOT(
	LOT_CODE VARCHAR(20) PRIMARY KEY,
	BLOCK_CODE VARCHAR(20) NOT NULL,
    CONSTRAINT FK_BLOCK_CODE FOREIGN KEY (BLOCK_CODE) REFERENCES LOT_BLOCK(BLOCK_CODE),
	BUYER_CODE VARCHAR(20) NOT NULL,
    CONSTRAINT FK_BUYER_CODE FOREIGN KEY (BUYER_CODE) REFERENCES BUYER(BUYER_CODE),
    LOT_NAME VARCHAR(20),
    LOT_DESC VARCHAR(2048),
    SQM DOUBLE,
    SQM_COST DOUBLE,
    TOTAL_COST DOUBLE
);
/*Initial Test Data:*/
/*Imagine these being spoken in the tone of an overzealous, oversized and overenergetic musclehead if it helps*/
INSERT INTO LOT_BLOCK VALUES ("MAKATI1","BIG HAUSES","MEGA BIG HAUSES FOR ALL YOUR HAUSING NEEDS");
INSERT INTO LOT_BLOCK VALUES ("MAKATI2","TINY HAUSES","SMALL MICRO HOMES FOR MIDGETS");
INSERT INTO LOT_BLOCK VALUES ("MAKATI3","NORMAL HAUSES","BIG HAUS FOR NORMAL PEOPLE");
INSERT INTO BUYER VALUES("NULL","","","","","","","",0);
INSERT INTO BUYER VALUES("BIGNORWAY","JORGEN","NOVGORODSKY","A","ROSENSTIEHL","+6391666696196","(052)-474-1888","JNOVGOROD@NORMAIL.COM",64);
INSERT INTO LOT VALUES ("BIGHAUS1","MAKATI1","BIGNORWAY","GIANT HAUS","WOW BIG VERY SIZE GOOD VALUE BUY NOW",140,184000,33745600);
INSERT INTO LOT VALUES ("BIGHAUS2","MAKATI1","NULL","GIANT HAUS","WOW BIG VERY SIZE GOOD VALUE BUY NOW",140,184000,33745600);
INSERT INTO LOT VALUES ("BIGHAUS3","MAKATI1","NULL","GIANT HAUS","WOW BIG VERY SIZE GOOD VALUE BUY NOW",140,184000,33745600);
INSERT INTO LOT VALUES ("BIGHAUS4","MAKATI1","NULL","GIANT HAUS","WOW BIG VERY SIZE GOOD VALUE BUY NOW",140,184000,33745600);
INSERT INTO LOT VALUES ("BIGHAUS5","MAKATI1","NULL","GIANT HAUS","WOW BIG VERY SIZE GOOD VALUE BUY NOW",140,184000,33745600);

