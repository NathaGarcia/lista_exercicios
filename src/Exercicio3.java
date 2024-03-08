import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = entrada.nextLine();
        System.out.print("Digite o código da peça: ");
        int codigoPeca = entrada.nextInt();
        System.out.print("Digite o preço da peça: ");
        double precoPeca = entrada.nextDouble();
        System.out.print("Digite a quantidade vendida: ");
        int quantidadeVendida = entrada.nextInt();

        double venda = quantidadeVendida * precoPeca;

        double comissao = venda * 0.05;

        System.out.printf("O vendedor %s, efetuou uma venda de %d peças de código %d, com valor unitário de R$%.2f e teve uma comissão no valor de R$%.2f.",
                nomeVendedor, quantidadeVendida, codigoPeca, precoPeca, comissao);


    }
}
