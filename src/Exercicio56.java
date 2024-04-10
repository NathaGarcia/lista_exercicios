package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio56 {

    public static void main(String[] args) {

        ArrayList<Integer> arrayDeNumeros = new ArrayList<>();
        int contadorDePares = 0;
        int contadorDeMultiplosDeCinco = 0;
        int num=0;
        final int MAX_POSITIONS = 50;

        Scanner entrada = new Scanner(System.in);

        while ((arrayDeNumeros.size() < MAX_POSITIONS) && (num >= 0)) {
            System.out.println("Digite um números: ");
            num = entrada.nextInt();
            arrayDeNumeros.add(num);
        }

        for (Integer numero : arrayDeNumeros) {
            if (numero % 2 == 0) {
                contadorDePares ++;
            }
            if (numero % 5 == 0) {
                contadorDeMultiplosDeCinco ++;
            }
        }

        System.out.printf("Contador de números pares: %d%n", contadorDePares);
        System.out.printf("Contador de números multiplos de 5: %d", contadorDeMultiplosDeCinco);

    }
}
