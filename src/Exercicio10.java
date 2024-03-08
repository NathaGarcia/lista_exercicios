import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        if (numero1 == numero2) {
            System.out.println("Número 1 é IGUAL ao Número 2");
        }
        if (numero1 != numero2) {
            System.out.println("Número 1 NÃO É IGUAL ao Número 2");
        }
        if (numero1 > numero2) {
            System.out.println("Número 1 é MAIOR que Número 2");
        }
        if (numero1 < numero2) {
            System.out.println("Número 1 é MENOR que Número 2");
        }
        if (numero1 >= numero2) {
            System.out.println("Número 1 é MAIOR IGUAL que Número 2");
        }
        if (numero1 <= numero2) {
            System.out.println("Número 1 é MENOR IGUAL que Número 2");

        }

    }

}
