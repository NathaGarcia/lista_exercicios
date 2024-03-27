package src;

import java.util.Scanner;

public class Exercicio24 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("1 - Verificar se um dos numeros lidos é ou nao multiplo do outro");
        System.out.println("2 - Verificar se os dois numeros lidos sao pares");
        System.out.println("3 - Verificar se a media dos dois numeros é maior ou igual a 7");
        System.out.println("4 -Sair");
        int opcao = entrada.nextInt();

        switch (opcao){
            case 1:
                boolean eMultiplo = num1 % num2 == 0 ? true : false;
                System.out.printf("É multiplo? %b", eMultiplo);
                break;
            case 2:
                boolean num1EPar = num1 % 2 == 0 ? true : false;
                boolean num2EPar = num2 % 2 == 0 ? true : false;
                System.out.printf("O primeiro número é par? %b", num1EPar);
                System.out.printf("O segundo número é par? %b", num2EPar);
                break;
            case 3:
                boolean mediaMaiorIgual7 = ((num1 + num2)/2 >= 7) ? true : false;
                System.out.printf("A média dos dois é maior ou igual a 7? %b", mediaMaiorIgual7);
                break;
            default :
                System.out.println("Saindo...");
                break;
        }
    }
}
