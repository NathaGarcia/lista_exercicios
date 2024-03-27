package src;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        //isósceles = dois lados iguais
        //equilátero = todos os lados iguais
        //escaleno = todos os lados diferentes

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite três valores: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        if ((a < b+c) && (b < a+c) && (c < b+a)) {
            if (a==b && b==c) {
                System.out.println("TRIÂNGULO EQUILÁTERO");
            } else if (a == b || a == c || b == c) {
                System.out.println("TRIÂNGULO ISÓSCELES");
            } else {
                System.out.println("TRIÂNGULO ESCALENO");
            }
        } else {
            System.out.println("NÃO É UM TRIÂNGULO!");
        }

    }
}
