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
public class AdMentoController {

	@Inject
	MentoService service;

	@RequestMapping(value = "/adMento", method = RequestMethod.POST)
	public String home(Model model) throws Exception {
		
		List<PostVO> post = service.getAllMento();
		
		model.addAttribute("post", post);
		
		return "adMentoPage";
	}
	
	@RequestMapping(value="/adMentoModal", method= RequestMethod.POST)
	public String adMentoModal(Model model, HttpServletRequest request, PostVO postVO) throws Exception{
		int postNum = Integer.parseInt(request.getParameter("postNum"));
		postVO.setPostNum(postNum);
		List<PostVO> post = service.getPostByPostNum(postVO);
		model.addAttribute("post", post);
		return "viewModal";
	}
	
	@RequestMapping(value="/insertPostMento", method = RequestMethod.POST)
	public String insertPostMento(Model model, HttpServletRequest request, PostVO postVO) throws Exception {
		
		String title = request.getParameter("title");
		String content = request.getParameter("title");
		
		
		
		postVO.setTitle(title);
		postVO.setContent(content);
		
		
		
		service.insertPost(postVO);
		System.out.println(title);
		System.out.println(content);
		service.doCommit();
		
		List<PostVO> post = service.getAllMento();
		
		model.addAttribute("post", post);
				
		return "adMentoPage";
	}
	
	
	
}
