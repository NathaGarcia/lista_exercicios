package src;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();
        int a;
        int b;

        if (numero >= 0) {
            a = numero;
            System.out.printf("Numero positivo armazenado em A: %d%n", a);
        } else {
            b = numero;
            System.out.printf("Numero negativo armazenado em B: %d%n", b);
        }

    }

}
