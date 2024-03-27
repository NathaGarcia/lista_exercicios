package src;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int maior;
        int menor;
        int diferenca;

        if (num1 > num2) {
            maior = num1;
            menor = num2;
        } else {
            maior = num2;
            menor = num1;
        }

        diferenca = maior - menor;

        System.out.printf("Maior: %d <---> Menor: %d%n", maior, menor);
        System.out.printf("A diferença entre o Maior e o Menor é: %d números.", diferenca);
    }

}
