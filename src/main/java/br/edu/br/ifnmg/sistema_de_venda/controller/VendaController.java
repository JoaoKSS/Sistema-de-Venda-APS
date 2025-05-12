/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.br.ifnmg.sistema_de_venda.controller;

import br.edu.br.ifnmg.sistema_de_venda.Caixa;
import br.edu.br.ifnmg.sistema_de_venda.ItemVenda;
import br.edu.br.ifnmg.sistema_de_venda.Produto;
import br.edu.br.ifnmg.sistema_de_venda.Venda;
import br.edu.br.ifnmg.sistema_de_venda.repository.CaixaRepository;
import br.edu.br.ifnmg.sistema_de_venda.repository.ItemVendaRepository;
import br.edu.br.ifnmg.sistema_de_venda.repository.ProdutoRepository;
import br.edu.br.ifnmg.sistema_de_venda.repository.VendaRepository;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author joaok
 */
public class VendaController {

    private static VendaController instance = new VendaController();
    private Scanner scanner = new Scanner(System.in);
    private SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

    private VendaController() {
    }

    public static VendaController getInstance() {
        return instance;
    }

    public void iniciarVenda() {
        System.out.println("=== Iniciando Nova Venda ===");
        Date dataAtual = new Date();
        System.out.print("ID Caixa: ");
        int caixaId = Integer.parseInt(scanner.nextLine());
        Caixa caixa = CaixaRepository.getInstance().find(caixaId);
        if (caixa == null) {
            System.out.print("Nome do Caixa: ");
            String nome = scanner.nextLine();
            caixa = new Caixa(caixaId, nome);
            CaixaRepository.getInstance().save(caixa);
        }
        Venda venda = new Venda(new Date(), "ABERTA", caixa);
        VendaRepository.getInstance().save(venda);

        do {
            System.out.print("Nome do Produto: ");
            String nomeProd = scanner.nextLine();

            Produto produto = ProdutoRepository.getInstance().find(nomeProd);
            if (produto == null) {
                System.out.print("Preco do produto: ");
                float preco = Float.parseFloat(scanner.nextLine());
                produto = new Produto(nomeProd, preco);
                ProdutoRepository.getInstance().save(produto);
            }

            System.out.print("Quantidade: ");
            int qtd = Integer.parseInt(scanner.nextLine());
            ItemVenda item = new ItemVenda(qtd, produto);
            ItemVendaRepository.getInstance().save(item);
            venda.getItens().add(item);

            System.out.print("Deseja adicionar outro produto? (S/N): ");
        } while (scanner.nextLine().equalsIgnoreCase("S"));

        double total = venda.getItens().stream()
                .mapToDouble(iv -> iv.getQuantidade() * iv.getProduto().getPreco())
                .sum();
        System.out.println("Total da Venda: " + String.format("%.2f", total));
        System.out.println("Data da Venda: " + data.format(venda.getData()));
        venda.setStatus("CONCLUIDA");
        System.out.println("Status da Venda: " + venda.getStatus());
    }
}
