package com.itperson.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

public interface Service {
	
	void execute(Model model);
}
