package src;


import java.util.Scanner;

public class Exercicio44 {

    public static void main(String[] args) {

        /*44 Faça um programa que exiba as opcoes
        1 - Conversao de Graus Celsius em Graus Fahrenheit
        2 - Conevrsao de Graus Fahrenheit em Graus Celsius
        3 - Peso ideal do homem
        4 - Peso ideal da mulher
        O programa só deve encerar quando o usuario digitar 'S' para a pergunta “Deseja encerrar o programa?“
        Obs.: Nas opcoes 3 e 4 informar se o usuario esta acima ou abaixo do peso ideal.
*/

        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        String encerrar = "n";
        while (encerrar.equals("n")) {

            System.out.println("Escolha uma das opções:\n" +
                    "1 - Conversao de ºC para ºF\n" +
                    "2 - Conevrsao de ºF para ºC\n" +
                    "3 - Peso ideal homem\n" +
                    "4 - Peso ideal mulher");

            int condicao = entrada.nextInt();
            switch (condicao) {
                case 1:
                    System.out.println("Digite um valor em Celsius para converter em Fahrenheit: ");
                    double celsius = entrada.nextDouble();
                    double conversaoFahrenheit = (celsius * 1.8) + 32;
                    System.out.printf("A conversão de Celsius para Fahrenheit é %.0fºF", conversaoFahrenheit);
                break;
                case 2:
                    System.out.println("Digite um valor em Fahrenheit para converter em Celsius: ");
                    double fahrenheit = entrada.nextDouble();
                    double conversaoCelsius = (fahrenheit - 32) / 1.8;
                    System.out.printf("A conversão de Fahrenheit para Celsius é %.0fºC", conversaoCelsius);
                break;
                case 3:
                    System.out.println("Digite sua altura: ");
                    double homemAltura = entrada.nextDouble();
                    System.out.println("Digite seu peso: ");
                    double pesoHomem = entrada.nextDouble();
                    double resultadoHomem = ((62.1 * homemAltura) - 44.7);
                    if (pesoHomem != resultadoHomem) {
                        System.out.printf("O peso ideal é %.2fkg", resultadoHomem);
                    }
                break;
                case 4:
                    System.out.println("Digite sua altura: ");
                    double mulheresAltura = entrada.nextDouble();
                    System.out.println("Digite seu peso: ");
                    double pesoMulher = entrada.nextDouble();
                    double resultadoMulher =  ((72.7 * mulheresAltura) - 58);
                    if (pesoMulher != resultadoMulher) {
                        System.out.printf("O peso ideal é %.2fkg", resultadoMulher);
                    }
                break;
                default:
                    System.out.println("Opção inválida!!!");
            }

            System.out.println("\nDeseja encerrar?");
            encerrar = entradaString.nextLine();
        }
        System.out.println("fim");
    }
}
