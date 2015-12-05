package com.jar.jam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jar.jam.dao.impl.CookBookDaoImpl;
import com.jar.jam.domain.model.CookBook;
import com.jar.jam.domain.model.User;
import com.jar.jam.service.CookBookService;

@Service
public class CookBookServiseImpl extends GenericServiceImpl<CookBook> implements
		CookBookService {

	@Autowired
	private CookBookDaoImpl cookBookDaoImpl;

	@Override
	public List<CookBook> getAllByUser(User user) {
		return cookBookDaoImpl.getAllByUser(user);
	}

}
