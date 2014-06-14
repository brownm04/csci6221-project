package edu.gwu.csci6221.teamawesome.controller.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.gwu.csci6221.teamawesome.dao.IUserDAO;

@RestController
@RequestMapping("/rest/users")
public class UserRestController {
	private static final Logger log = LoggerFactory
			.getLogger(UserRestController.class);

	@Autowired
	private IUserDAO userDAO;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String getAll() {
		log.info("Getting all users.");
		return "helloworld";
	}
}
