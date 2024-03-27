package src;

import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int temMaisAlunos=1;
        int matricula;
        double nota;
        double media = 0;
        int numeroAlunos=0;


        while (temMaisAlunos != 0) {
            
            System.out.println("Digite a matrícula do aluno: ");
            matricula = entrada.nextInt();
            System.out.println("Digite a nota do aluno: ");
            nota = entrada.nextDouble();
            
            System.out.println("Tem mais alunos a serem calculados?\n0-NÃO 1-SIM");
            temMaisAlunos = entrada.nextInt();
            
            numeroAlunos ++;
            media += nota;
        }
        media = media/numeroAlunos;
        System.out.println("Fim!!");
        System.out.printf("A média %.2f foi dividida pela quantidade de %d alunos!!", media, numeroAlunos);

    }
}
