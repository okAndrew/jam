package com.jar.jam.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.jar.jam.dao.UserDao;
import com.jar.jam.domain.model.User;
import com.jar.jam.exceptions.users.UserNotFoundException;

@Repository
@Transactional
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {

    @Override
    public User getUserByLogin(String login) throws UserNotFoundException {
	List<?> users = getSession().createCriteria(User.class).add(Restrictions.eq("login", login)).list();
	if (users.size() < 1) {
	    throw new UserNotFoundException(login);
	}
	return (User) users.get(0);
    }

    @Override
    public User findByEmail(String name) {
	Query query = createQuery("from User u where u.email=:email").setParameter("email", name);
	return getSingleObject(query);
    }

}
