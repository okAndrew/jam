package com.jar.jam.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jar.jam.dao.LikeDao;
import com.jar.jam.domain.model.Like;

@Repository
@Transactional
public class LikeDaoImpl extends GenericDaoImpl<Like> implements LikeDao {

}
