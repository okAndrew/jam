package com.jar.jam.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.expression.Expression;
import org.springframework.stereotype.Repository;

import com.jar.jam.dao.PhotoDao;
import com.jar.jam.domain.enums.EntityType;
import com.jar.jam.domain.model.Photo;
import com.jar.jam.domain.model.User;

@Repository
@Transactional
public class PhotoDaoImpl extends GenericDaoImpl<Photo> implements PhotoDao {

	@Override
	public Photo getAvatarByUser(User user) {
		Criteria criteria = getSession().createCriteria(Photo.class);
		criteria.add(org.hibernate.criterion.Expression.eq("user", user));
		criteria.add(org.hibernate.criterion.Expression.eq("entity",
				EntityType.AVATAR));

		// Query query = (Query) getSession().createQuery(
		// "FROM photos WHERE user_id:=userId AND entity:=type");
		// Query query = (Query) getSession().createQuery(
		// "FROM photos WHERE user_id=" + userId + "AND entity=" +
		// EntityType.AVATAR);
		// query.setParameter("userId", userId);
		// query.setParameter("type", EntityType.AVATAR);
		// return (Photo) query.list().get(0);
		return (Photo) criteria.list().get(0);
	}

}
