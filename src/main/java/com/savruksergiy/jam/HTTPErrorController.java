package com.savruksergiy.jam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTTPErrorController {

    @RequestMapping(value = "/errors/400.html")
    public String handle400(ModelMap model) {
        model.addAttribute("errorCode", "400");
        return "errorPageTemplate";
    }

    @RequestMapping(value = "/errors/404.html")
    public String handle404(ModelMap model) {
        model.addAttribute("errorCode", "404");
        return "errorPageTemplate";
    }

    @RequestMapping(value = "/errors/500.html")
    public String handle500(ModelMap model) {
        model.addAttribute("errorCode", "500");
        return "errorPageTemplate";
    }

}
