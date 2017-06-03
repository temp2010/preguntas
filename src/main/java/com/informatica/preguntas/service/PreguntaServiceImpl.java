package com.informatica.preguntas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.informatica.preguntas.dao.PreguntaDAO;
import com.informatica.preguntas.model.Pregunta;

@Service
@Transactional
public class PreguntaServiceImpl implements PreguntaService {

	@Autowired
	private PreguntaDAO preguntaDAO;

	@Override
	@Transactional
	public void addPregunta(Pregunta pregunta) {
		preguntaDAO.addPregunta(pregunta);
	}

	@Override
	@Transactional
	public List<Pregunta> getAllPreguntas() {
		return preguntaDAO.getAllPreguntas();
	}

	@Override
	@Transactional
	public void deletePregunta(Integer preguntaId) {
		preguntaDAO.deletePregunta(preguntaId);
	}

        @Override
	public Pregunta getPregunta(Integer preguntaId) {
		return preguntaDAO.getPregunta(preguntaId);
	}

        @Override
	public Pregunta updatePregunta(Pregunta pregunta) {
		// TODO Auto-generated method stub
		return preguntaDAO.updatePregunta(pregunta);
	}

	public void setPreguntaDAO(PreguntaDAO preguntaDAO) {
		this.preguntaDAO = preguntaDAO;
	}

}
