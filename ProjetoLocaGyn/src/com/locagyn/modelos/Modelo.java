/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

/**
 *
 * @author Aluno
 */
public class Modelo extends Marca{
    Marca marca = new Marca();
    private int id = 0;
    private String descricao = "";
    private String url = "";
    private Marca objetoMarca = marca;
    
    public Modelo(){}
    
    public Modelo(int id, String descricao, String url, Marca objetoMarca)throws Exception{
       this.id = id;
       this.descricao = descricao;
       this.url = url;
       this.objetoMarca = objetoMarca;
       throw new Exception("Insira todos os dados necessarios!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Marca getObjetoMarca() {
        return objetoMarca;
    }

    public void setObjetoMarca(Marca objetoMarca) {
        this.objetoMarca = objetoMarca;
    }
    @Override
    public String toString(){
        return id + ";" + descricao + ";" + url + ";" + objetoMarca;
    }
}
