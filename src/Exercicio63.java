package src;
/*  Escreva um programa que verifique se um numero é par ou impar atraves de um metodo chamdo VERIFICA. O metodo devera
    receber um numero inteiro (n) e devera retornar a mensagem “PAR“ ou “IMPAR“
 */

import java.util.Scanner;

public class Exercicio63 {

    public static void main(String[] args) {

        Numero num = new Numero();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para verificar se ele é par ou ímpar");
        num.numero = entrada.nextInt();

        num.verificaParImpar(num.numero);

    }
}

class Numero {
    int numero;


    void verificaParImpar(int numero) {
        this.numero = numero;
        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
