import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma temperatua em Celsius: ");
        double celsius = entrada.nextDouble();

        double fahrenheit =  (9 * celsius + 160) / 5;

        System.out.printf("A temperatura em Celsius %.0fºC convertida para Fahrenheit é %.0fºF", celsius, fahrenheit);

    }
}
