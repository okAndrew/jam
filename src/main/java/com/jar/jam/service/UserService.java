package com.jar.jam.service;

import com.jar.jam.domain.model.User;

public interface UserService extends GenericService<User> {

    User getUserByLogin(String login);

    User findByEmail(String name);

}
