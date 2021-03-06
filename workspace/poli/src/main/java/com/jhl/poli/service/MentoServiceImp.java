package com.jhl.poli.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.jhl.poli.dao.MentoDAO;
import com.jhl.poli.vo.PostVO;

@Service
public class MentoServiceImp implements MentoService {
	
	@Inject
	MentoDAO dao;
	
	@Override
	public List<PostVO> getAllMento() throws Exception{
		return dao.getAllMento();
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
	
	@Override
	public void insertPost(PostVO postVO) throws Exception{
		dao.insertPost(postVO);
	}
	
}
