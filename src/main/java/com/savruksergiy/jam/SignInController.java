package com.savruksergiy.jam;

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
        return "sign_in";
    }

}
