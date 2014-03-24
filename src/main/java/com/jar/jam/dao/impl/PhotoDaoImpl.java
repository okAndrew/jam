package com.jar.jam.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jar.jam.dao.PhotoDao;
import com.jar.jam.domain.model.Photo;

@Repository
@Transactional
public class PhotoDaoImpl extends GenericDaoImpl<Photo> implements PhotoDao {

}
