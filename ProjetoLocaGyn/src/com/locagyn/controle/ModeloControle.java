/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;


import com.locagyn.modelos.Modelo;
import com.locagyn.persistencia.IModeloDao;
import com.locagyn.persistencia.ModeloDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Aluno
 */
public class ModeloControle implements IModeloControle{
    IModeloDao modeloPersistencia = null;
    public ModeloControle(){
        this.modeloPersistencia = new ModeloDao();
    }
    
    private boolean buscarModelo(String descricao)throws Exception{
        try {
            ArrayList<Modelo> listagem = modeloPersistencia.listagem();
            Iterator<Modelo> lista = listagem.iterator();
            while(lista.hasNext()){
                Modelo aux = lista.next();
                if(aux.getDescricao().equalsIgnoreCase(descricao)){
                return true;
                }
        }
    return false;
        } catch (Exception erro) {
            throw erro;
        }
        
    }
    
    @Override
    public void incluir(Modelo objeto) throws Exception {
        if(buscarModelo(objeto.getDescricao())){
            throw new Exception("Modelo já cadastrado!");
        }
            modeloPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Modelo objeto) throws Exception {
        
    }

    @Override
    public ArrayList<Modelo> listagem() throws Exception {
        Collections.sort(modeloPersistencia.listagem(), new Comparator <Modelo>(){public int compare (Modelo objeto1, Modelo objeto2){
        return Integer.compare(objeto1.getId(), objeto2.getId());
                }});
        return modeloPersistencia.listagem();
    }
    
}
