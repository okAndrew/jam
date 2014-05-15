package com.jar.jam.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddNewRecipeController {

	@RequestMapping(value = {"/recipes/create"}, method = {RequestMethod.GET})
	public String openAddNewRecipePage(Model model) {
		model.addAttribute("message", "Add new recipe page");
		return "recipes/create";
	}
	
}
