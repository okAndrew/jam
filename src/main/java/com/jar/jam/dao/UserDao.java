package com.jar.jam.dao;

import com.jar.jam.domain.model.User;
import com.jar.jam.exceptions.users.UserNotFoundException;

public interface UserDao extends GenericDao<User> {

    User getUserByLogin(String login) throws UserNotFoundException;

    User findByEmail(String name);

}
