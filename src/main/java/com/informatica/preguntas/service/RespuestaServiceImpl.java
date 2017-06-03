package com.informatica.preguntas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.informatica.preguntas.dao.RespuestaDAO;
import com.informatica.preguntas.model.Respuesta;

@Service
@Transactional
public class RespuestaServiceImpl implements RespuestaService {

	@Autowired
	private RespuestaDAO respuestaDAO;

	@Override
	@Transactional
	public void addRespuesta(Respuesta respuesta) {
		respuestaDAO.addRespuesta(respuesta);
	}

	@Override
	@Transactional
	public List<Respuesta> getAllRespuestas() {
		return respuestaDAO.getAllRespuestas();
	}

	@Override
	@Transactional
	public void deleteRespuesta(Integer respuestaId) {
		respuestaDAO.deleteRespuesta(respuestaId);
	}

        @Override
	public Respuesta getRespuesta(Integer respuestaId) {
		return respuestaDAO.getRespuesta(respuestaId);
	}

        @Override
	public Respuesta updateRespuesta(Respuesta respuesta) {
		// TODO Auto-generated method stub
		return respuestaDAO.updateRespuesta(respuesta);
	}

	public void setRespuestaDAO(RespuestaDAO respuestaDAO) {
		this.respuestaDAO = respuestaDAO;
	}

}
