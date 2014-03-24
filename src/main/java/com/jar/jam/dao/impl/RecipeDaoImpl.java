package com.jar.jam.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jar.jam.dao.RecipeDao;
import com.jar.jam.domain.model.Recipe;

@Repository
@Transactional
public class RecipeDaoImpl extends GenericDaoImpl<Recipe> implements RecipeDao{

}
