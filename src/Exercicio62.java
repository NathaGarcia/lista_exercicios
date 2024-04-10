package src;

import java.util.Scanner;

public class Exercicio62 {

    public static void main(String[] args) {

        Hipotenusa hipotenusa = new Hipotenusa();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor para a base: ");
        hipotenusa.base = entrada.nextDouble();
        System.out.println("Digite um valor para a altura: ");
        hipotenusa.altura = entrada.nextDouble();

        hipotenusa.imprimirHipotenusa();

    }
}
class Hipotenusa {
    double base;
    double altura;

    double calcularHipotenusa(double base, double altura) {
        this.base = base;
        this.altura = altura;
        double hipotenusa = (base * base) + (altura * altura);
        return Math.sqrt(hipotenusa);
    }

    void imprimirHipotenusa() {
        System.out.printf("O cálculo da hipotenusa é: %.1f", calcularHipotenusa(base, altura));
    }

}