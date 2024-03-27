package src;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor para A.");
        int a = entrada.nextInt();
        System.out.println("Digite um valor para B.");
        int b = entrada.nextInt();
        System.out.println("Digite um valor para C.");
        int c = entrada.nextInt();
        int menor;
        int maior;
        int menorMultiplicaMaior;
        int maiorDivideMenor;


        //Verifica se o numero é menor que 0
        while (a <= 0) {
            System.out.println("Valor inválido!!! Digite um valor válido para A!");
            a = entrada.nextInt();
        }
        while (b <= 0) {
            System.out.println("Valor inválido!!! Digite um valor válido para B!");
            b = entrada.nextInt();
        }
        while (c <= 0) {
            System.out.println("Valor inválido!!! Digite um valor válido para C!");
            c = entrada.nextInt();
        }

        //verifica o maior numero
        if (a > b && a > c) {
            maior = a;
        } else if (b > a && b > c) {
            maior = b;
        } else {
            maior = c;
        }

        //verifica o menor numero
        if (a < b && a < c ) {
            menor = a;
        } else if (b < a && b < c) {
            menor = b;
        } else {
            menor = c;
        }

        System.out.printf("Maior: %d%nMenor: %d%n", maior, menor);

        //calcula
        menorMultiplicaMaior = menor * maior;
        maiorDivideMenor = maior / menor;

        System.out.printf("O menor:%d multiplicado pelo maio:%d = %d%n", menor, maior, menorMultiplicaMaior);
        System.out.printf("O maior:%d dividido pelo menor:%d = %d%n", maior, menor, maiorDivideMenor);

    }

}
