package src;

import java.util.Scanner;

public class Exercicio33ComArrays {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Quantos alunos são? ");
        int numeroAlunos = entrada.nextInt();

        double somatorio = 0;

        for (int i = 0; i < numeroAlunos; i++) {
            System.out.println("Digite a matricula do aluno. ");
            aluno.matricula = entrada.nextInt();
            System.out.println("Digite a nota do aluno. ");
            aluno.nota = entrada.nextDouble();

            somatorio += aluno.nota;

        }
        double media = somatorio / numeroAlunos;
        System.out.printf("A média das notas é %.2f", media);
    }
}

class Aluno {
    int matricula;
    double nota;
}
