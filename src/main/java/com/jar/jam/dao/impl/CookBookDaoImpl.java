package com.jar.jam.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.jar.jam.dao.CookBookDao;
import com.jar.jam.domain.model.CookBook;
import com.jar.jam.domain.model.User;

@Repository
@Transactional
public class CookBookDaoImpl extends GenericDaoImpl<CookBook> implements
		CookBookDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<CookBook> getAllByUser(User user) {
		Criteria criteria = getSession().createCriteria(CookBook.class);
		criteria.add(org.hibernate.criterion.Expression.eq("creator", user));
		return criteria.list();
	}


}
