/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innnovacis.unsa.business;

import com.innnovacis.unsa.model.SRIUsuario;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author innnovacis
 */
@ApplicationScoped
public interface IUsuarioBusiness {
    
    int Insertar(SRIUsuario entidad);
    boolean Update(SRIUsuario entidad);
    boolean Delete(SRIUsuario entidad);
    SRIUsuario Get(int idEntidad);
    List<SRIUsuario> GetAll();
    
}
