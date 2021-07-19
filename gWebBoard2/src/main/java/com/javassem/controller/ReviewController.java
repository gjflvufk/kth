package com.javassem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.service.ReviewServiceImpl;

@Controller
public class ReviewController {
	
	
	@Autowired
	ReviewServiceImpl reviewService;
	@RequestMapping("review.do")
	public void review(Model m) {
		String result= reviewService.review();
		m.addAttribute("result", result);
	}

}
