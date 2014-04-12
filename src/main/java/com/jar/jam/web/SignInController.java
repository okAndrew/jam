package com.jar.jam.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignInController {

	@RequestMapping(value = { "/signin"}, method = {RequestMethod.GET})
	public String openSignInPage(ModelMap model) {
		model.addAttribute("message", "Signin page");
		return "signin";
	}
	
}
