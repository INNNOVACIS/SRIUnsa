/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innnovacis.unsa.dao;

import com.innnovacis.unsa.model.SRIUsuario;
import com.innnovacis.unsa.util.SRIUsuarioPaginacion;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author innnovacis
 */
@ApplicationScoped
public interface IUsuarioDao {
    
    public List<SRIUsuario> getUsuario();
    public SRIUsuarioPaginacion getUsuarios(SRIUsuarioPaginacion paginacion);
    public SRIUsuario saveUsuario(SRIUsuario usuario);   
    public SRIUsuario updateUsuario(SRIUsuario usuario);
    public SRIUsuario deleteUsuario(SRIUsuario usuario);    
    public SRIUsuario autenticarUsuario(SRIUsuario usuario);
}
