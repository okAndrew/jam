package com.savruksergiy.jam;

import com.savruksergiy.jam.model.User;
import com.savruksergiy.jam.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
        User user = new User();
        user.setLogin("user");
        user.setEmail("user@jam.com");
        user.setPassword("qwerty");

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        Long id = (Long) session.save(user);
        user.setId(id);

        session.getTransaction().commit();

        session.close();

        return "sign_in";
    }

}
