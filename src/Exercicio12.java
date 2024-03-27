package src;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.printf("O modulo do numero é: %d", numero);
        } else {
            numero = numero * -1;
            System.out.printf("O modulo do numero é: %d", numero);

        }
    }
}
