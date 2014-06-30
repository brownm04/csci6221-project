package edu.gwu.csci6221.teamawesome.dao;

import edu.gwu.csci6221.teamawesome.model.User;

public interface IUserDAO extends IDAO<User> {
	User findByUsername(final String username);
}
