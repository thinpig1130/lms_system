package com.itperson.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private SqlSession sqlSession;	
	
	/*----------------------------------- 학습현황 tab-------------------------------------- */
	@RequestMapping(value = "/status")
	public String userStatus( Model model, HttpServletRequest request) {
//		model.addAttribute("request", request);
//		MemberJoinService service = new MemberJoinService(sqlSession);
//		service.execute(model);
//		
		model.addAttribute("page_name", "학습현황");
		return "user/status";
	}
	
	/*----------------------------------- 학습하기 tab-------------------------------------- */
	@RequestMapping(value = "/study")
	public String userStudy( Model model, HttpServletRequest request) {	
		model.addAttribute("page_name", "학습하기");
		return "user/study";
	}
	
	@RequestMapping(value = "/study/apply")
	public String userStudyApply( Model model, HttpServletRequest request) {
		
		model.addAttribute("page_name", "개설된 학습 정보");
		return "user/study_apply";
	}
	
	@RequestMapping(value = "/study/applyform")
	public String userStudyApplyForm( Model model, HttpServletRequest request) {
		
		model.addAttribute("page_name", "학습 계획서 작성");
		return "user/study_applyform";
	}
	
	
	/*----------------------------------- 문제풀기 tab-------------------------------------- */
	@RequestMapping(value = "/testing")
	public String userTesting( Model model, HttpServletRequest request) {
		
		model.addAttribute("page_name", "문제풀기");
		return "user/testing";
	}
	
	@RequestMapping(value = "/review")
	public String userReview( Model model, HttpServletRequest request) {
		
		model.addAttribute("page_name", "복습하기");
		return "user/review";
	}
	
	/*----------------------------------- 관리자에게 문의 tab (재만) -------------------------------------- */
	@RequestMapping(value = "/demands")
	public String userDemands( Model model, HttpServletRequest request) {
      
		model.addAttribute("page_name", "관리자에게 문의");
		return "user/demands";
	}
	@RequestMapping(value = "/demands_question")
	public String userDemandsQuestion( Model model, HttpServletRequest request) {
      
		model.addAttribute("page_name", "관리자에게 문의");
		return "user/demands_question";
	}

}
