/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innnovacis.unsa.business;

import com.innnovacis.unsa.model.SRIFlujoArista;
import com.innnovacis.unsa.model.SRISemestre;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Gen-Tya-TIConsul1
 */
@ApplicationScoped
public interface IFlujoAristaBusiness {
    int Insertar(SRIFlujoArista entidad);
    boolean Update(SRIFlujoArista entidad);
    boolean Delete(SRIFlujoArista entidad);
    SRIFlujoArista Get(int idEntidad);
    List<SRIFlujoArista> GetAll();

}
