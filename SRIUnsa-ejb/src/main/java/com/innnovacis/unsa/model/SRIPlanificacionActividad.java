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
@Table(name = "planificacionactividad" )
@NamedQueries({
    @NamedQuery(name="SRIPlanificacionActividad.GetAll",query="SELECT p FROM SRIPlanificacionActividad p"),
    @NamedQuery(name="SRIPlanificacionActividad.GetById",query="SELECT p FROM SRIPlanificacionActividad p WHERE p.NIdPlanificacionActividad = :idEntidad")
})
public class SRIPlanificacionActividad  extends SRIEntidad implements Serializable  {
    

    @Id
    @GeneratedValue
    @Column(name = "idplanificacionactividad" )
    private int NIdPlanificacionActividad;

    @Column(name = "idinvestigacion")
    private int NIdInvestigacion;

    
    @Column(name = "horasparciales")
    private int NHorasParciales;

    

    public int getNIdPlanificacionActidad() {
        return NIdPlanificacionActividad;
    }

    public void setNIdPlanificacionActividad(int NIdPlanificacionActividad) {
        this.NIdPlanificacionActividad = NIdPlanificacionActividad;
    }

    public int getNIdInvestigacion() {
        return NIdInvestigacion;
    }

    public void setNIdInvestigacion(int NIdInvestigacion) {
        this.NIdInvestigacion = NIdInvestigacion;
    }

    public int getNHorasParciales() {
        return NHorasParciales;
    }

    public void setNHorasParciales(int NHorasParciales) {
        this.NHorasParciales = NHorasParciales;
    }
    





    

    
    

}

