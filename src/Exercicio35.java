package src;


public class Exercicio35 {

    public static void main(String[] args) {

        int multiplosDez=10;

        for (int i = 0; i <= 100; i++) {
            if(i % multiplosDez == 0) {
                System.out.println(i + " - Múltiplo de 10");
            } else {
                System.out.println(i + " - não é Múltiplo de 10");
            }
        }
    }
}
