package src;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a quantidade de numeros ");
        int [] conjuntoNumeros = new int[entrada.nextInt()];


        for (int i =0; i< conjuntoNumeros.length; i++){
            System.out.print("Digite um número: ");
            conjuntoNumeros[i] = entrada.nextInt();
        }
        System.out.println("Conjunto escolhido: " + Arrays.toString(conjuntoNumeros));

        int maior=1;
        int menor=10000;

        for (int numero: conjuntoNumeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor){
                menor = numero;
            }
        }

        System.out.printf("Menor número: %d%n", menor);
        System.out.printf("Maior número: %d%n", maior);

    }
}
