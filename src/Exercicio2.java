import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual a cotação do dolar? ");
        double cotacaoDolar = entrada.nextDouble();
        System.out.print("Qual valor em dolar deseja converter ? ");
        double valorDolar = entrada.nextDouble();
        double valorReal = cotacaoDolar * valorDolar;

        System.out.printf("A cotação do dolar está em %.2f. A conversão de U$%.2f equivale a R$%.2f. ", cotacaoDolar, valorDolar, valorReal);

    }

}
