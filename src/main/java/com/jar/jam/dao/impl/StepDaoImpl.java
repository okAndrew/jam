package com.jar.jam.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jar.jam.dao.StepDao;
import com.jar.jam.domain.model.Step;

@Repository
@Transactional
public class StepDaoImpl extends GenericDaoImpl<Step> implements StepDao {

}
