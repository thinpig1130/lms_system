CREATE TABLE "MY_COURSE"(
    "CO_CODE" CHAR(3),
    "MEM_ID" VARCHAR2(50),
    "PLAN" NUMBER(1), -- 0 (무계획) / 1 (계획)
    "RANGE" NUMBER(1), -- 1 (중요도 A만 학습), 2 (중요도 B까지 학습), 3 ( 중요한 것 부터 학습), 4 ( 차근차근 순차 학습 ) 
    "DAYS" NUMERIC,
    "START_DATE" DATE,
    "END_DATE" DATE,
    PRIMARY KEY (CO_CODE, MEM_ID), 
    FOREIGN KEY (CO_CODE) REFERENCES "COURSE"(CODE),
    FOREIGN KEY (MEM_ID) REFERENCES "MEMBER"(ID)
);

DROP TABLE MY_COURSE;