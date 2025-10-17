package br.com.ifgoiano;

public class VerificadorVoto {

    public static void podeVotar(int idade) {

        if (idade >= 16) {
            System.out.println("Pode votar.");
        } else {
            System.out.println("Não pode votar.");
        }
        System.out.println("****************************************************");

    }

}
