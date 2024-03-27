package src;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor para A");
        int a = entrada.nextInt();
        System.out.println("Digite um valor para B");
        int b = entrada.nextInt();

        int auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.printf("A variável A possui o valor: %d e a B o valor: %d", a, b);




        /*
        Ler dois valores inteiros para as variais A e B, efetuar a troca dos valores de modo que a variável A passe a
        possuir valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
         */
    }

}
