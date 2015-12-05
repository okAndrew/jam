package com.jar.jam.dao;

import java.util.List;

import com.jar.jam.domain.model.CookBook;
import com.jar.jam.domain.model.User;

public interface CookBookDao extends GenericDao<CookBook> {

	List<CookBook> getAllByUser(User user);
}
