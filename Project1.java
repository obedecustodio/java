/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.project1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Obede Cossa
 */
public class Project1 {

    public static int somatorio(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + somatorio(n - 1);
        }
    }

    public static int produtoLista(List<Integer> lista) {
        if (lista.isEmpty()) {
            return 1;
        } else {
            int primeiroElemento = lista.get(0);
            List<Integer> restanteDaLista = lista.subList(1, lista.size());
            return primeiroElemento * produtoLista(restanteDaLista);
        }
    }

    public static int mdc(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return mdc(y, x % y);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static String inverterString(String s) {
        if (s.isEmpty()) {
            return s;
        } else {
            char primeiroChar = s.charAt(0);
            String restanteDaString = s.substring(1);
            return inverterString(restanteDaString) + primeiroChar;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int somatorio = somatorio(n);
        System.out.println("O somatório de 1 a " + n + " é: " + somatorio);

        List<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(3);
        lista.add(4);

        int produto = produtoLista(lista);
        System.out.println("O produto dos valores na lista é: " + produto);

        int x = 48;
        int y = 18;

        int mdc = mdc(x, y);
        System.out.println("O MDC de " + x + " e " + y + " é: " + mdc);

        int n1 = 10; 
        int res = fibonacci(n);
        System.out.println("O " + n + "-ésimo termo da sequência de Fibonacci é: " + res);

        String entrada = "obede";
        String invertida = inverterString(entrada);
        System.out.println("Inversão de '" + entrada + "': " + invertida);

    }
}
