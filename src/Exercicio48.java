package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio48 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        ArrayList<String> candidatasSelecionadas = new ArrayList<>();

        int participantes = 0;
        while (participantes < 5) {
            System.out.println("Digite o nome da participante: ");
            String nome = entradaString.nextLine();
            System.out.printf("Digite a idade da %s: ", nome);
            int idade = entrada.nextInt();

            if (idade >= 18 && idade <= 20) {
                candidatasSelecionadas.add(nome);
            }
            participantes++;
        }
            System.out.println("Candidatas selecionas: ");
            System.out.println(candidatasSelecionadas);

    }
}
