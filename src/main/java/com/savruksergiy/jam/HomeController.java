package com.savruksergiy.jam;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private static Logger logger = Logger.getLogger(HomeController.class);

    @RequestMapping({"/javascript"})
    public String javaScriptPage() {
        return "javascript";
    }

    @RequestMapping({"/", "/home"})
    public String homePage(ModelMap model) {
        model.addAttribute("message", "Home page");
        return "home";
    }

    @RequestMapping({"/home/{page:[0-9]+}"}) 
	public String printWelcome(ModelMap model, @PathVariable("page") String pageStr) {
        int page = 0;

        try {
            page = Integer.valueOf(pageStr);
        } catch (NumberFormatException e) {
            page = 1;
        }

		model.addAttribute("message", "Home page: " + page);
		return "home";
	}
}