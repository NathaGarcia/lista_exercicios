package src;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite três números: ");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int numero3 = entrada.nextInt();
        int maior;
        int mediano;
        int menor;

        //verifica o maior
        if (numero1 > numero2 && numero1 > numero3)  {
            maior = numero1;
        } else if (numero2 > numero1 && numero2 > numero3) {
            maior = numero2;
        } else {
            maior = numero3;
        }

        //verifica o menor
        if (numero1 < numero2 && numero1 < numero3)  {
            menor = numero1;
        } else if (numero2 < numero1 && numero2 < numero3) {
            menor = numero2;
        } else {
            menor = numero3;
        }

        //verifica o mediano
        if (numero1 != menor && numero1 != maior)  {
            mediano = numero1;
        } else if (numero2 != menor && numero2 != maior) {
            mediano = numero2;
        } else {
            mediano = numero3;
        }

        System.out.printf("Maior: %d\n Mediano: %d\n Menor: %d\n", maior, mediano, menor);

    }

}
