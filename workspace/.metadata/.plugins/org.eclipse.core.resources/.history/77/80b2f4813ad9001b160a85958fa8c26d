package com.jhl.poli.controller;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jhl.poli.service.TestService;

@Controller
public class HomeController {
	
	@Inject
	TestService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {
		
		String test = service.getData();
		
		model.addAttribute("test", test);
		
		return "home";
	}
	
}
