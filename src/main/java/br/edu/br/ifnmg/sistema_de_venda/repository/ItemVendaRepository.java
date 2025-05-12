/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.br.ifnmg.sistema_de_venda.repository;

import br.edu.br.ifnmg.sistema_de_venda.ItemVenda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaok
 */
public class ItemVendaRepository {

    private static ItemVendaRepository instance = new ItemVendaRepository();
    private List<ItemVenda> store = new ArrayList<>();

    private ItemVendaRepository() {
    }

    public static ItemVendaRepository getInstance() {
        return instance;
    }

    public void save(ItemVenda iv) {
        store.add(iv);
    }

    public List<ItemVenda> findAll() {
        return store;
    }
}
