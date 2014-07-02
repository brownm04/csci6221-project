package edu.gwu.csci6221.teamawesome.dao.impl;

import java.util.Date;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.gwu.csci6221.teamawesome.dao.AbstractDAO;
import edu.gwu.csci6221.teamawesome.dao.ITaskDAO;
import edu.gwu.csci6221.teamawesome.model.Task;

@Repository
public class TaskDAO extends AbstractDAO<Task> implements ITaskDAO {

	@Override
	@Transactional
	public final Task create(Task entity) {
		if (entity.getDateCreated() == null)
			entity.setDateCreated(new Date());
		return super.create(entity);
	}
}