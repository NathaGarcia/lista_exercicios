package src;


import java.util.ArrayList;

public class Exercicio43 {

    public static void main(String[] args) {

        int graoDeTrigo=1;
        int sacoDeGraos = 0;
        int casasTabuleiro = 8;//64 ou 8; //1 2 4 8 16 32 64 128

        ArrayList<Integer>tabuleiroDeXadrez = new ArrayList<Integer>();

        for (int i = 0; i < casasTabuleiro; i++) {
            tabuleiroDeXadrez.add(graoDeTrigo);
            sacoDeGraos += graoDeTrigo;
            graoDeTrigo = graoDeTrigo * 2;
            System.out.println(tabuleiroDeXadrez);
        }
            System.out.printf("Saco de grãos: %d", sacoDeGraos);

    }
}
