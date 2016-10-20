/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innnovacis.unsa.util;

import com.innnovacis.unsa.model.SRIUsuario;
import java.util.List;

/**
 *
 * @author innnovacis
 */
public class SRIUsuarioPaginacion {
    
    private int numeroPagina;
    private int rangoPagina;
    private int totalPagina;
    private List<SRIUsuario> data;

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public int getRangoPagina() {
        return rangoPagina;
    }

    public void setRangoPagina(int rangoPagina) {
        this.rangoPagina = rangoPagina;
    }

    public int getTotalPagina() {
        return totalPagina;
    }

    public void setTotalPagina(int totalPagina) {
        this.totalPagina = totalPagina;
    }

    public List<SRIUsuario> getData() {
        return data;
    }

    public void setData(List<SRIUsuario> data) {
        this.data = data;
    }
}
