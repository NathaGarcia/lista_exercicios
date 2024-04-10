package src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio45 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        Integer numero = 1;
        while (numero > 0) {
            System.out.println("Digite um número ou 0 caso deseje sair!");
            numero = entrada.nextInt();
            numeros.add(numero);
        }

        System.out.println(numeros); // imprime: [10, 20, 30, 0]
        numeros.sort(Comparator.reverseOrder());
        System.out.println(numeros); //imprime: [30, 20, 10, 0]

    }
}
