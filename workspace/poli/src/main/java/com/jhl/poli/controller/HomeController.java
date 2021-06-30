package com.jhl.poli.controller;

import java.io.IOException;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jhl.poli.service.TestService;

@Controller
public class HomeController {

	@Inject
	TestService service;

	@RequestMapping(value = "/favicon.ico", method = RequestMethod.GET)

	public void favicon(HttpServletRequest request, HttpServletResponse reponse) {
		try {
			reponse.sendRedirect("/resources/favicon.ico");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {

		String test = service.getData();

		model.addAttribute("test", test);

		return "home";
	}

}
