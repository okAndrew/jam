package com.jar.jam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jar.jam.dao.UserDao;
import com.jar.jam.domain.model.User;
import com.jar.jam.exceptions.users.UserNotFoundException;
import com.jar.jam.service.UserService;

@Service
public class UserServiceImpl extends GenericServiceImpl<User> implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByLogin(String login) {
	User user;
	try {
	    user = userDao.getUserByLogin(login);
	} catch (UserNotFoundException userNotFoundException) {
	    user = null;
	}

	return user;
    }

    @Override
    public User findByEmail(String name) {
	return userDao.findByEmail(name);
    }
}
