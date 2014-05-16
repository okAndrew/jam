package com.jar.jam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jar.jam.domain.model.CookBook;
import com.jar.jam.service.impl.CookBookServiseImpl;
import com.jar.jam.service.impl.UserServiceImpl;

@Controller
public class CookBooksController {

	@Autowired
	private CookBookServiseImpl cookBookServiseImpl;

	@Autowired
	private UserServiceImpl userServiceImpl;

	@RequestMapping(value = "/cookbooks", method = RequestMethod.GET)
	public String showPage(ModelMap model) {
		model.addAttribute("cookBook", new CookBook());
		System.out.println("###########################################################");
		System.out.println(userServiceImpl.get(1L));
		System.out.println("###########################################################");
		System.out.println(cookBookServiseImpl.getAllByUser(userServiceImpl.get(1L)));
		model.addAttribute("cookBooks",
				cookBookServiseImpl.getAllByUser(userServiceImpl.get(1L)));
		return "cookBooks";
	}

	// @RequestMapping(value = "/create-book", method = RequestMethod.GET)
	// public String showCreateBookPage(ModelMap model) {
	// model.addAttribute("cookBook", new CookBook());
	// return "createBook";
	// }

	@RequestMapping(value = "/create-book", method = RequestMethod.POST)
	public String createNewCookBook(
			@ModelAttribute("cookBook") CookBook cookBook, BindingResult result) {
		cookBookServiseImpl.create(cookBook);
		return "redirect:cookbooks";
	}

}