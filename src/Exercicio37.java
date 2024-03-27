package src;


import java.util.Scanner;

public class Exercicio37 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;


        int continuar = 1;
        while (continuar ==1) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Adição\nDigite dois números: ");
                    numero1 = entrada.nextInt();
                    numero2 = entrada.nextInt();
                    System.out.printf("Resultado: %d%n", (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("Você escolheu Subtração\nDigite dois números: ");
                    numero1 = entrada.nextInt();
                    numero2 = entrada.nextInt();
                    System.out.printf("Resultado: %d%n", (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("Você escolheu Multiplicação\nDigite dois números: ");
                    numero1 = entrada.nextInt();
                    numero2 = entrada.nextInt();
                    System.out.printf("Resultado: %d%n", (numero1 * numero2));
                    break;
                case 4:
                    System.out.println("Você escolheu Divisão\nDigite dois números: ");
                    numero1 = entrada.nextInt();
                    numero2 = entrada.nextInt();
                    System.out.printf("Resultado: %d%n", (numero1 / numero2));
                    break;
                default:
                    System.out.println("Opção inválida!!!");
                    break;
            }
            System.out.println("\n----> DESEJA CONTINUAR? <----\n [1]-SIM [0]-NÃO");
            continuar = entrada.nextInt();

            if (continuar != 1) {
                System.out.println("Ahhhh, já vai?? :'(");
            }
        } //while
    }
}
// verificar pq com o string não funciona bem. tive de usar o int no while para tal verificação. perdi umas 6 horas com isso +-