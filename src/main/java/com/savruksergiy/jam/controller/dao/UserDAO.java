package com.savruksergiy.jam.controller.dao;

import com.savruksergiy.jam.model.User;

/**
 * Created with IntelliJ IDEA.
 * User: sergiy
 * Date: 12/9/13
 * Time: 11:31 AM
 * To change this template use File | Settings | File Templates.
 */
public interface UserDAO extends GenericDAO<User> {

	int insert(User user);

	User get(long id);

	int update(User object);

	int delete(User object);
	
}
