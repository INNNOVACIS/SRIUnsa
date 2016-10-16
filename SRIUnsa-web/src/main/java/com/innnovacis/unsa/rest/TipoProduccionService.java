/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innnovacis.unsa.rest;

import com.innnovacis.unsa.business.ITipoProduccionBusiness;
import com.innnovacis.unsa.model.SRITipoProduccion;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author innnovacis
 */
@Path("/TipoProduccion")
@RequestScoped
public class TipoProduccionService {

    @Inject
    private ITipoProduccionBusiness tipoProduccionBusiness;
    

  
    
    @POST
    @Path("/insert")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public int saveTipoProduccion(SRITipoProduccion tipoProduccion) {
        return tipoProduccionBusiness.Insertar(tipoProduccion);
    }
    
     @PUT
    @Path("/update")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean updateTipoProduccion(SRITipoProduccion tipoProduccion) {
        return tipoProduccionBusiness.Update(tipoProduccion);
    }
    
 
    @PUT
    @Path("/delete")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean deleteTipoProduccion(SRITipoProduccion tipoProduccion) {
        return tipoProduccionBusiness.Delete(tipoProduccion);
    }
    
    @POST
    @Path("/getById")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public SRITipoProduccion getByIdTipoProduccion(int IdTipoProduccion) {
        
        return tipoProduccionBusiness.Get(IdTipoProduccion);
    }
    
    @GET
    @Path("/getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SRITipoProduccion> getListTipoProduccion() {
        return tipoProduccionBusiness.GetAll();
    }
    
   
}