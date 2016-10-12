/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innnovacis.unsa.data;

import com.innnovacis.unsa.model.Archivo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.sql.rowset.serial.SerialBlob;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
/**
 *
 * @author innnovacis
 */
public class ArchivoRepository {
    private static final String SAVE_FOLDER = "/home/will/Download/Server/";
    
    @Inject
    private Logger log;
    @Inject
    private EntityManager em;
    
    @Inject
    private Event<Archivo> archivoEventSrc;
    
    Archivo archivo;
        
    public void saveFile(InputStream inStream, String name) throws SQLException, IOException{
        
        Blob blob = null;
        
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int read;
        try {
            while ((read = inStream.read(buffer)) != -1)
                output.write(buffer, 0, read);
        } catch (IOException ex) {
            Logger.getLogger(ArchivoRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        output.flush();
        byte[] contents = output.toByteArray();
        blob = new SerialBlob(contents);
        
        Archivo archivo = new Archivo();
        archivo.setTitulo(name);
        archivo.setFile(blob);
        
        em.merge(archivo);
        archivoEventSrc.fire(archivo);
    }

    public Response getFile (int id) throws SQLException, FileNotFoundException, IOException{
        
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Archivo> criteria = cb.createQuery(Archivo.class);
        Root<Archivo> archivoRoot = criteria.from(Archivo.class);
        criteria.select(archivoRoot);
        criteria.where(cb.equal(archivoRoot.get("id"),id));
        
        Archivo file = em.createQuery(criteria).getSingleResult();
        System.out.println("blob ===> " + file.getFile().length());               
        
        int blobLength = (int) file.getFile().length();  
        byte[] blobAsBytes = file.getFile().getBytes(1, blobLength);
 
        return Response
                .ok(blobAsBytes, MediaType.APPLICATION_OCTET_STREAM)
                .header("content-disposition","attachment; filename =" + file.getTitulo())
                .build();
    }
    
}
