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
		//파람으로 넘어온 글번호를 변수에 저장
//		Object postNum = (Integer)Integer.parseInt(request.getParameter("postNum"));
		//PostVO 객체에 글번호 저장		
		postVO.setPostNum(postNum);
		//조회수 업데이트
		service.updateViews(postVO);
		//커밋
		service.doCommit();
		//특정 게시글 가져오기
		List<PostVO> post = service.getPostByPostNum(postVO);
		model.addAttribute("post", post);
		return "mentoPage";
	}
}
