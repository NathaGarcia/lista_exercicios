package src;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

    /*
    Se o valor da media for menor que 7, solicitar a nota de recuperação, somar com o valor da media e obter a nova
    media. Se a nova media for maior ou igual a 7, apresentar uma mensagem informando que o aluno foi aprovado na
    recuperação. Se o aluno não foi aprovado, apresentar uma mensagem informando esta condição. Apresentar junto com as
    mensagens o valor da media do aluno
    */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quatro notas: ");
        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double nota3 = entrada.nextDouble();
        double nota4 = entrada.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        double notaRecuperacao;

        if (media >= 7) {
            System.out.printf("Aprovado!  Média: %.1f", media);
        } else if (media < 7) {//solicitar nota recuperação, somar com a media e obter nova media
            System.out.printf("Em recuperação! --- Média Atual:%.1f --- Digite uma nota: ", media);
            notaRecuperacao = entrada.nextDouble();

            double mediaAposRecuperacao = (media + notaRecuperacao) / 2;

            if (mediaAposRecuperacao >= 7) {
                System.out.printf("Aprovado! Média após a recuperação: %.1f", mediaAposRecuperacao);
            } else {
                System.out.printf("Reprovado! Média após a recuperação: %.1f", mediaAposRecuperacao);

            }

        }

    }
}
