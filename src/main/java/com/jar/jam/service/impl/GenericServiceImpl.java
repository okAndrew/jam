package com.jar.jam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jar.jam.dao.GenericDao;
import com.jar.jam.service.GenericService;

public class GenericServiceImpl<T> implements GenericService<T> {
	
	@Autowired
	protected GenericDao<T> dao;

	@Override
	public Long create(T o) {
		return dao.create(o);
	}

	@Override
	public Long saveOrUpdate(T o) {
		return dao.saveOrUpdate(o);
	}

	@Override
	public void update(T object) {
		dao.update(object);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public T get(Long id) {
		return dao.get(id);
	}

	@Override
	public List<T> getAll() {
		return dao.getAll();
	}

}
