package com.jar.jam.dao;

public interface GenericDao<T> {
	
    public T get(long id);

    public long insert(T object);

    public long update(T object);

    public long delete(T object);
}
