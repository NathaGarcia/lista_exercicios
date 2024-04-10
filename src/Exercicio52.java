package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio52 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> vetor = new ArrayList<>();
        int contadorRepeticoes = 0;

        int numero = 1;
        while (numero > 0) {

            System.out.println("Escreva um número: ");
            numero = entrada.nextInt();

            vetor.add(numero);
        }

        for (int i = 0; i < vetor.size(); i++) {

            if ((vetor.get(i).equals(1)) && (vetor.get(i+1).equals(3)) && (vetor.get(i+2).equals(4))) {
                contadorRepeticoes++;
            }
        }

        System.out.printf("Contador de repetições: %d%n", contadorRepeticoes);
        System.out.println(vetor);
    }
}
