import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade mínima: ");
        int quantidadeMinima = entrada.nextInt();
        System.out.print("Digite a quantidade máxima: ");
        int quantidadeMaxima = entrada.nextInt();

        int estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;

        System.out.printf("O estoque médio equivale a: %d ", estoqueMedio);


    }

}
