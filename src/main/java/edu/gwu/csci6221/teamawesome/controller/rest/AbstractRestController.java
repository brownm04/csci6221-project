package edu.gwu.csci6221.teamawesome.controller.rest;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.gwu.csci6221.teamawesome.dao.IDAO;

public abstract class AbstractRestController<T extends Serializable> implements
		IRestController<T> {
	@Autowired
	private IDAO<T> dao;

	@Override
	@RequestMapping(value = AbstractRestURIConstants.FIND_ALL, method = RequestMethod.GET)
	public @ResponseBody
	List<T> findAll() {
		return dao.findAll();
	}

	@Override
	@RequestMapping(value = AbstractRestURIConstants.FIND_ONE, method = RequestMethod.GET)
	public @ResponseBody
	T findOne(@PathVariable(value = "id") final Long id) {
		return dao.findOne(id);
	}

	@Override
	@RequestMapping(value = AbstractRestURIConstants.CREATE, method = RequestMethod.POST)
	public @ResponseBody
	void create(final T entity) {
		dao.create(entity);
	}

	@Override
	@RequestMapping(value = AbstractRestURIConstants.UPDATE, method = RequestMethod.PUT)
	public @ResponseBody
	T update(final T entity) {
		return dao.update(entity);
	}

	@Override
	@RequestMapping(value = AbstractRestURIConstants.DELETE, method = RequestMethod.DELETE)
	public @ResponseBody
	void delete(final T entity,
			@RequestParam(value = "id", required = false) final Long id) {
		if (id != null)
			dao.deleteById(id);
		else
			dao.delete(entity);
	}
}
