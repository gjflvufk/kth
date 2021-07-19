package com.javassem.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("reviewDAO")
public class ReviewDAOImpl {
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public String review() {
		return sqlSession.selectOne("review.getDate");
	}

}
