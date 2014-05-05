package com.jar.jam.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cookbooks")
public class CookBooksController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String showPage(){
		return "cookBooks";
	}
}
