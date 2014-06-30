package edu.gwu.csci6221.teamawesome.dao.impl;

import org.springframework.stereotype.Repository;

import edu.gwu.csci6221.teamawesome.dao.AbstractDAO;
import edu.gwu.csci6221.teamawesome.dao.ITaskDAO;
import edu.gwu.csci6221.teamawesome.model.Task;

@Repository
public class TaskDAO extends AbstractDAO<Task> implements ITaskDAO {

}