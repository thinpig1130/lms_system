CREATE TABLE "STUDY_LOG"(
    "MEM_ID" VARCHAR2(50),
    "STU_CODE" CHAR(10),
    "REG_DATE" DATE,
    FOREIGN KEY (MEM_ID) REFERENCES "MEMBER"(ID),
    FOREIGN KEY (STU_CODE) REFERENCES "STUDY_CONTENTS"(CODE)
);

SELECT *
FROM STUDY_LOG;

-- STUDY LOG를 삽입하는 부분 
INSERT INTO STUDY_LOG(MEM_ID,STU_CODE,REG_DATE) VALUES ('tp1130', '010101C001', SYSDATE);
INSERT INTO STUDY_LOG(MEM_ID,STU_CODE,REG_DATE) VALUES ('tp1130', '010101C002', SYSDATE);
INSERT INTO STUDY_LOG(MEM_ID,STU_CODE,REG_DATE) VALUES ('tp1130', '010101C001', SYSDATE);


SELECT CO_CODE, NAME AS CO_NAME, MEM_ID, PLAN, PRIORITY, DAYS_PER_WEEK, APPLY_DATE, EXPECTED_END_DATE, CEIL(EXPECTED_END_DATE - SYSDATE)+1 AS DAYS_LEFT
FROM MY_COURSE mc, COURSE co 
WHERE mc.CO_CODE = co.CODE
AND MEM_ID='tp1130';

-- 전체 학습의 개수 조회
SELECT  CO_CODE, count(*) AS CONTNET_COUNT
FROM VW_STUDY_CONTENTS_LIST 
GROUP BY CO_CODE;

-- 남은 학습의 개수를 조회
SELECT CO_CODE, count(*) AS REMANING_STUDY_COUNT
FROM VW_STUDY_CONTENTS_LIST
WHERE CODE NOT IN (
    SELECT DISTINCT(STU_CODE) 
    FROM STUDY_LOG
    WHERE MEM_ID='tp1130'
    )
GROUP BY CO_CODE ;

--학습별 학습한 횟수, 마지막 공부한 날짜 조회
SELECT STU_CODE, COUNT(*) AS CNT , MAX(REG_DATE) AS LAST_DATE
FROM STUDY_LOG
GROUP BY STU_CODE;

commit;


SELECT  CO_CODE, count(*) AS CONTNET_COUNT
FROM VW_STUDY_CONTENTS_LIST 
GROUP BY CO_CODE;


-- 쿼리문 합치기!! 
SELECT mc.CO_CODE, NAME AS CO_NAME, MEM_ID, PLAN, PRIORITY, DAYS_PER_WEEK, APPLY_DATE, EXPECTED_END_DATE, CEIL(EXPECTED_END_DATE - SYSDATE)+1 AS DAYS_LEFT, cnt.COUNT_CONTNETS, rst.COUNT_REMANING_CONTNETS
FROM MY_COURSE mc, COURSE co, 
    (
    SELECT CO_CODE, count(*) AS COUNT_CONTNETS
    FROM VW_STUDY_CONTENTS_LIST 
    GROUP BY CO_CODE) cnt, 
    (
    SELECT CO_CODE, count(*) AS COUNT_REMANING_CONTNETS
    FROM VW_STUDY_CONTENTS_LIST
    WHERE CODE NOT IN (
        SELECT DISTINCT(STU_CODE) 
        FROM STUDY_LOG
        WHERE MEM_ID='tp1130')
    GROUP BY CO_CODE ) rst
WHERE mc.CO_CODE = co.CODE AND cnt.CO_CODE = mc.CO_CODE AND mc.CO_CODE = rst.CO_CODE
    AND MEM_ID='tp1130';
