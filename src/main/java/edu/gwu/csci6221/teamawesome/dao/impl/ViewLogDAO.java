package edu.gwu.csci6221.teamawesome.dao.impl;

import org.springframework.stereotype.Repository;

import edu.gwu.csci6221.teamawesome.dao.AbstractDAO;
import edu.gwu.csci6221.teamawesome.dao.IViewLogDAO;
import edu.gwu.csci6221.teamawesome.model.ViewLog;

@Repository
public class ViewLogDAO extends AbstractDAO<ViewLog> implements IViewLogDAO {

}