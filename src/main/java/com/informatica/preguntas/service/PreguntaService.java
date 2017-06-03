package com.informatica.preguntas.service;

import java.util.List;

import com.informatica.preguntas.model.Pregunta;

public interface PreguntaService {
	
	public void addPregunta(Pregunta pregunta);

	public List<Pregunta> getAllPreguntas();

	public void deletePregunta(Integer preguntaId);

	public Pregunta getPregunta(Integer preguntaid);

	public Pregunta updatePregunta(Pregunta pregunta);
}
