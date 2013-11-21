package com.savruksergiy.test5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: sergiy
 * Date: 11/21/13
 * Time: 12:04 AM
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class HTTPErrorController {

    @RequestMapping(value = "/errors/404.html")
    public String handle404(ModelMap model) {
        model.addAttribute("errorCode", "404");
        return "errorPageTemplate";
    }

}
