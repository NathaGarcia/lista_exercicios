package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio54 {

    public static void main(String[] args) {


        ArrayList<Integer> vetorA = new ArrayList<>();
        ArrayList<Integer> vetorB = new ArrayList<>();
        ArrayList<Integer> vetorC = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 5 valores para o vetor A");
        while(vetorA.size() < 5) {
            vetorA.add(entrada.nextInt());
        }

        System.out.println("Digite 8 valores para o vetor B");
        while(vetorB.size() < 8) {
            vetorB.add(entrada.nextInt());
        }

        System.out.println("Vetor A " + vetorA);
        System.out.println("Vetor B " + vetorB);

        for (int i = 0; i < vetorA.size(); i++) {
            if (vetorB.contains(vetorA.get(i))) {
                Integer aux = vetorA.get(i);
                if (!vetorC.contains(aux)) {
                    vetorC.add(aux);
                }
            }

        }
        System.out.println("Números repetidos: " + vetorC);

    }
}
