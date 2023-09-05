package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Cliente {

    /**
     * Declarar Variaveis
     *
     * */
    String nome, email, endereco;
    long telefone, cpf, rg;

    /** Instancia o Scanner*/
    Scanner teclado = new Scanner(System.in);
    public void CadastrarCliente(){

        System.out.println("----- Cadastro Cliente -----");
        System.out.println("Qual é o seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Informe o seu CPF: ");
        cpf = teclado.nextLong();
        System.out.println("Informe o seu RG: ");
        email = teclado.nextLine();
        System.out.println("Informe o seu email: ");
        email = teclado.nextLine();
        System.out.println("Informe o seu telefone: ");
        telefone = teclado.nextLong();
        teclado.nextLine();
        System.out.println("Informe o seu endereço: ");
        endereco = teclado.nextLine();
        System.out.println("--------- Cadastro Finalizado");
        System.out.println("----------------------");

        teclado.close();

    }
}
