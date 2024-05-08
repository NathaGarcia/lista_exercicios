package src;


import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio68 {
    public static void main(String[] args) {

        Caneta2 caneta = new Caneta2();
        int CAPACIDADE_ARRAYLIST = 50;
        ArrayList<Caneta2> estojoDeCanetas = new ArrayList<>(CAPACIDADE_ARRAYLIST);
        Scanner entrada = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);


        int continuar = 1;
        while(continuar != 0) {
            System.out.printf("- - - - - - - - Menu - - - - - - - -\n" +
                    "    1 – Cadastrar caneta\n" +
                    "    2 – Exibir todas as canetas\n" +
                    "    3 – Exibir quantidade de canetas cadastradas\n" +
                    "    4 – Consultar quantidade de canetas de uma determinada cor (digitada pelo usuário)\n" +
                    "    0 - Sair\n");

            int opcao = entradaInt.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite a marca: ");
                    caneta.setMarca(entrada.next());
                    System.out.println("Digite a cor: ");
                    caneta.setCor(entrada.next());
                    if(estojoDeCanetas.size() < CAPACIDADE_ARRAYLIST) {
                        estojoDeCanetas.add(new Caneta2(caneta.getMarca(), caneta.getCor(), caneta.getTamanho()));//cadastrar caneta
                    } else {
                        throw new ArrayIndexOutOfBoundsException("Você ultrapassou a capacidade máxima definida no arraylist");
                    }
                    break;
                case 2:
                    for (Caneta2 cadaCaneta : estojoDeCanetas) {
                        System.out.println(cadaCaneta.toString());//exibir canetas
                    }
                    break;
                case 3:
                    System.out.println("Quantidade de canetas: " + estojoDeCanetas.size());//exibir quantidade de canetas
                    break;
                case 4:
                    int quantidade = 0; //consultar canetas pela cor
                    System.out.println("Qual a cor que deseja saber a quantidade? ");
                    String pesquisaCor = entrada.next();
                    for (int i = 0; i < estojoDeCanetas.size(); i++) {
                        if (estojoDeCanetas.get(i).getCor().equals(pesquisaCor)){
                            quantidade++;
                        }
                    }
                    System.out.printf("Quantidade de canetas na cor %s: %d%n", pesquisaCor, quantidade);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
            }
            continuar = opcao;
        }
    }
}

class Caneta2 {

    private String marca;
    private String cor;
    private int TAMANHO_PADRAO = 15;

    public Caneta2() {

    }


    public Caneta2(String marca, String cor, int tamanho) {
        this.marca = marca;
        this.cor = cor;
        this.TAMANHO_PADRAO = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return TAMANHO_PADRAO;
    }

    public void setTamanho(int tamanho) {
        this.TAMANHO_PADRAO = tamanho;
    }

    public String toString() {
        return "Caneta{ Marca= " + marca + ", Cor= " + cor + ", Tamanho= " + TAMANHO_PADRAO + "}";
    }


}