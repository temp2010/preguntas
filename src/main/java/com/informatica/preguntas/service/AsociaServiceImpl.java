package com.informatica.preguntas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.informatica.preguntas.dao.AsociaDAO;
import com.informatica.preguntas.model.Asocia;

@Service
@Transactional
public class AsociaServiceImpl implements AsociaService {

	@Autowired
	private AsociaDAO asociaDAO;

	@Override
	@Transactional
	public void addAsocia(Asocia asocia) {
		asociaDAO.addAsocia(asocia);
	}

	@Override
	@Transactional
	public List<Asocia> getAllAsocias() {
		return asociaDAO.getAllAsocias();
	}

	@Override
	@Transactional
	public void deleteAsocia(Integer asociaId) {
		asociaDAO.deleteAsocia(asociaId);
	}

        @Override
	public Asocia getAsocia(Integer asociaId) {
		return asociaDAO.getAsocia(asociaId);
	}

        @Override
	public Asocia updateAsocia(Asocia asocia) {
		// TODO Auto-generated method stub
		return asociaDAO.updateAsocia(asocia);
	}

	public void setAsociaDAO(AsociaDAO asociaDAO) {
		this.asociaDAO = asociaDAO;
	}

}
