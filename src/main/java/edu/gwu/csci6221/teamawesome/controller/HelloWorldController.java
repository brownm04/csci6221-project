package edu.gwu.csci6221.teamawesome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.gwu.csci6221.teamawesome.model.HelloModel;

@Controller
public class HelloWorldController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", helloModel.word);
		return "helloworld";
	}
}
