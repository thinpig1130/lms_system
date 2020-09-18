package com.itperson.dao;

import org.apache.ibatis.annotations.Param;

public interface TestLogDao {
	public void registLog(@Param("coCode") String coCode, @Param("score") int score, @Param("correct") int correct, @Param("questions") int questions);
}
