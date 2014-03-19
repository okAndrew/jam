package com.jar.jam.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.jar.jam.dao.GenericDao;

public abstract class GenericDaoImpl<T> implements GenericDao<T> {
	private Class<T> type;

	@Autowired
	protected SessionFactory sessionFactory;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public GenericDaoImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = ((Class) pt.getActualTypeArguments()[0]);
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	@Transactional
	public Long create(T o) {
		return (Long) getSession().save(o);
	}

	@Override
	@Transactional
	public Long saveOrUpdate(T o) {
		return (Long) getSession().save(o);
	}

	@Override
	@Transactional
	public void update(T o) {
		getSession().update(o);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		if (id != null) {
			Object entity = getSession().get(type, id);
			if (entity != null) {
				getSession().delete(entity);
			}
		}
	}

	@Override
	@Transactional
	public T get(Long id) {
		return (T) getSession().get(type, id);
	}

	@Override
	@Transactional
	public List<T> getAll() {
		return getSession().createCriteria(type)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	}
}
