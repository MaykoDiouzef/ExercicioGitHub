package br.com.ifgoiano;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcao = 0;

        do {

            System.out.println("****************************************************");
            System.out.println("1 - Verificador de Idade para Votação");
            System.out.println("2 - Calculadora de Área de Quadrado");
            System.out.println("3 - Conversor de Temperatura (Celsius para Fahrenheit)");
            System.out.println("4 - Concatenador de Nome Completo");
            System.out.println("5 - Sair");
            System.out.println("****************************************************");
            System.out.print("Opção: ");

            Scanner lsopcao = new Scanner(System.in);
            opcao = lsopcao.nextInt();

            switch (opcao) {
                case 1:
                    int idade;

                    System.out.println("****************************************************");
                    System.out.print("Informe a Idade: ");
                    Scanner lsIdade = new Scanner(System.in);
                    idade = lsIdade.nextInt();

                    VerificadorVoto.podeVotar(idade);
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
            }

        } while (opcao != 5);

    }

}
