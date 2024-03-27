package src;

import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a quantidade de números irá ser processada?");
        int quantidadeNumeros = entrada.nextInt();


        while (quantidadeNumeros != 0) {

            System.out.println("Qual número será processado? ");
            int numeroProcessado = entrada.nextInt();

            int fatorial=1;
            for (int i = 1; i <= numeroProcessado; i++) {
                fatorial = fatorial * i;
            }
            System.out.printf("Fatorial de %d é %d%n", numeroProcessado, fatorial);
            quantidadeNumeros --;
        }

    }


}
