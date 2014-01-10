package com.savruksergiy.jam.dao.impl;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.savruksergiy.jam.dao.UserDAO;
import com.savruksergiy.jam.model.User;

public class UserDAOImpl implements UserDAO {

    private static Logger logger = Logger.getLogger(UserDAOImpl.class);

    public void setDataSource(DataSource dataSource) {
    }

    public User get(long id) {
        return null;
    }

    public int insert(User user) {
    	return 0;
    }

    public int update(User object) {
        return 0;
    }

     public int delete(User object) {
        return 0;
    }
     
}
