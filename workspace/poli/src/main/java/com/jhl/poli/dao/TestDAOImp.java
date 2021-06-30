package com.jhl.poli.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAOImp implements TestDAO{
	
	private static final String namespace = "com.jhl.mapper.testMapper";
	
	@Inject
	SqlSession session; 

	public String getData() throws Exception{
		return session.selectOne(namespace + ".getData");
	}
}
