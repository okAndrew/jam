package com.savruksergiy.jam;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private static Logger logger = Logger.getLogger(HomeController.class);

    @RequestMapping({"/", "/home"})
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Home page");
		return "home";
	}
}