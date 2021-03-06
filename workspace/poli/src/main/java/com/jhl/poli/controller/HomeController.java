package com.jhl.poli.controller;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jhl.poli.service.EmpowerService;
import com.jhl.poli.service.IntroService;
import com.jhl.poli.service.MentoService;
import com.jhl.poli.service.SupportService;
import com.jhl.poli.vo.PostVO;

@Controller
public class HomeController {

	@Inject
	MentoService mentoService; 
	
	@Inject
	EmpowerService empowerService;
	
	@Inject
	SupportService supportService;
	
	@Inject
	IntroService introService;

	@RequestMapping(value = "/favicon.ico", method = RequestMethod.GET)

	public void favicon(HttpServletRequest request, HttpServletResponse reponse) {
		try {
			reponse.sendRedirect("/resources/favicon.ico");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) throws Exception {

		List<PostVO> mento = mentoService.getAllMento();
		List<PostVO> empower = empowerService.getAllEmpower();
		List<PostVO> support = supportService.getAllSupport();
		List<PostVO> intro = introService.getAllIntro();
		
		model.addAttribute("mento", mento);
		model.addAttribute("empower", empower);
		model.addAttribute("support", support);
		model.addAttribute("intro", intro);
		
		return "home";
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.POST)
	public String admin(Model model) throws Exception{
		
		List<PostVO> mento = mentoService.getAllMento();
		
		model.addAttribute("mento", mento);
		
		return "admin";
	}
}
