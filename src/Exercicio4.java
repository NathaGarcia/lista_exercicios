import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor para A: ");
        int a = entrada.nextInt();
        System.out.print("Digite um valor para B: ");
        int b = entrada.nextInt();
        System.out.print("Digite um valor para C: ");
        int c = entrada.nextInt();
        System.out.print("Digite um valor para D: ");
        int d = entrada.nextInt();

        int soma = (a+b) + (a+c) + (a+d) + (b+c) + (b+d) + (c+d);
        int multiplicacao = (a*b) + (a*c) + (a*d) + (b*c) + (b*d) + (c*d);

        System.out.printf("Soma = %d%n", soma);
        System.out.printf("Multiplicacao = %d", multiplicacao);

    }
}
