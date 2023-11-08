/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author Obede Cossa
 */
import java.util.ArrayList;
import java.util.List;

class Contacto {

    private String nome;
    private String telefone;
    private String email;
    private String dataAniversario;
    private String endereco;

    public Contacto(String nome, String telefone, String email, String dataAniversario, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataAniversario = dataAniversario;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email
                + "\nData de Aniversário: " + dataAniversario + "\nEndereço: " + endereco;
    }
}

class Agenda {

    private List<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    public void adicionarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public void listarContactos() {
        for (Contacto contacto : contactos) {
            System.out.println(contacto.toString());
            System.out.println("----------");
        }
    }
}

public class AgendaTelefonica {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contacto contacto1 = new Contacto("João", "123456789", "joao@email.com", "10/02/1990", "Rua A");
        Contacto contacto2 = new Contacto("Maria", "987654321", "maria@email.com", "05/07/1985", "Rua B");

        agenda.adicionarContacto(contacto1);
        agenda.adicionarContacto(contacto2);

        System.out.println("Lista de Contactos:");
        agenda.listarContactos();
    }
}
