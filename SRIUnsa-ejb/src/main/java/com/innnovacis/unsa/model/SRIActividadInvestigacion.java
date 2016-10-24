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
@Table(name = "actividadinvestigacion" )
@NamedQueries({
    @NamedQuery(name="SRIActividadInvestigacion.GetAll",query="SELECT p FROM SRIActividadInvestigacion p"),
    @NamedQuery(name="SRIActividadInvestigacion.GetById",query="SELECT p FROM SRIActividadInvestigacion p WHERE p.NIdActividadInvestigacion = :idEntidad")
})
public class SRIActividadInvestigacion  extends SRIEntidad implements Serializable  {
    

    @Id
    @GeneratedValue
    @Column(name = "idactividadinvestigacion" )
    private int NIdActividadInvestigacion;
    

    @Column(name = "idtipoactividadinvestigacion")
    private int NIdTipoActividadInvestigacion;

    
    @Column(name = "horas")
    private int NHoras;

    @Column(name = "tipoproduccion")
    private String SRITipoProduccion;
    

    @Column(name = "fondoconcursable")
    private String SFondoConcursable;
    
    
    @Column(name = "tipoasesoria")
    private String STipoAsesoria;
    
    
    @Column(name = "semestre")
    private String SSemestre;
    
    @Column(name = "facultad")
    private String SFacultad;
    
    @Column(name = "escuela")
    private String SEscuela;
    
    @Column(name = "departamente")
    private String SDepartamente;
    
    

}

