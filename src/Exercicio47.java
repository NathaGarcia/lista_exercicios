package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio47 {

    public static void main(String[] args) {

        ArrayList<Integer> vetor = new ArrayList<>();
        ArrayList<Integer> vetorMaioresQueX = new ArrayList<>();
        ArrayList<Integer> vetorMenoresQueX = new ArrayList<>();
        ArrayList<Integer> vetorIguaisAX = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para x: ");
        int x = entrada.nextInt();

        //acrescentando numeros ao vetor
        while (vetor.size() < 10) {
            System.out.println("Digite um número para o vetor: ");
            vetor.add(entrada.nextInt());
        }

        //comparações
        for (Integer numero : vetor) {
            if (numero > x) {
                vetorMaioresQueX.add(numero);
            } else if (numero < x) {
                vetorMenoresQueX.add(numero);
            } else {
                vetorIguaisAX.add(numero);
            }
        }
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        System.out.println(vetor);
        System.out.printf("X é: %d%n", x);
        System.out.printf("Menores que x: %d%n" , vetorMenoresQueX.size());
        System.out.printf("Maiores que x: %d%n" , vetorMaioresQueX.size());
        System.out.printf("Iguais a x: %d%n" , vetorIguaisAX.size());

    }
}
