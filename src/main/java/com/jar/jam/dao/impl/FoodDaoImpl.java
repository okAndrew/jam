package com.jar.jam.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jar.jam.dao.FoodDao;
import com.jar.jam.domain.model.Food;

@Repository
@Transactional
public class FoodDaoImpl extends GenericDaoImpl<Food> implements FoodDao {

}
