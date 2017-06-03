package com.informatica.preguntas.service;

import java.util.List;

import com.informatica.preguntas.model.Respuesta;

public interface RespuestaService {
	
	public void addRespuesta(Respuesta respuesta);

	public List<Respuesta> getAllRespuestas();

	public void deleteRespuesta(Integer respuestaId);

	public Respuesta getRespuesta(Integer respuestaid);

	public Respuesta updateRespuesta(Respuesta respuesta);
}
