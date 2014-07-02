package edu.gwu.csci6221.teamawesome.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("unchecked")
public abstract class AbstractDAO<T extends Serializable> implements IDAO<T> {
	protected Class<T> clazz = (Class<T>) ((ParameterizedType) getClass()
			.getGenericSuperclass()).getActualTypeArguments()[0];

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public final T findOne(final long id) {
		return (T) getCurrentSession().get(clazz, id);
	}

	@Override
	@Transactional
	public final List<T> findAll() {
		return getCurrentSession().createQuery("from " + clazz.getName())
				.list();
	}

	@Override
	@Transactional
	public T create(final T entity) {
		checkNotNull(entity);

		Long id = (Long) getCurrentSession().save(entity);
		return findOne(id);
	}

	@Override
	@Transactional
	public T update(final T entity) {
		checkNotNull(entity);
		return (T) getCurrentSession().merge(entity);
	}

	@Override
	@Transactional
	public final void delete(final T entity) {
		checkNotNull(entity);
		getCurrentSession().delete(entity);
	}

	@Override
	@Transactional
	public final void deleteById(final long entityId) {
		final T entity = findOne(entityId);
		checkState(entity != null);
		delete(entity);
	}

	protected final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	private <K> K checkNotNull(final K k) {
		if (k == null)
			throw new NullPointerException();
		return k;
	}

	private void checkState(boolean expression) {
		if (!expression)
			throw new IllegalStateException();
	}
}