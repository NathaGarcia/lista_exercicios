package src;


import java.util.Scanner;

public class Exercicio40 {

    public static void main(String[] args) {

        //índice de poluição 0,05 até 0,25 aceitável
        //índice de poluição 0,26 até 0,3 - a industrias do Primeiro grupo sao intimadas a suspenderem suas atividades,
        //indice crescer para 0,4 as industrias do Primeiro e Segundo grupo sao intimadas a suspenderem suas atividades,
        //indice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.

        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        String encerrar = "n";
        while (encerrar.equals("n")) {

            System.out.println("Qual é o índice de poluição?");
            double indicePoluicao = entrada.nextDouble();

            if ((indicePoluicao >= 0.05) && (indicePoluicao <= 0.25)) {
                System.out.println("Nível aceitável!!");
            } else if ((indicePoluicao >= 0.26) && (indicePoluicao <= 0.30)) {
                System.out.println("INTIMAÇÃO!!!\nA Indústria do Primeiro grupo deve suspender suas atividades!!");
            } else if ((indicePoluicao >= 0.31) && (indicePoluicao <= 0.40)) {
                System.out.println("INTIMAÇÃO!!!\nAs Indústria do Primeiro e Segundo grupo devem suspender suas atividades!!");
            } else if ((indicePoluicao >= 0.41) && (indicePoluicao <= 0.50)) {
                System.out.println("INTIMAÇÃO!!!\nTodos os grupos devem suspender suas atividades!!");
            }

            System.out.println("Deseja encerrar? [S]-SIM  [N]-NÃO");
            encerrar = entradaString.nextLine();

        }
        System.out.println("F I M !!!");
    }
}
