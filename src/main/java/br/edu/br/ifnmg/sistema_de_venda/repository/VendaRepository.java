/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.br.ifnmg.sistema_de_venda.repository;

import br.edu.br.ifnmg.sistema_de_venda.Venda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaok
 */
public class VendaRepository {

    private static VendaRepository instance = new VendaRepository();
    private List<Venda> store = new ArrayList<>();

    private VendaRepository() {
    }

    public static VendaRepository getInstance() {
        return instance;
    }

    public void save(Venda v) {
        store.add(v);
    }

    public List<Venda> findAll() {
        return store;
    }
}
