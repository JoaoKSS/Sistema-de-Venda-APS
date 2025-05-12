/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package br.edu.br.ifnmg.sistema_de_venda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaok
 */
public class Caixa {

    /**
     * @param args the command line arguments
     */
    private int id;
    private String nome;
    private List<Venda> vendas = new ArrayList<>();

    public Caixa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

}
