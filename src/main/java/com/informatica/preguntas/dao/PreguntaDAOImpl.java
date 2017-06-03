package com.informatica.preguntas.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.informatica.preguntas.model.Pregunta;

@Repository
public class PreguntaDAOImpl implements PreguntaDAO {

	@Autowired
	private SessionFactory sessionFactory;

        @Override
	public void addPregunta(Pregunta pregunta) {
		sessionFactory.getCurrentSession().saveOrUpdate(pregunta);

	}

	@SuppressWarnings("unchecked")
        @Override
	public List<Pregunta> getAllPreguntas() {

		return sessionFactory.getCurrentSession().createQuery("from Pregunta")
				.list();
	}

	@Override
	public void deletePregunta(Integer preguntaId) {
		Pregunta pregunta = (Pregunta) sessionFactory.getCurrentSession().load(
				Pregunta.class, preguntaId);
		if (null != pregunta) {
			this.sessionFactory.getCurrentSession().delete(pregunta);
		}

	}

        @Override
	public Pregunta getPregunta(Integer preguntaId) {
		return (Pregunta) sessionFactory.getCurrentSession().get(
				Pregunta.class, preguntaId);
	}

	@Override
	public Pregunta updatePregunta(Pregunta pregunta) {
		sessionFactory.getCurrentSession().update(pregunta);
		return pregunta;
	}

}