package com.jar.jam.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jar.jam.dao.TagDao;
import com.jar.jam.domain.model.Tag;

@Repository
@Transactional
public class TagDaoImpl extends GenericDaoImpl<Tag> implements TagDao {

}
