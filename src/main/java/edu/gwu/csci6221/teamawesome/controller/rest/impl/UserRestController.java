package edu.gwu.csci6221.teamawesome.controller.rest.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.gwu.csci6221.teamawesome.controller.rest.AbstractRestController;
import edu.gwu.csci6221.teamawesome.model.User;

@RestController
@RequestMapping("/rest/users")
public class UserRestController extends AbstractRestController<User> {

}
