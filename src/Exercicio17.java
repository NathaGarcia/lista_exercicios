package src;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        if (numero >= 0 && numero <= 9) {
            System.out.print("Valor válido!");
        } else {
            System.out.print("Valor inválido!");
        }
    }
}
