package src;

import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int par = 0;
        int impar = 0;

        while (numero >= 0) {
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
            if (numero % 2 == 0){
                System.out.printf("o número %d é par.%n", numero);
                par += numero;
            } else {
                System.out.printf("o número %d é ímpar.%n", numero);
                if (numero > 0) {
                    impar += numero;
                }
            }
        }
        System.out.printf("Soma dos números pares: %d%n", par);
        System.out.printf("Soma dos números impares: %d%n", impar);
    }
}
