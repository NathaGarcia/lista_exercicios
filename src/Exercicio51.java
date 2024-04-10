package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio51 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();
        double somaNotas = 0;
        int alunosComMediaAcimaDeSete = 0;

        String temAlunos = "s";
        while (temAlunos.equals("s")) {
            System.out.println("Digite uma nota: ");
            double nota = entrada.nextDouble();

            notas.add(nota);
            somaNotas += nota;

            if (nota > 7.0) {
                alunosComMediaAcimaDeSete++;
            }

            System.out.println("Existem mais alunos para calcular média?\n[S]-Sim [N]-Não");
            temAlunos = entradaString.nextLine();
        }

        double media = somaNotas/notas.size();

        if (media < 5.0) {
            System.out.println("Nao ha nenhum aluno com nota acima de 5!");
        }

        System.out.println("- - - - - - - - - - - - - - - - - -");
        System.out.printf("A média dos alunos é igual a %.1f%n", media);
        System.out.printf("Existem %d alunos com a média acima de 7,0", alunosComMediaAcimaDeSete);

    }
}
