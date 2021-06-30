package com.jhl.poli.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jhl.poli.dao.TestDAO;

@Service
public class TestServiceImp implements TestService {
	
	@Inject
	TestDAO dao;
	
	public String getData() throws Exception{
		return dao.getData();
	}

}
