package src;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

/* EXERCICIO 18
   Escreva um programa que leia um numero inteiro (variável CODIGO). Verificar se o código é igual a 1 igual 2 ou igual
   a 3. Caso não seja, apresentar a mensagem “Código Invalido“. Ao ser verificado o código e constatado que é um valor
   valido, o programa deve verificar cada código e separado para determinar seu valor por extenso, ou seja, apresentar
   a mensagem “um“, “dois“ ou “três“. (Utilizar o comando Switch)
*/

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um código: ");
        int CODIGO = entrada.nextInt();

        switch (CODIGO) {
            case 1 :
                System.out.println("UM");
                break;
            case 2 :
                System.out.println("DOIS");
                break;
            case 3 :
                System.out.println("TRÊS");
                break;
            default:
                System.out.println("CÓDIGO INVÁLIDO!");
        }
        System.out.println("FIM!!!");
    }
}
