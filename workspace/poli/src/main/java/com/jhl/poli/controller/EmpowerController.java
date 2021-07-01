package com.jhl.poli.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jhl.poli.service.MentoService;
import com.jhl.poli.vo.PostVO;

@Controller
public class EmpowerController {

	@Inject
	MentoService service;
	
	@RequestMapping(value = "/mento", method = RequestMethod.POST)
	public String mento(Model model, HttpServletRequest request, PostVO postVO) throws Exception {
		
		int postNum = Integer.parseInt(request.getParameter("postNum").trim());
		//�Ķ����� �Ѿ�� �۹�ȣ�� ������ ����
//		Object postNum = (Integer)Integer.parseInt(request.getParameter("postNum"));
		//PostVO ��ü�� �۹�ȣ ����		
		postVO.setPostNum(postNum);
		//��ȸ�� ������Ʈ
		service.updateViews(postVO);
		//Ŀ��
		service.doCommit();
		//Ư�� �Խñ� ��������
		List<PostVO> post = service.getPostByPostNum(postVO);
		model.addAttribute("post", post);
		return "mentoPage";
	}
}
