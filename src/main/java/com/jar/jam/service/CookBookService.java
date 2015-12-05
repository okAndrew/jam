package com.jar.jam.service;

import java.util.List;

import com.jar.jam.domain.model.CookBook;
import com.jar.jam.domain.model.User;

public interface CookBookService extends GenericService<CookBook> {

	List<CookBook> getAllByUser(User user);
}
