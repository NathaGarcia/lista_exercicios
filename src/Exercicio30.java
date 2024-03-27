package src;

import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual tabuada deseja consultar? ");
        int tabuada = entrada.nextInt();

        System.out.printf("*--- TABUADA DO %d ---*%n", tabuada);
        for (int i = 0; i <= 10; i++) {
            int resultado = i * tabuada;
            System.out.printf("%d X %d = %d%n", tabuada, i, resultado);
        }

    }


}
