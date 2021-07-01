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
}
