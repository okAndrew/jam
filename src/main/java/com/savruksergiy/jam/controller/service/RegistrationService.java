package com.savruksergiy.jam.controller.service;

import com.savruksergiy.jam.controller.dao.UserDAO;
import com.savruksergiy.jam.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * User: sergiy
 * Date: 12/9/13
 * Time: 1:58 PM
 */

@Controller
public class RegistrationService {

    @RequestMapping(method = RequestMethod.GET, value = "/registration")
    public String registerPage(ModelMap model) {
        model.addAttribute("message", "Registration GET");
        return "registration";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/registration")
    public String registerUser(@RequestParam String login, @RequestParam String email, @RequestParam String password, @RequestParam String sex) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        User user = new User();
        UserDAO userDAO = (UserDAO) context.getBean("userDAO");

        user.setLogin(login);
        user.setPassword(password);
        user.setEmail(email);
        user.setSex(sex);

        userDAO.insert(user);

        return "registration";
    }

}
