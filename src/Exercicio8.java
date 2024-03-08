import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double PI = 3.14159;
        System.out.print("Digite o raio: ");
        double raio = entrada.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = entrada.nextDouble();

        double volume = PI * (raio * raio) * altura;

        System.out.printf("O volume da lata é: %.0fcm³", volume);

    }
}
