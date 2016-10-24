/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innnovacis.unsa.dao;

import com.innnovacis.unsa.model.SRITipoNivel;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Gen-Tya-TIConsul1
 */
@ApplicationScoped
public interface ITipoNivelDao {
    SRITipoNivel Insert(SRITipoNivel entidad);
    SRITipoNivel Update(SRITipoNivel entidad);
    boolean Delete(SRITipoNivel entidad);
    SRITipoNivel GetById(int idEntidad);
    List<SRITipoNivel> GetAll();
    
}
