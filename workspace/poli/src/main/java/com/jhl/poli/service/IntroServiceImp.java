package com.jhl.poli.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.jhl.poli.dao.IntroDAO;
import com.jhl.poli.vo.PostVO;

@Service
public class IntroServiceImp implements IntroService {
	
	@Inject
	IntroDAO dao;
	
	@Override
	public List<PostVO> getAllIntro() throws Exception{
		return dao.getAllIntro();
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
