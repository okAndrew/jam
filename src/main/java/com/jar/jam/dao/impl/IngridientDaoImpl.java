package com.jar.jam.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jar.jam.dao.IngredientDao;
import com.jar.jam.domain.model.Ingridient;

@Repository
@Transactional
public class IngridientDaoImpl extends GenericDaoImpl<Ingridient> implements
		IngredientDao {

}
