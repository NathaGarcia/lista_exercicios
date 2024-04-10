package src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio59 {

    public static void main(String[] args) {

        int contadorEntreCaracter = 0;
        ArrayList<String> vetor = new ArrayList<>();
        Collections.addAll(vetor, "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite primeiro caracter entre A e Z: ");
        String primeiroCaracter = entrada.nextLine();
        System.out.println("Digite o segundo caracter entre A e Z: ");
        String segundoCaracter = entrada.nextLine();

        //verifica se os dois caracteres contém no vetor0
        int posicaoPrimeiro, posicaoSegundo;
        for (int i = 0; i < vetor.size(); i++) { //Varre o vetor para o primeiro caracter
            for (int j = 0; j < vetor.size(); j++) { //Varre o vetor para o segundo caracter

                if ((primeiroCaracter.contains(vetor.get(i))) && (segundoCaracter.contains(vetor.get(j)))) { //Verifica se o primeiro e segundo caracter contem no vetor
                    posicaoPrimeiro = vetor.indexOf(vetor.get(i)); // Verifica a posição da letra
                    posicaoSegundo = vetor.indexOf(vetor.get(j)); // Verifica a posição da letra

                    if (posicaoPrimeiro < posicaoSegundo) { //Calcula a distância entre as letras
                        contadorEntreCaracter = posicaoSegundo - posicaoPrimeiro;
                        System.out.printf("A distância entre %s e %s é de %d caracteres!%n", primeiroCaracter, segundoCaracter, contadorEntreCaracter);
                    } else {
                        System.out.println("Você não digitou dois caracteres na ordem!!");
                    }
                }
            }
        }
    }
}