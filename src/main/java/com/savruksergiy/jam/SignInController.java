package com.savruksergiy.jam;

import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignInController {
	
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;

	@RequestMapping(method = RequestMethod.GET, value = "/signin")
	public String signIn(ModelMap model) {
		model.addAttribute("message", "sign in");
		return "signin";
	}
	
}
