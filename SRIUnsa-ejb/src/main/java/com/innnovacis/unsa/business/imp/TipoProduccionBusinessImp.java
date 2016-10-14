
package com.innnovacis.unsa.business.imp;

import com.innnovacis.unsa.business.ITipoProduccionBusiness;

import com.innnovacis.unsa.dao.ITipoProduccionDao;
import com.innnovacis.unsa.model.SRITipoProduccion;

import javax.inject.Inject;
import java.util.List;
import javax.enterprise.context.Dependent;



@Dependent
public class TipoProduccionBusinessImp implements ITipoProduccionBusiness {

    @Inject
    private ITipoProduccionDao tipoProduccionDao;

    @Override
    public int Insertar(SRITipoProduccion entidad) {
        int id = -1;
        try{
            id = tipoProduccionDao.Insertar(entidad);
        }
        catch(Exception ex){
            
        }
        return id;
    }

    @Override
    public boolean Update(SRITipoProduccion entidad) {
        boolean respuesta = false;
         try{
            tipoProduccionDao.Update(entidad);
            respuesta = true;
        }
        catch(Exception ex){
            
        }
         return respuesta;
        
    }

    @Override
    public boolean Delete(SRITipoProduccion entidad) {
        boolean respuesta = false;
         try{
            tipoProduccionDao.Delete(entidad.getNIdTipoProduccion());
            respuesta = true;
        }
        catch(Exception ex){
            
        }
         return respuesta;
    }

    @Override
    public SRITipoProduccion Get(int idEntidad) {
        SRITipoProduccion respuesta = null;
         try{
            respuesta = tipoProduccionDao.Get(idEntidad);
        }
        catch(Exception ex){
        }
         return respuesta;
    }

    @Override
    public List<SRITipoProduccion> GetAll() {
         List<SRITipoProduccion> respuesta = null;
         try{
            respuesta = tipoProduccionDao.GetAll();
        }
        catch(Exception ex){
        }
         return respuesta;
    }

    
}
