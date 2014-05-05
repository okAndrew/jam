package com.jar.jam.dao;

import com.jar.jam.domain.model.Photo;
import com.jar.jam.domain.model.User;

public interface PhotoDao extends GenericDao<Photo> {

	public Photo getAvatarByUser(User user);
}
