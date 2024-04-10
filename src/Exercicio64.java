package src;
/*  Escreva um programa que devera ter as seguintes opcoes:
    1 - Carregar vetor
    2 - Listar vetor
    3 - Exibir apenas os numeros pares do vetor
    4 - Exibir apenas os numeros impars do vetor
    5 - Exibir a quantidae de numeros pares que existem nas posicoes impares do vetor
    5 - Exibir a quantidade de numeros impares que existem nas posicoes pares do vetor
    6 - Sair
    → Devera ser implementado um metodo para realizar cada uma das opcoes de 1 a 6
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio64 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Vector vector = new Vector();

        int encerrar = 0;
        while (encerrar == 0) {
            System.out.println("- - - - - - - - - - - -\n" +
                    "Escolha uma opção:\n" +
                    "1 - Carregar vetor\n" +
                    "2 - Listar vetor\n" +
                    "3 - Exibir apenas os numeros pares do vetor\n" +
                    "4 - Exibir apenas os numeros impars do vetor\n" +
                    "5 - Exibir a quantidae de numeros pares que existem nas posicoes impares do vetor\n" +
                    "6 - Exibir a quantidade de numeros impares que existem nas posicoes pares do vetor\n" +
                    "7 - Sair");

            int opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite um número que deseja carregar no array: ");
                    vector.carregar(entrada.nextInt());
                    break;
                case 2:
                    vector.listar();
                    break;
                case 3:
                    vector.exibirPar();
                    break;
                case 4:
                    vector.exibirImpar();
                    break;
                case 5:
                    vector.exibirQuantidadePares();
                    break;
                case 6:
                    vector.exibirQuantidadeImpares();
                    break;
                case 7:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida!!");
                    break;

            }
            System.out.println("Deseja encerrar?\n[0]Não - [1]Sim");
            encerrar = entrada.nextInt();
        }
    }

}
class Vector {

    Integer[] vetor = {1,2,3,4,5};

    void carregar(int numero) {
        Integer[] copia = Arrays.copyOf(vetor, vetor.length + 1);
        copia[copia.length - 1] = numero;
        System.out.println(Arrays.toString(copia));

    }

    void listar() {
        System.out.println(Arrays.toString(vetor));
    }

    void exibirPar() {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println("Exibindo numeros pares: " + vetor[i]);
            }
        }
    }

    void exibirImpar() {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 1) {
                System.out.println("Exibindo numeros ímpares: " + vetor[i]);
            }
        }
    }

    void exibirQuantidadePares() {
        int contadorParesNasPosicoesImpares = 0;
        for (int i = 1; i < vetor.length; i+=2) {
            if (vetor[i] % 2 == 0) {
                contadorParesNasPosicoesImpares++;
            }
        }
        System.out.println("Exibindo quantidade de numeros pares nas posições ímpares: " + contadorParesNasPosicoesImpares);
    }

    void exibirQuantidadeImpares() {
        int contadorImparesNasPosicoesPares = 0;
        for (int i = 0; i < vetor.length; i+=2) {
            if (vetor[i] % 2 == 1) {
                contadorImparesNasPosicoesPares++;
            }
        }
        System.out.println("Exibindo quantidade de numeros ímpares nas posições pares: " + contadorImparesNasPosicoesPares);
    }


}