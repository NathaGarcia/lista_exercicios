package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio49 {

    public static final int MAX = 50;

    public static void main(String[] args) {

        ArrayList<Integer> v1 = new ArrayList<>();
        ArrayList<Integer> v2 = new ArrayList<>();
        ArrayList<Integer> vetorDeIguais = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantos números deseja comparar: ");
        int quantidadeComparacoes = entrada.nextInt();

        if (quantidadeComparacoes <= MAX) {

            while (v1.size() < quantidadeComparacoes && v2.size() < quantidadeComparacoes) {
                System.out.println("Digite um numero para o vetor1");
                v1.add(entrada.nextInt());
                System.out.println("Digite um numero para o vetor2");
                v2.add(entrada.nextInt());
            }


            for (int i = 0; i < v1.size(); i++) {
                if (v1.get(i).equals(v2.get(i))) {
                    int aux = v1.get(i);
                    vetorDeIguais.add(aux);

                }
            }

        System.out.println("Números repetidos: ");
        System.out.println(vetorDeIguais);
        System.out.printf("Quantidade de valores idênticos: %d", vetorDeIguais.size());

        } else {
            System.out.println("Quantidade de comparações superior a 50!\nFIM!!!");
        }
    }
}
