package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio58 {

    public static void main(String[] args) {

        ArrayList<Integer> vetor = new ArrayList<>();
        int numero = 1;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha quantos números deseja armazenar no vetor: ");
        int quantidadeNumerosVetor = entrada.nextInt();

        //coleta de números
        while ((vetor.size() < quantidadeNumerosVetor) && (numero > 0)) {
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
            vetor.add(numero);
        }

        //soma vetor
        int soma = 0;
        for (int i = 0; i < vetor.size(); i++) {
            soma += vetor.get(i);
        }
        System.out.printf("Soma: %d%n", soma);

        //calcula a média
        int media = 0;
        media = soma/vetor.size();
        System.out.printf("Media: %d%n", media);

        //comparação para imprimir o número maior
        int maior = 0;
        for (Integer num : vetor) {
            if (num > maior) {
                maior = num;
            }
        }
        System.out.printf("Maior: %d%n", maior);

    }
}
