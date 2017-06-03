package com.informatica.preguntas.service;

import java.util.List;

import com.informatica.preguntas.model.Asocia;

public interface AsociaService {
	
	public void addAsocia(Asocia asocia);

	public List<Asocia> getAllAsocias();

	public void deleteAsocia(Integer asociaId);

	public Asocia getAsocia(Integer asociaid);

	public Asocia updateAsocia(Asocia asocia);
}
