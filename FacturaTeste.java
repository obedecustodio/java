/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author Obede Cossa
 */

public class FacturaTeste {
    public static void main(String[] args) {
        Factura factura = new Factura("12345", "Mouse USB", 5, 10.99);

        System.out.println("Número: " + factura.getNumero());
        System.out.println("Descrição: " + factura.getDescricao());
        System.out.println("Quantidade: " + factura.getQuantidade());
        System.out.println("Preço por Item: " + factura.getPrecoPorItem());
        System.out.println("Total da Fatura: " + factura.getTotalFactura());
    }
}
