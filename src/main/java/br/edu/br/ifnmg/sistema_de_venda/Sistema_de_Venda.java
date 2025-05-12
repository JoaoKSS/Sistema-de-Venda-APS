/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package br.edu.br.ifnmg.sistema_de_venda;

import br.edu.br.ifnmg.sistema_de_venda.controller.VendaController;

/**
 *
 * @author joaok
 */
public class Sistema_de_Venda {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        VendaController.getInstance().iniciarVenda();
    }
}
