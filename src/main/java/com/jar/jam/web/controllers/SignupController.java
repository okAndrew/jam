package com.jar.jam.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jar.jam.domain.enums.UserRole;
import com.jar.jam.domain.model.User;
import com.jar.jam.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/signup")
public class SignupController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user, BindingResult result) {
	user.setRole(UserRole.USER);
	user.setRaiting(0D);
	user.setIsDelete(true);
	userService.create(user);
	return "home";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String addUser(Model model) {
	model.addAttribute("user", new User());
	return "signup";
    }
}