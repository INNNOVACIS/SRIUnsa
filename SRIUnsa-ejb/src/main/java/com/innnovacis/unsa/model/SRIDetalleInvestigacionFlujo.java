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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "usuarioflujo" )
@NamedQueries({
    @NamedQuery(name="SRIDetalleInvestigacionFlujo.GetAll",query="SELECT p FROM SRIDetalleInvestigacionFlujo p"),
    @NamedQuery(name="SRIDetalleInvestigacionFlujo.GetById",query="SELECT p FROM NIdDetalleInvestigacionFlujo p WHERE p.NIdDetalleInvestigacionFlujo = :idEntidad")
})
public class SRIDetalleInvestigacionFlujo  extends SRIEntidad implements Serializable  {
    

    @Id
    @GeneratedValue
    @Column(name = "iddetalleinvestigacionflujo" )
    private int NIdDetalleInvestigacionFlujo;
    
    
    @Column(name = "idprocesoflujo")
    private int NIdProcesoFlujo;

    
    @Column(name = "idinvestigacion")
    private int NIdInvestigacion;


    public int getNIdDetalleInvestigacionFlujo() {
        return NIdDetalleInvestigacionFlujo;
    }

    public void setNIdDetalleInvestigacionFlujo(int NIdDetalleInvestigacionFlujo) {
        this.NIdDetalleInvestigacionFlujo = NIdDetalleInvestigacionFlujo;
    }

    public int getNIdProcesoFlujo() {
        return NIdProcesoFlujo;
    }

    public void setNIdProcesoFlujo(int NIdProcesoFlujo) {
        this.NIdProcesoFlujo = NIdProcesoFlujo;
    }

    public int getNIdInvestigacion() {
        return NIdInvestigacion;
    }

    public void setNIdInvestigacion(int NIdInvestigacion) {
        this.NIdInvestigacion = NIdInvestigacion;
    }
    

    







    

    
    

}

