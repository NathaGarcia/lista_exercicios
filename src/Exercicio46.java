package src;

import java.util.ArrayList;

public class Exercicio46 {

    public static void main(String[] args) {

        int[] x = {2,3};
        int[] y = {4,5};
        ArrayList<Integer> multiplicacao = new ArrayList<>();

        //multiplicação de x e y
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                multiplicacao.add(x[i]*y[j]);
                System.out.printf("%d x %d %n", x[i],y[j]);
                System.out.println(multiplicacao);
            }
        }
        //soma dos valores do array
        int soma = 0;
        for (Integer numero : multiplicacao) {
            soma += numero;
        }

        System.out.printf("O produto escalar de X e Y é: %d%n", soma); //45
    }
}
