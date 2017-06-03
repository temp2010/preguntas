package com.informatica.preguntas.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pregunta")
public class Pregunta implements Serializable {

    @Id
    @SequenceGenerator(name = "pregunta_seq", sequenceName = "pregunta_id_pregunta_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pregunta_seq")
    @Column(name = "id_pregunta", unique = true, nullable = false)
    private int id_pregunta;

    @Column(name = "pregunta", unique = true, nullable = false)
    private String pregunta;

    public Pregunta() {
    }

    public Pregunta(int idPregunta, String pregunta) {
        this.id_pregunta = idPregunta;
        this.pregunta = pregunta;
    }

    public int getId_pregunta() {
        return this.id_pregunta;
    }

    public void setId_pregunta(int idPregunta) {
        this.id_pregunta = idPregunta;
    }

    public String getPregunta() {
        return this.pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

}
