package edu.gwu.csci6221.teamawesome.dao.impl;

import org.springframework.stereotype.Repository;

import edu.gwu.csci6221.teamawesome.dao.AbstractDAO;
import edu.gwu.csci6221.teamawesome.dao.ICategoryDAO;
import edu.gwu.csci6221.teamawesome.model.Category;

@Repository
public class CategoryDAO extends AbstractDAO<Category> implements ICategoryDAO {

}