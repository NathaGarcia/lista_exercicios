package src;


import java.util.Scanner;

public class Exercicio60 {

    public static void main(String[] args) {

        Quadrante quadrante = new Quadrante();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero para o quadrante X: ");
        quadrante.x = entrada.nextInt();
        System.out.println("Digite um numero para o quadrante Y: ");
        quadrante.y = entrada.nextInt();

        quadrante.verificaQuadrante(quadrante.x, quadrante.y);

    }
}
class Quadrante {
    int x;
    int y;

    void verificaQuadrante (int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("Quadrante de X: %d%n", x);
        System.out.printf("Quadrante de Y: %d%n", y);

    }
}