package com.informatica.preguntas.datos;

import com.informatica.preguntas.modelo.Presenta;
import com.informatica.preguntas.modelo.PresentaId;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;

public class presentaDaoImplementacion implements presentaDAO {

    private SessionFactory sessionFactory;

    public presentaDaoImplementacion() {
    }

    public presentaDaoImplementacion(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public List<Presenta> lista() {
        List<Presenta> listaPresenta = (List<Presenta>) sessionFactory.getCurrentSession().createCriteria(Presenta.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
        return listaPresenta;
    }

    @Override
    @Transactional
    public Presenta obtener(PresentaId id) {
        String hql = "FROM presenta"
                   + "WHERE codigo_estudiante = " + id.getCodigoEstudiante()
                   + "AND id_asignatura = " + id.getIdAsignatura()
                   + "AND id_pregunta = " + id.getIdPregunta();
        Query query = sessionFactory.getCurrentSession().createQuery(hql);

        @SuppressWarnings("unchecked")
        List<Presenta> listaPresenta = (List<Presenta>) query.list();

        if (listaPresenta != null && !listaPresenta.isEmpty()) {
            return listaPresenta.get(0);
        }

        return null;

    }

    @Override
    @Transactional
    public void GuardarActualizar(Presenta presenta) {
        sessionFactory.getCurrentSession().saveOrUpdate(presenta);
    }

}
