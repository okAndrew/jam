package com.jar.jam.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = { "/", "/home" }, method = {RequestMethod.GET})
	public String openHomePage(ModelMap model) {
		model.addAttribute("message", "Home page");
		return "home";
	}
}
