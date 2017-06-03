package com.informatica.preguntas.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.informatica.preguntas.model.Respuesta;

@Repository
public class RespuestaDAOImpl implements RespuestaDAO {

	@Autowired
	private SessionFactory sessionFactory;

        @Override
	public void addRespuesta(Respuesta respuesta) {
		sessionFactory.getCurrentSession().saveOrUpdate(respuesta);

	}

	@SuppressWarnings("unchecked")
        @Override
	public List<Respuesta> getAllRespuestas() {

		return sessionFactory.getCurrentSession().createQuery("from Respuesta")
				.list();
	}

	@Override
	public void deleteRespuesta(Integer respuestaId) {
		Respuesta respuesta = (Respuesta) sessionFactory.getCurrentSession().load(
				Respuesta.class, respuestaId);
		if (null != respuesta) {
			this.sessionFactory.getCurrentSession().delete(respuesta);
		}

	}

        @Override
	public Respuesta getRespuesta(Integer respuestaId) {
		return (Respuesta) sessionFactory.getCurrentSession().get(
				Respuesta.class, respuestaId);
	}

	@Override
	public Respuesta updateRespuesta(Respuesta respuesta) {
		sessionFactory.getCurrentSession().update(respuesta);
		return respuesta;
	}

}