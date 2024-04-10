package src;

import java.util.Scanner;

public class Exercicio55 {

    public static void main(String[] args) {

        String frase;
        String fraseSemEspacos;
        int espacosVazios=0;
        final int MAX_LENGTH = 50;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        frase = entrada.nextLine();

        if (frase.length() <= MAX_LENGTH) {

            //remove/substitui os espaços vazios da frase
            fraseSemEspacos = frase.replaceAll(" ","");

            //verifica a quantidade de espaços na extensão da frase
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == ' ') {
                    espacosVazios++;
                }
            }

            System.out.println(frase);
            System.out.println(fraseSemEspacos);
            System.out.printf("Contador de espaços vazios: %d%n", espacosVazios);

        } else {
            System.out.println("Frase com length superior a 50 caracteres!");
        }
    }
}
