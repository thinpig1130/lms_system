CREATE TABLE "MY_COURSE"(
    "CO_CODE" CHAR(3),
    "MEM_ID" VARCHAR2(50),
    "PLAN" NUMBER(1), -- 0 (무계획) / 1 (계획)
    "RANGE" NUMBER(1), -- 1 (중요도 A만 학습), 2 (중요도 B까지 학습), 3 ( 중요한 것 부터 학습), 4 ( 차근차근 순차 학습 ) 
    "DAYS_PER_WEEK" NUMERIC,
    "APPLY_DATE" DATE,
    "EXPECTED_END_DATE" DATE,
    PRIMARY KEY (CO_CODE, MEM_ID), 
    FOREIGN KEY (CO_CODE) REFERENCES "COURSE"(CODE),
    FOREIGN KEY (MEM_ID) REFERENCES "MEMBER"(ID)
);

DROP TABLE MY_COURSE;

SELECT CEIL(EXPECTED_END_DATE - SYSDATE) AS D_DAYS
FROM MY_COURSE
WHERE CO_CODE="" AND MEM_ID="";

-- 미완기능 메모. 
	<select id="searchDDays" parameterType="map" resultMap="result">
		<![CDATA[
		SELECT CEIL(EXPECTED_END_DATE - SYSDATE) AS D_DAYS
		FROM MY_COURSE
		WHERE CO_CODE=#{coCode} AND #{memId}
		]]>
	</select>