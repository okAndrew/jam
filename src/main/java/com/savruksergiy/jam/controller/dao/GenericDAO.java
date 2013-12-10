package com.savruksergiy.jam.controller.dao;

/**
 * Created with IntelliJ IDEA.
 * User: sergiy
 * Date: 12/9/13
 * Time: 11:24 AM
 * To change this template use File | Settings | File Templates.
 */
public interface GenericDAO<T> {

    public T get(long id);

    public int insert(T object);

    public int update(T object);

    public int delete(T object);

}
