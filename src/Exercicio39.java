package src;


import java.util.Scanner;

public class Exercicio39 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        String encerrar = "n";
        while (encerrar.equals("n")) {
            System.out.println("Digite um número: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                System.out.printf("%d é PAR ", numero);
            } else {
                System.out.printf("%d é IMPAR ", numero);
            }

            if (numero >= 0) {
                System.out.print("e POSITIVO\n");
            } else {
                System.out.print("e NEGATIVO\n");
            }

            System.out.println("Deseja encerrar? - [S]-SIM  [N]-NÃO");
            encerrar = entradaString.nextLine();
        }
        System.out.println("Até mais!!! =)");
    }
}
