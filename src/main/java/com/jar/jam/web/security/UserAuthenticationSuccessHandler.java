package com.jar.jam.web.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.jar.jam.domain.model.User;
import com.jar.jam.service.UserService;

@Component("userAuthenticationSuccessHandler")
public class UserAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
    private static final Logger logger = Logger.getLogger(CustomUserDetailsServiceImpl.class);
    @Autowired
    private UserService userService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
	User user = userService.findByEmail(authentication.getName());
	request.getSession().setAttribute("currentUser", user);
	super.onAuthenticationSuccess(request, response, authentication);
    }

    public UserService getUserService() {
	return userService;
    }

    public void setUserService(UserService userService) {
	this.userService = userService;
    }
}
