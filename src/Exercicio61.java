package src;

import java.util.Scanner;


public class Exercicio61 {

    public static void main(String[] args) {

        Salario salario = new Salario();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        salario.salario = entrada.nextDouble();
        System.out.println("Digite o índice de reajuste: ");
        salario.indiceReajuste = entrada.nextDouble();

        salario.imprimirSalarioReajustado();

    }
}
class Salario {
    double salario;
    double indiceReajuste;

    double reajusteSalarial(double salario, double indiceReajuste) {
        this.salario = salario;
        this.indiceReajuste = indiceReajuste;
        return (salario * (indiceReajuste/100)) + salario;
    }

    void imprimirSalarioReajustado() {
        System.out.printf("O salário normal é R$%.2f e o reajuste é de %.0f%%\n", salario, indiceReajuste);
        System.out.printf("O salário reajustado é: R$%.2f", reajusteSalarial(salario, indiceReajuste));
    }

}