/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innnovacis.unsa.dao;

import com.innnovacis.unsa.model.SRIUsuario;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author innnovacis
 */
@ApplicationScoped
public interface IUsuarioDao {
    SRIUsuario Insert(SRIUsuario entidad);
    SRIUsuario Update(SRIUsuario entidad);
    boolean Delete(SRIUsuario entidad);
    SRIUsuario GetById(int idEntidad);
    List<SRIUsuario> GetAll();  
}
