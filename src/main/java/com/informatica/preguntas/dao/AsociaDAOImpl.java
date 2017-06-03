package com.informatica.preguntas.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.informatica.preguntas.model.Asocia;

@Repository
public class AsociaDAOImpl implements AsociaDAO {

	@Autowired
	private SessionFactory sessionFactory;

        @Override
	public void addAsocia(Asocia asocia) {
		sessionFactory.getCurrentSession().saveOrUpdate(asocia);

	}

	@SuppressWarnings("unchecked")
        @Override
	public List<Asocia> getAllAsocias() {

		return sessionFactory.getCurrentSession().createQuery("from Asocia")
				.list();
	}

	@Override
	public void deleteAsocia(Integer asociaId) {
		Asocia asocia = (Asocia) sessionFactory.getCurrentSession().load(
				Asocia.class, asociaId);
		if (null != asocia) {
			this.sessionFactory.getCurrentSession().delete(asocia);
		}

	}

        @Override
	public Asocia getAsocia(Integer asociaId) {
		return (Asocia) sessionFactory.getCurrentSession().get(
				Asocia.class, asociaId);
	}

	@Override
	public Asocia updateAsocia(Asocia asocia) {
		sessionFactory.getCurrentSession().update(asocia);
		return asocia;
	}

}