/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package br.edu.br.ifnmg.sistema_de_venda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author joaok
 */
public class Venda {

    /**
     * @param args the command line arguments
     */
    private Date data;
    private String status;
    private Caixa caixa;
    private List<ItemVenda> itens = new ArrayList<>();

    public Venda(Date data, String status, Caixa caixa) {
        this.data = data;
        this.status = status;
        this.caixa = caixa;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

}
