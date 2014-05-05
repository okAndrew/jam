package com.jar.jam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jar.jam.domain.model.User;
import com.jar.jam.service.impl.PhotoServiceImpl;
import com.jar.jam.service.impl.UserServiceImpl;

@Controller
public class ProfileController {

	@Autowired
	private UserServiceImpl userService;

	@Autowired
	private PhotoServiceImpl photoServiceImpl;

	@RequestMapping(value = { "/profile" }, method = { RequestMethod.GET })
	public String openProfilePage(ModelMap model) {
		model.addAttribute("user", userService.get(1L));
		model.addAttribute("message", "Profile page");
		addAvatar(model, userService.get(1L));
		return "profile";
	}

	@RequestMapping(value = { "/profile" }, method = { RequestMethod.POST })
	public String changeDataUser(@ModelAttribute("user") User user,
			BindingResult result) {
		userService.update(user);
		return "profile";
	}

	private void addAvatar(ModelMap model, User user) {
		if (photoServiceImpl.getAvatarByUser(user).getPath() != null
				&& photoServiceImpl.getAvatarByUser(user).getPath() != "") {
			model.addAttribute("userAvatar",
					photoServiceImpl.getAvatarByUser(user).getPath());
		}
	}

}