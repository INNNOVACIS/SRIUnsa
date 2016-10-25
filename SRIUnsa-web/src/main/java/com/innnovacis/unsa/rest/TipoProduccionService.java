/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innnovacis.unsa.rest;

import com.innnovacis.unsa.business.ITipoProduccionBusiness;
import com.innnovacis.unsa.model.SRITipoProduccion;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author innnovacis
 */
@Path("/tipoProduccion")
@RequestScoped
public class TipoProduccionService {

    @Inject
    private ITipoProduccionBusiness tipoProduccionBusiness;
    

    @GET
    @Path("/listarTipoProduccion")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getListTipoProduccion() {
        Response.ResponseBuilder builder = null;
        try{
         List<SRITipoProduccion> olistaObjetos = tipoProduccionBusiness.GetAll();
         Map<String, Object> respuesta = new HashMap<>();
         respuesta.put("Result", "OK");
         respuesta.put("Records", olistaObjetos);
         builder = Response.status(Response.Status.OK).entity(respuesta);
        }
        catch(Exception ex){
            Map<String, String> responseObj = new HashMap<>();
            responseObj.put("error", ex.getMessage());
            builder = Response.status(Response.Status.BAD_REQUEST).entity(responseObj);
        }
        return builder.build();
    }
    
    @POST
    @Path("/registrarTipoProduccion")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public int saveTipoProduccion(SRITipoProduccion tipoProduccion) {
        return tipoProduccionBusiness.Insertar(tipoProduccion);
    }
    
    @PUT
    @Path("/updateTipoProduccion")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean updateTipoProduccion(SRITipoProduccion tipoProduccion) {
        return tipoProduccionBusiness.Update(tipoProduccion);
    }
    
 
    @PUT
    @Path("/deleteTipoProduccion")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean deleteTipoProduccion(SRITipoProduccion tipoProduccion) {
        return tipoProduccionBusiness.Delete(tipoProduccion);
    }
}