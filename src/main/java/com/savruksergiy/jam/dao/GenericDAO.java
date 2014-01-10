package com.savruksergiy.jam.dao;

public interface GenericDAO<T> {

    public T get(long id);

    public int insert(T object);

    public int update(T object);

    public int delete(T object);

}
