package edu.gwu.csci6221.teamawesome.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.gwu.csci6221.teamawesome.dao.AbstractDAO;
import edu.gwu.csci6221.teamawesome.dao.IUserDAO;
import edu.gwu.csci6221.teamawesome.model.User;

@Repository
public class UserDAO extends AbstractDAO<User> implements IUserDAO {

	@Transactional
	public User findByUsername(final String username) {
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>) getCurrentSession().createQuery("from " + clazz.getName() + " where username='" + username + "'").list();
		if (users != null && users.size() > 0)
			return users.get(0);
		return new User();
	}
}
