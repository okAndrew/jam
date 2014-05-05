package com.jar.jam.service;

import com.jar.jam.domain.model.Photo;
import com.jar.jam.domain.model.User;

public interface PhotoService extends GenericService<Photo> {

	public Photo getAvatarByUser(User user);
}
