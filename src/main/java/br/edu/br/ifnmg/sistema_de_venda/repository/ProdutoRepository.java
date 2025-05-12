/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.br.ifnmg.sistema_de_venda.repository;

import br.edu.br.ifnmg.sistema_de_venda.Produto;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author joaok
 */
public class ProdutoRepository {

    private static ProdutoRepository instance = new ProdutoRepository();
    private Map<String, Produto> store = new HashMap<>();

    private ProdutoRepository() {
    }

    public static ProdutoRepository getInstance() {
        return instance;
    }

    public void save(Produto p) {
        store.put(p.getNome(), p);
    }

    public Produto find(String nome) {
        return store.get(nome);
    }
}
