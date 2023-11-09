/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author Obede Cossa
 */

class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public void aumentarSalario(double percentualAumento) {
        salarioMensal = salarioMensal + (salarioMensal * percentualAumento / 100);
    }

    public double getSalarioAnual() {
        return salarioMensal * 12;
    }
}
public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Silva", 3000.0);
        Empregado empregado2 = new Empregado("Maria", "Santos", 3500.0);

        System.out.println("Salário Anual do Empregado 1: " + empregado1.getSalarioAnual());
        System.out.println("Salário Anual do Empregado 2: " + empregado2.getSalarioAnual());

        empregado1.aumentarSalario(10);
        empregado2.aumentarSalario(10);

        System.out.println("Salário Anual após Aumento do Empregado 1: " + empregado1.getSalarioAnual());
        System.out.println("Salário Anual após Aumento do Empregado 2: " + empregado2.getSalarioAnual());
    }
}