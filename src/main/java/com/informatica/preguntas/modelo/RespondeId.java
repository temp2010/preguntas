package com.informatica.preguntas.modelo;
// Generated 21-may-2017 11:18:12 by Hibernate Tools 4.3.1

/**
 * RespondeId generated by hbm2java
 */
public class RespondeId implements java.io.Serializable {

    private long codigoEstudiante;
    private int idAsignatura;
    private int idPregunta;
    private int idRespuesta;

    public RespondeId() {
    }

    public RespondeId(long codigoEstudiante, int idAsignatura, int idPregunta, int idRespuesta) {
        this.codigoEstudiante = codigoEstudiante;
        this.idAsignatura = idAsignatura;
        this.idPregunta = idPregunta;
        this.idRespuesta = idRespuesta;
    }

    public long getCodigoEstudiante() {
        return this.codigoEstudiante;
    }

    public void setCodigoEstudiante(long codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public int getIdAsignatura() {
        return this.idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public int getIdPregunta() {
        return this.idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public int getIdRespuesta() {
        return this.idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof RespondeId)) {
            return false;
        }
        RespondeId castOther = (RespondeId) other;

        return (this.getCodigoEstudiante() == castOther.getCodigoEstudiante())
                && (this.getIdAsignatura() == castOther.getIdAsignatura())
                && (this.getIdPregunta() == castOther.getIdPregunta())
                && (this.getIdRespuesta() == castOther.getIdRespuesta());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (int) this.getCodigoEstudiante();
        result = 37 * result + this.getIdAsignatura();
        result = 37 * result + this.getIdPregunta();
        result = 37 * result + this.getIdRespuesta();
        return result;
    }

}