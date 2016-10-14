package com.innnovacis.unsa.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tipoproduccion")
public class SRITipoProduccion  extends SRIEntidad implements Serializable  {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "idtipoproduccion")
    private int NIdTipoProduccion;

    @Column(name = "nombre")
    private String SNombreTipoProduccion;

    public int getNIdTipoProduccion() {
        return NIdTipoProduccion;
    }

    public void setNIdTipoProduccion(int NIdTipoProduccion) {
        this.NIdTipoProduccion = NIdTipoProduccion;
    }

    public String getSNombreTipoProduccion() {
        return SNombreTipoProduccion;
    }

    public void setSNombreTipoProduccion(String SNombreTipoProduccion) {
        this.SNombreTipoProduccion = SNombreTipoProduccion;
    }


    
    

}

