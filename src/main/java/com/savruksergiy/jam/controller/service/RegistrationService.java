package com.savruksergiy.jam.controller.service;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.savruksergiy.jam.model.User;
import com.savruksergiy.jam.utils.HibernateUtil;

@Controller
public class RegistrationService {

    @RequestMapping(method = RequestMethod.GET, value = "/registration")
    public String registerPage(ModelMap model) {
        model.addAttribute("message", "Registration GET");
        registerUser();
        return "registration";
    }

    public void registerUser() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        User user = new User();
        user.setLogin("login");
        user.setEmail("email");
        user.setPassword("password");
        user.setKarma(0d);
        user.setIsBanned(false);
        user.setIsDelete(false);
        
        session.save(user);
        session.getTransaction().commit();
    }

}
