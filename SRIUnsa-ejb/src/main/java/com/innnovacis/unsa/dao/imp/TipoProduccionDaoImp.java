
package com.innnovacis.unsa.dao.imp;

import com.innnovacis.unsa.dao.IPersonaDao;
import com.innnovacis.unsa.dao.ITipoProduccionDao;
import com.innnovacis.unsa.model.SRITipoProduccion;
import com.innnovacis.unsa.modelborrar.Persona;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import javax.enterprise.context.Dependent;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaUpdate;
import javax.transaction.Transactional;


@Dependent
public class TipoProduccionDaoImp implements ITipoProduccionDao {

    @Inject
    private EntityManager em;

    @Override
    public int Insertar(SRITipoProduccion entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update(SRITipoProduccion entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(int idEntidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SRITipoProduccion Get(int idEntidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SRITipoProduccion> GetAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<SRITipoProduccion> criteria = cb.createQuery(SRITipoProduccion.class);
        Root<SRITipoProduccion> SRITipoProduccion = criteria.from(SRITipoProduccion.class);
        criteria.select(SRITipoProduccion).orderBy(cb.asc(SRITipoProduccion.get("nombre")));
        
        return em.createQuery(criteria).getResultList();
    }

}
