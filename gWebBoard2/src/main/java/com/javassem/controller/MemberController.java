package com.javassem.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javassem.dao.MemberDAO;
import com.javassem.domain.MemberVO;
import com.javassem.service.MemberService;

@Controller
@RequestMapping("/user")
public class MemberController {
	
	@RequestMapping("{url}.do")
	public String sample(@PathVariable String url) {
		return "/user/"+url;
	}
	
	@Autowired
	MemberService memberService;
	
	
	@RequestMapping("userInsert.do")
	public ModelAndView insert(MemberVO memberVO) {
		int result =memberService.userInsert(memberVO);
		String message = "가입되지않음";
		 if(result > 0)	message =memberVO.getUserName()	+"님 가입축하";
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/userJoin_ok");
		mv.addObject("result",result);
		mv.addObject("message", message);
		return mv;
	}
	
	@RequestMapping("login.do")
	public String login(MemberVO vo, HttpSession session) {
		/*
		 * 1.사용자 입력값 받아오기 
		 * 2.DB에 해당 정보가 있는지 확인 
		 * 3.해당정보가 있다면 로그인 성공 그리고 /user/Main.jsp 뷰페이지로 이동 
		 * 4.해당정보가 없다면 로그인 실패 /user/userLogin.jsp 뷰페이지로 이동
		 */
		MemberVO result = memberService.idCheck_Login(vo);
		if(result == null || result.getUserId()==null) {
			return "/user/userLogin";
		}else{//로그인성공
			session.setAttribute("userName", result.getUserId());
			session.setAttribute("sessionTime", new Date());
			return "/user/Main";
			
		}
	}
	@RequestMapping(value = "idCheck.do", produces="application/text;chareset=UTF-8")
	//************************************************
	@ResponseBody  //ajax이기 때문에 반드시responsebody 써줘야한다
	public String idCheck(MemberVO vo) {
		MemberVO result= memberService.idCheck_Login(vo);
		String message="사용가능아이디";
			if(result != null) message = "이미사용중";
			return message;
	}
}
