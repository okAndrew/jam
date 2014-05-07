package com.jar.jam.rest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jar.jam.domain.model.User;
import com.jar.jam.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "{login}", method = RequestMethod.GET, produces = { "application/json" })
    public @ResponseBody
    User getUserById(HttpServletResponse response, @PathVariable String login) {
	User user = userService.getUserByLogin(login);

	if (user == null) {
	    response.setStatus(404);
	}

	return user;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public User createUser(@RequestBody User user) {
	userService.create(user);
	return user;
    }

}
