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
@Table(name = "respuesta")
public class Respuesta implements Serializable {

    @Id
    @SequenceGenerator(name = "respuesta_seq", sequenceName = "respuesta_id_respuesta_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "respuesta_seq")
    @Column(name = "id_respuesta", unique = true, nullable = false)
    private int id_respuesta;
    
    @Column(name = "respuesta", unique = true, nullable = false)
    private String respuesta;

    public Respuesta() {
    }

    public Respuesta(int idRespuesta, String respuesta) {
        this.id_respuesta = idRespuesta;
        this.respuesta = respuesta;
    }

    public int getId_respuesta() {
        return id_respuesta;
    }

    public void setId_respuesta(int id_respuesta) {
        this.id_respuesta = id_respuesta;
    }

    public String getRespuesta() {
        return this.respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

}
