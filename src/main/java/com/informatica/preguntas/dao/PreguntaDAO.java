package com.informatica.preguntas.dao;

import java.util.List;
import com.informatica.preguntas.model.Pregunta;

public interface PreguntaDAO {

	public void addPregunta(Pregunta pregunta);

	public List<Pregunta> getAllPreguntas();

	public void deletePregunta(Integer preguntaId);

	public Pregunta updatePregunta(Pregunta pregunta);

	public Pregunta getPregunta(Integer preguntaId);
}
