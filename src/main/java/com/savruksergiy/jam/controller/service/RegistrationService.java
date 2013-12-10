package com.savruksergiy.jam.controller.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: sergiy
 * Date: 12/9/13
 * Time: 1:58 PM
 */

@Controller
public class RegistrationService {

    @RequestMapping(method = RequestMethod.POST, value = "/registration")
    public String registerPage(ModelMap model) {
        model.addAttribute("message", "Registration POST");
        return "registration";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/registration")
    public String registerUser(ModelMap model) {
        model.addAttribute("message", "Registration GET");
        return "registration";
    }

}
