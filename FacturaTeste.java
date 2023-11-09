/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author Obede Cossa
 */
class Factura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double precoPorItem;

    public Factura(String numero, String descricao, int quantidade, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoPorItem = precoPorItem;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        if (precoPorItem > 0.0) {
            this.precoPorItem = precoPorItem;
        } else {
            this.precoPorItem = 0.0;
        }
    }

    public double getTotalFactura() {
        double total = quantidade * precoPorItem;
        if (total < 0) {
            total = 0;
        }
        return total;
    }
}


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
