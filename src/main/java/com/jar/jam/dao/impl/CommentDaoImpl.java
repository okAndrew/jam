package com.jar.jam.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jar.jam.dao.CommentDao;
import com.jar.jam.domain.model.Comment;

@Repository
@Transactional
public class CommentDaoImpl extends GenericDaoImpl<Comment> implements
		CommentDao {

}
