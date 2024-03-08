import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma temperatura em Fahrenheit: ");
        double fahrenheit = entrada.nextDouble();

        double celsius = ((fahrenheit - 32) * 5 ) / 9;

        System.out.printf("A temperatura apresentada em Fahrenheit %.0fºF, convertida para Celsius é %.0fºC.",
                fahrenheit, celsius);

    }
}
