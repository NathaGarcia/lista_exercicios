package src;

import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número menor que 10 e maior que 0: ");
        int numero = entrada.nextInt();

        if ((numero > 0 && numero < 10) && (numero % 2 == 1)) {
            for (int i = 1; i < 20; i ++) {
                int quadrado = numero*numero;
                System.out.printf("%d² é %d%n", numero, quadrado);
                numero += 2;
            }
        } else {
            System.out.println("Número não é ímpar ou não é menor que 10 e maior que 0: ");

        }
    }
}
