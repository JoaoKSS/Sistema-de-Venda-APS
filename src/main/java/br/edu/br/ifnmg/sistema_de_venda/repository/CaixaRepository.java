/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.br.ifnmg.sistema_de_venda.repository;

import br.edu.br.ifnmg.sistema_de_venda.Caixa;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author joaok
 */
public class CaixaRepository {

    private static CaixaRepository instance = new CaixaRepository();
    private Map<Integer, Caixa> store = new HashMap<>();

    private CaixaRepository() {
    }

    public static CaixaRepository getInstance() {
        return instance;
    }

    public void save(Caixa c) {
        store.put(c.getId(), c);
    }

    public Caixa find(int id) {
        return store.get(id);
    }
}
