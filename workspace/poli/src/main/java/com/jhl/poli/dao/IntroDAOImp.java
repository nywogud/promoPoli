package com.jhl.poli.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jhl.poli.vo.PostVO;

@Repository
public class IntroDAOImp implements IntroDAO {
	
	private static final String namespace = "com.jhl.mapper.introMapper";
	
	@Autowired
	SqlSession session;

	@Override
	public List<PostVO> getAllIntro() throws Exception{
		return session.selectList(namespace + ".getAllIntro");
	}
	
	@Override
	public void updateViews(PostVO postVO) throws Exception{
		session.update(namespace +".updateViews", postVO);
	}
	
	@Override
	public void doCommit() throws Exception{
		session.update(namespace + ".doCommit");
	}
	
	@Override
	public List<PostVO> getPostByPostNum(PostVO postVO) throws Exception{
		return session.selectList(namespace + ".getPostByPostNum" , postVO);
	}
	
}
