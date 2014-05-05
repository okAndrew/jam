package com.jar.jam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jar.jam.dao.impl.PhotoDaoImpl;
import com.jar.jam.domain.model.Photo;
import com.jar.jam.domain.model.User;
import com.jar.jam.service.PhotoService;

@Service
public class PhotoServiceImpl extends GenericServiceImpl<Photo> implements
		PhotoService {

	@Autowired
	PhotoDaoImpl photoDaoImpl;

	@Override
	public Photo getAvatarByUser(User user) {
		return photoDaoImpl.getAvatarByUser(user);
	}

}
