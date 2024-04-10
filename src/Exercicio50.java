package src;

import java.util.Scanner;

public class Exercicio50 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int tentativas = 0;
        int sorteado = 54;
        int numero;

        do {
            System.out.println("Digite um número entre 0 e 100");
            numero = entrada.nextInt();

            tentativas ++;

            if (numero > sorteado) {
                System.out.println("Número maior que o número sorteado");
            } else if (numero < sorteado){
                System.out.println("Número menor que o número sorteado");
            } else {
                System.out.println("Parabéns!!!\nVocê acertou!!!");
            }
        } while (numero != sorteado);

        System.out.printf("Número de tentativas: %d", tentativas);
    }
}
