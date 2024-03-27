package src;


import java.util.Enumeration;
import java.util.Scanner;

public class Exercicio36 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int CONTADOR = 10;
        int menor = 10000;
        int maior = 0;
        int media = 0;

        for (int i = 0; i < CONTADOR; i++) {
            System.out.println("Digite um número: ");
            int numero = entrada.nextInt();

            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
            media += numero;
        }
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + media/CONTADOR);

    }
}
