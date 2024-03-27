package src;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero1;
        double numero2;
        double resultado;

        System.out.println("Escolha uma operação: 1-Adição 2-Subtração 3-Multiplicação 4-Divisão");
        int operacao = entrada.nextInt();

        System.out.println("Digite dois números para a operação selecionada:");
        numero1 = entrada.nextDouble();
        numero2 = entrada.nextDouble();

        switch(operacao){
            case 1:
                resultado = numero1 + numero2;
                System.out.printf("Adição = %.2f", resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.printf("Subtração = %.2f", resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.printf("Multiplicação = %.2f", resultado);
                break;
            case 4:
                resultado = numero1 / numero2;
                System.out.printf("Divisão = %.2f", resultado);
                break;
            default :
                System.out.println("OPERAÇÃO INVÁLIDA!");

        }
    }
}
