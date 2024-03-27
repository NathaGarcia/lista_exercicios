package src;


import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio42 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int maior=0;
        int menor=10000;

        int condicao = 1;
        while (condicao != 0) {

            System.out.println("Digite um número: ");
            numeros.add(entrada.nextInt());

            System.out.println("Digite 0 para encerrar ou 1 para continuar !");
            condicao = entrada.nextInt();
        }

        System.out.println("Números escolhidos: " + numeros);

        System.out.println("Verificando maior e menor...");
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > maior) {
                maior = numeros.get(i);
            }
            if (numeros.get(i) < menor) {
                menor = numeros.get(i);
            }
        }
        System.out.printf("Maior: %d%n", maior);
        System.out.printf("Menor: %d", menor);
    }
}
