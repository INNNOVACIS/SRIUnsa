/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innnovacis.unsa.dao;

import com.innnovacis.unsa.model.SRIFlujoArista;
import com.innnovacis.unsa.model.SRIUsuario;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author innnovacis
 */
@ApplicationScoped
public interface IFlujoAristaDao {
    SRIFlujoArista Insert(SRIFlujoArista entidad);
    SRIFlujoArista Update(SRIFlujoArista entidad);
    boolean Delete(SRIFlujoArista entidad);
    SRIFlujoArista GetById(int idEntidad);
    List<SRIFlujoArista> GetAll();  
}
