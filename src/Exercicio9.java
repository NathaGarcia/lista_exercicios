import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int diaNascimento = entrada.nextInt();

        System.out.print("Digite o mês: ");
        int mesNascimento = entrada.nextInt();

        System.out.print("Digite o ano: ");
        int anoNascimento = entrada.nextInt();

        int idadeAnos = 2024 - anoNascimento;
        int idadeEmDias = idadeAnos * 365;

        System.out.printf("A idade da pessoa em dias é %d.", idadeEmDias);

    }
}
