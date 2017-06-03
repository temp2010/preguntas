package com.informatica.preguntas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asocia")
public class Asocia implements java.io.Serializable {

    @Id
    @ManyToOne()
    @JoinColumn(name = "id_pregunta")
    private Pregunta pregunta;
    
    @Id
    @ManyToOne()
    @JoinColumn(name = "id_respuesta")
    private Respuesta respuesta;
    
    @Column(name = "correcta")
    private boolean correcta;

    public Asocia() {
    }

    public Asocia(Pregunta pregunta, Respuesta respuesta, boolean correcta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.correcta = correcta;
    }

    public Pregunta getPregunta() {
        return this.pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public Respuesta getRespuesta() {
        return this.respuesta;
    }

    public void setRespuesta(Respuesta respuesta) {
        this.respuesta = respuesta;
    }

    public boolean isCorrecta() {
            return this.correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }
}
