package com.jhl.poli.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

import com.jhl.poli.dao.EmpowerDAO;
import com.jhl.poli.vo.PostVO;

@Service
public class EmpowerServiceImp implements EmpowerService {
	
	@Inject
	EmpowerDAO dao;
	
	@Override
	public List<PostVO> getAllEmpower() throws Exception{
		return dao.getAllEmpower();
	}
	
	@Override
	public void updateViews(PostVO postVO) throws Exception{
		dao.updateViews(postVO);
	}
	
	@Override
	public void doCommit() throws Exception{
		dao.doCommit();
	}
	
	@Override
	public List<PostVO> getPostByPostNum(PostVO postVO) throws Exception{
		return dao.getPostByPostNum(postVO);
	}
	
}
