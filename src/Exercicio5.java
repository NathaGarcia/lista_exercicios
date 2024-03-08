import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual o tempo gasto na viagem? ");
        double tempoGasto = entrada.nextDouble();
        System.out.print("Qual a velocidade média o carro percorreu? ");
        double velocidadeMedia = entrada.nextDouble();

        double distancia = tempoGasto * velocidadeMedia;
        double qtdeLitrosUtilizados = distancia/12;


        System.out.printf("A viagem de %.0fkm foi feita em %.0fh, na velocidade media de %.0fkm/h gastando %.3fl de combustível. ", distancia, tempoGasto, velocidadeMedia, qtdeLitrosUtilizados);


    }

}
