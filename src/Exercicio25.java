package src;

import java.util.Scanner;

public class Exercicio25 {
/*### EXERCICIO 25
    Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um programa que calcule seu peso ideal, utilizando as seguintes formulas: (h = altura)
    Para homens: (72.7 * h) - 58
    Para mulheres: (62.1 * h) - 44.7
*/

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o sexo: M-Masculino F-Feminino");
        String sexo = entrada.nextLine();
        System.out.println("Digite a altura: ");
        double altura = entrada.nextDouble();
        double resultado;

        if (sexo.equals("m")) {
            System.out.println("Calculando altura ideal sexo Masculino");
            resultado = (72.7 * altura) - 58;
            System.out.printf("Calculo de peso ideal = %.2f", resultado);

        } else if (sexo.equals("f")) {
            System.out.println("Calculando altura ideal sexo Feminino");
            resultado = (62.1 * altura) - 44;
            System.out.printf("Calculo de peso ideal = %.2f", resultado);
        }
    }
}
