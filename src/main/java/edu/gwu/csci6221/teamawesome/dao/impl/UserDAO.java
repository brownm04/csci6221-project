package edu.gwu.csci6221.teamawesome.dao.impl;

import org.springframework.stereotype.Repository;

import edu.gwu.csci6221.teamawesome.dao.AbstractDAO;
import edu.gwu.csci6221.teamawesome.dao.IUserDAO;
import edu.gwu.csci6221.teamawesome.model.User;

@Repository
public class UserDAO extends AbstractDAO<User> implements IUserDAO {

}
