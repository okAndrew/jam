package com.savruksergiy.jam;

import com.savruksergiy.jam.controller.dao.UserDAO;
import com.savruksergiy.jam.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: sergiy
 * Date: 11/20/13
 * Time: 11:51 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class SignInController {

    @RequestMapping(method = RequestMethod.GET, value = "/sign_in")
    public String signIn() {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

        UserDAO userDAO = (UserDAO) context.getBean("userDAO");
        User user = new User();
        user.setLogin("Sergiy");
        user.setEmail("savruksergiy@gmail.com");
        user.setPassword("11223344");
        user.setSex("male");

        userDAO.insert(user);

        return "signin";
    }

}
