package com.jhl.poli.service;

import java.util.List;

import com.jhl.poli.vo.PostVO;

public interface IntroService {

	public List<PostVO> getAllIntro() throws Exception;

	public void updateViews(PostVO postVO) throws Exception;

	public void doCommit() throws Exception;

	public List<PostVO> getPostByPostNum(PostVO postVO) throws Exception;

}
