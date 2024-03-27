package src;


import java.util.Scanner;

public class Exercicio38 {

    public static void main(String[] args) {

        int C; //código
        int N; //numero de horas trabalhadas
        double HORA = 10.00;
        double HORA_EXCEDENTE = 20.00;
        double excedente;
        double salario;
        double salarioExcedente;

        Scanner entrada = new Scanner(System.in);
        Scanner entradaScanner = new Scanner(System.in);

        String continuar = "s";
        while (continuar.equals("s")) {

            System.out.println("Digite o código do funcionário: ");
            C = entrada.nextInt();
            System.out.println("Digite o número de horas trabalhadas: ");
            N = entrada.nextInt();

            excedente = N - 50;
            salario = HORA * (N - excedente) ;

            if (N > 50) {
                salarioExcedente = HORA_EXCEDENTE * (excedente);
                double salarioTotal = salario + salarioExcedente;
                System.out.printf("O salário total do funcionário código %d é R$%.2f, somando o salário R$%.2f com o excedente R$%.2f\n", C, salarioTotal, salario, salarioExcedente);
            } else {
                System.out.printf("O salário do funcionário de código %d é R$%.2f\n", C, salario);
            }

            System.out.println("Deseja continuar no programa? [S]-SIM [N]-NÃO");
            continuar = entradaScanner.nextLine();

        }
        System.out.println("Obrigada por consultar a folha!!! =)");
    }
}
