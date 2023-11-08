/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author Obede Cossa
 */
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