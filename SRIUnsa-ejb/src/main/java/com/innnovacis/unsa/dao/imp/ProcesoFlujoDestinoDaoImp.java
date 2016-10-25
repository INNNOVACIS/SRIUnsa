
package com.innnovacis.unsa.dao.imp;

import com.innnovacis.unsa.dao.IProcesoFlujoDestinoDao;
import com.innnovacis.unsa.model.SRIProcesoFlujoDestino;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import javax.enterprise.context.Dependent;



@Dependent
public class ProcesoFlujoDestinoDaoImp implements IProcesoFlujoDestinoDao {

    @Inject
    private EntityManager em;

    @Override
    public SRIProcesoFlujoDestino  Insert(SRIProcesoFlujoDestino entidad) {
         em.persist(entidad);
         return entidad;
    }

    @Override
    public SRIProcesoFlujoDestino Update(SRIProcesoFlujoDestino entidad) {
         em.merge(entidad);
         return entidad;
    }

    @Override
    public boolean Delete(SRIProcesoFlujoDestino entidad) {
        entidad.setSEstado("I");
        em.merge(entidad);
        return true;
    }

    @Override
    public SRIProcesoFlujoDestino GetById(int idEntidad) {
        SRIProcesoFlujoDestino entidad = em.createNamedQuery("SRIProcesoFlujoDestino.GetById", SRIProcesoFlujoDestino.class).setParameter("idEntidad", idEntidad).getSingleResult();
        return entidad;
    }

    @Override
    public List<SRIProcesoFlujoDestino> GetAll() {
        List<SRIProcesoFlujoDestino> olistaRespuesta = em.createNamedQuery("SRIProcesoFlujoDestino.GetAll",SRIProcesoFlujoDestino.class).getResultList();
        return olistaRespuesta;
    }

}
