package src;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero=1;

        do {
            System.out.println("Digite um número qualquer ou 0 para sair: ");
            numero = entrada.nextInt();

            System.out.println(numero > 0 ? "NÚMERO POSITIVO" : "NÚMERO NEGATIVO");

        } while (numero != 0);
        System.out.println("FIM!!");

    }
}
