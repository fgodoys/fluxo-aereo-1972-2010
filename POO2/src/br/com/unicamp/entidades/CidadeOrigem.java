/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.unicamp.entidades;

import java.util.List;

/**
 *
 * @author Felipe
 */
public class CidadeOrigem extends Cidade {
    
    List<CidadeDestino> destinosList;
    
    public CidadeOrigem(){
        
    }

    public List<CidadeDestino> getDestinosList() {
        return destinosList;
    }

    public void setDestinosList(List<CidadeDestino> destinosList) {
        this.destinosList = destinosList;
    }
    
    
}
