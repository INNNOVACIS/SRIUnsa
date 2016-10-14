/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innnovacis.unsa.dao;

import com.innnovacis.unsa.model.SRITipoProduccion;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Gen-Tya-TIConsul1
 */
@ApplicationScoped
public interface ITipoProduccionDao {
    
    int Insertar(SRITipoProduccion entidad);
    boolean Update(SRITipoProduccion entidad);
    boolean Delete(int idEntidad);
    SRITipoProduccion Get(int idEntidad);
    List<SRITipoProduccion> GetAll();
    
}
