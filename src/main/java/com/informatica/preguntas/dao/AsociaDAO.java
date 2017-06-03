package com.informatica.preguntas.dao;

import java.util.List;
import com.informatica.preguntas.model.Asocia;

public interface AsociaDAO {

	public void addAsocia(Asocia asocia);

	public List<Asocia> getAllAsocias();

	public void deleteAsocia(Integer asociaId);

	public Asocia updateAsocia(Asocia asocia);

	public Asocia getAsocia(Integer asociaId);
}
