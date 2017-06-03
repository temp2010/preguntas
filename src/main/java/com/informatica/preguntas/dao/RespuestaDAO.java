package com.informatica.preguntas.dao;

import java.util.List;
import com.informatica.preguntas.model.Respuesta;

public interface RespuestaDAO {

	public void addRespuesta(Respuesta respuesta);

	public List<Respuesta> getAllRespuestas();

	public void deleteRespuesta(Integer respuestaId);

	public Respuesta updateRespuesta(Respuesta respuesta);

	public Respuesta getRespuesta(Integer respuestaId);
}
