
package com.innnovacis.unsa.dao.imp;

import com.innnovacis.unsa.dao.IArchivoDao;
import com.innnovacis.unsa.model.SRIArchivo;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import javax.enterprise.context.Dependent;



@Dependent
public class ArchivoDaoImp implements IArchivoDao {

    @Inject
    private EntityManager em;

    @Override
    public SRIArchivo  Insert(SRIArchivo entidad) {
         em.persist(entidad);
         return entidad;
    }

    @Override
    public SRIArchivo Update(SRIArchivo entidad) {
         em.merge(entidad);
         return entidad;
    }

    @Override
    public boolean Delete(SRIArchivo entidad) {
        entidad.setSEstado("I");
        em.merge(entidad);
        return true;
    }

    @Override
    public SRIArchivo GetById(int idEntidad) {
        SRIArchivo entidad = em.createNamedQuery("SRIArchivo.GetById", SRIArchivo.class).setParameter("idEntidad", idEntidad).getSingleResult();
        return entidad;
    }

    @Override
    public List<SRIArchivo> GetAll() {
        List<SRIArchivo> olistaRespuesta = em.createNamedQuery("SRIArchivo.GetAll",SRIArchivo.class).getResultList();
        return olistaRespuesta;
    }

}
