package com.javassem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javassem.dao.ReviewDAOImpl;

@Service("reviewService")
public class ReviewServiceImpl {
	
	
	@Autowired
	ReviewDAOImpl reviewDAO;
	
	public String review() {
		return reviewDAO.review();
		
	}
}
