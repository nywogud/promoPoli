package com.jhl.poli.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.jhl.poli.dao.SupportDAO;
import com.jhl.poli.vo.PostVO;

@Service
public class SupportServiceImp implements SupportService {
	
	@Inject
	SupportDAO dao;
	
	@Override
	public List<PostVO> getAllSupport() throws Exception{
		return dao.getAllSupport();
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
