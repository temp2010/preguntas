package com.informatica.preguntas.datos;

import com.informatica.preguntas.modelo.Presenta;
import com.informatica.preguntas.modelo.PresentaId;
import java.util.List;

public interface presentaDAO {
    public List<Presenta> lista();
    
    public Presenta obtener(PresentaId id);
    
    public void GuardarActualizar(Presenta presenta);
    
}