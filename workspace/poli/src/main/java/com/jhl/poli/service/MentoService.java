package com.jhl.poli.service;

import java.util.List;

import com.jhl.poli.vo.PostVO;

public interface MentoService {

	public List<PostVO> getAllMento() throws Exception;

	public void updateViews(PostVO postVO) throws Exception;

	public void doCommit() throws Exception;

	public List<PostVO> getPostByPostNum(PostVO postVO) throws Exception;

	public void insertPost(PostVO postVO) throws Exception;

}
