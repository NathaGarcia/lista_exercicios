package src;

import java.util.Scanner;

public class Exercicio57 {

    public static void main(String[] args) {

        String frase;
        String fraseSemConsoantes = "";

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite uma frase: ");
        frase = entrada.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            fraseSemConsoantes = frase.replaceAll("[bcdfghjklmnpqrstvwxyz]", " ");
        }

        System.out.println(frase);
        System.out.println(fraseSemConsoantes);

    }
}
