package com.jar.jam.web.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.jar.jam.service.UserService;

@Controller
@RequestMapping(method = RequestMethod.GET)
@SessionAttributes("currentUser")
public class SigninController {

    @Autowired
    private UserService userService;

    @RequestMapping("/signin")
    public String getLoginPage(@RequestParam(value = "error", required = false) boolean error, ModelMap model) {
	if (error == true) {
	    model.put("error", "You have entered an invalid email or password!");
	} else {
	    model.put("error", "");
	}
	return "signin";
    }

    @RequestMapping("/logout")
    public String onLogout(HttpServletRequest request) {
	request.getSession().removeAttribute("currentUser");
	return "home";
    }

}
