/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innnovacis.unsa.business.imp;

import com.innnovacis.unsa.business.IUsuarioBusiness;
import com.innnovacis.unsa.dao.IUsuarioDao;
import com.innnovacis.unsa.model.SRIUsuario;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 *
 * @author innnovacis
 */
@Dependent
public class UsuarioBusinessImp implements IUsuarioBusiness{
    
    @Inject
    public IUsuarioDao usuarioDao;
    
    @Override
    public List<SRIUsuario> getUsuario() {
        
        List<SRIUsuario> respuesta = new ArrayList<SRIUsuario>();
        try{
            respuesta = usuarioDao.getUsuario();
        } catch(Exception e) {
        
        }
        return respuesta;
    }

    @Override
    public SRIUsuario saveUsuario(SRIUsuario usuario) {
        
        SRIUsuario respuesta = new SRIUsuario();
        try{
            respuesta = usuarioDao.saveUsuario(usuario);
        } catch(Exception e) {
        
        }
        return respuesta;
    }

    @Override
    public SRIUsuario updateUsuario(SRIUsuario usuario) {
        
        SRIUsuario respuesta = new SRIUsuario();
        try{
            respuesta = usuarioDao.updateUsuario(usuario);
        } catch(Exception e) {
        
        }
        return respuesta;
    }

    @Override
    public SRIUsuario deleteUsuario(SRIUsuario usuario) {
        
        SRIUsuario respuesta = new SRIUsuario();
        try{
            respuesta = usuarioDao.deleteUsuario(usuario);
        } catch(Exception e) {
        
        }
        return respuesta;
    }

    @Override
    public SRIUsuario autenticarUsuario(SRIUsuario usuario) {
        
        SRIUsuario respuesta = new SRIUsuario();
        try{
            respuesta = usuarioDao.autenticarUsuario(usuario);
        } catch(Exception e) {
        
        }
        return respuesta;
    }
    
}
