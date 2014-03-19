package com.jar.jam.service;

import java.util.List;

public interface GenericService<T> {
	Long create(T o);

	Long saveOrUpdate(T o);

	void update(T object);

	void delete(Long id);

	T get(Long id);

	List<T> getAll();
}
