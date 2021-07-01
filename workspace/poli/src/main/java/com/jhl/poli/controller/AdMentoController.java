package com.jhl.poli.controller;

import java.util.List;

import javax.inject.Inject;

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
		
		List<PostVO> mento = service.getAllMento();
		
		System.out.println(mento.get(0).getRegDate());
		
		model.addAttribute("mento", mento);
		
		return "adMentoPage";
	}
	
}
