package src;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.printf("Primeiro Nº %d é maior que o segundo Nº %d", num1, num2);
        } else if (num2 > num1){
            System.out.printf("Segundo Nº %d é maior que o primeiro Nº %d", num2, num1);
        } else {
            System.out.println("Os números são iguais!!");
        }
    }
}
