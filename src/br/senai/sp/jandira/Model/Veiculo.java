package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Veiculo {
    String modelo, marca, cor, placa, combustivel;

    double preco;

    int ano;

    /** Instancia Scanner */

    Scanner teclado = new Scanner(System.in);

    public void CadastrarVeiculo(){
        System.out.println("---- Cadastro Veiculo ----");
        System.out.println("Informe a Marca: ");
        marca = teclado.nextLine();
        System.out.println("Informe o Modelo");
        modelo = teclado.nextLine();
        System.out.println("Informe a Cor: ");
        cor = teclado.nextLine();
        System.out.println("Informe o Combustivel: ");
        combustivel = teclado.nextLine();
        System.out.println("Informe o Ano: ");
        ano = teclado.nextInt();
        System.out.println("Informe o Preço: ");
        preco = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Informe a Placa : ");
        placa = teclado.nextLine();

        System.out.println("--- Cadastro Finalizado ---");


    }

}
