package com.jar.jam.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
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
		if (criteria.list().isEmpty()) {
			return null;
		} else {
			return (Photo) criteria.list().get(0);
		}
	}

}
