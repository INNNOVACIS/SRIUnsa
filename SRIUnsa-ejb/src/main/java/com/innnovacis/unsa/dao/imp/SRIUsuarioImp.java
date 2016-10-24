/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innnovacis.unsa.dao.imp;

import com.innnovacis.unsa.dao.IUsuarioDao;
import com.innnovacis.unsa.model.SRIUsuario;
import com.innnovacis.unsa.util.SRIUsuarioPaginacion;
import java.util.List;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

/**
 *
 * @author innnovacis
 */
@Dependent
public class SRIUsuarioImp implements IUsuarioDao{
    
    @Inject
    private EntityManager em;
    
    @Inject
    private Event<SRIUsuario> usuarioEventSrc;
    
    @Override
    public List<SRIUsuario> getUsuario() {
        
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<SRIUsuario> criteria = cb.createQuery(SRIUsuario.class);
        Root<SRIUsuario> usuarioRoot = criteria.from(SRIUsuario.class);
        criteria.select(usuarioRoot);
        
        return em.createQuery(criteria).getResultList(); 
    }

    @Override
    @Transactional
    public SRIUsuario saveUsuario(SRIUsuario usuario) {
        
        em.persist(usuario);
        usuarioEventSrc.fire(usuario);
        return usuario;
    }

    @Override
    @Transactional
    public SRIUsuario updateUsuario(SRIUsuario usuario) {
        
        em.merge(usuario);
        return usuario;
    }

    @Override
    @Transactional
    public SRIUsuario deleteUsuario(SRIUsuario usuario) {
        
        em.merge(usuario);
        return usuario;
    }

    @Override
    @Transactional
    public SRIUsuario autenticarUsuario(SRIUsuario usuario) {
        
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<SRIUsuario> criteria = cb.createQuery(SRIUsuario.class);
        Root<SRIUsuario> usuarioRoot = criteria.from(SRIUsuario.class);
        criteria.select(usuarioRoot);
        criteria.where(cb.equal(usuarioRoot.get("usuario"), usuario.getUsuario()));     
        
        return em.createQuery(criteria).getSingleResult();
    }

    @Override
    public SRIUsuarioPaginacion getUsuarios(SRIUsuarioPaginacion paginacion) {
//        CriteriaBuilder cb = em.getCriteriaBuilder();
//        CriteriaQuery<SRIUsuario>query  = cb.createQuery(SRIUsuario.class);
//        int algo = (paginacion.getNumeroPagina()-1) * paginacion.getRangoPagina();
//        query.setFirstResult(algo); 
//        query.setMaxResults(pageSize);
//        List <Foo> fooList = query.getResultList();
        return null;
    }
}
