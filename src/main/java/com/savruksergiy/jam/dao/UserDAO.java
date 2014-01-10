package com.savruksergiy.jam.dao;

import com.savruksergiy.jam.model.User;

public interface UserDAO extends GenericDAO<User> {

	int insert(User user);

	User get(long id);

	int update(User object);

	int delete(User object);
	
}
