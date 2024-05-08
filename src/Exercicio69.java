package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio69 {
    public static void main(String[] args) {

        int CAPACIDADE_MAXIMA = 30;
        Lampada2 lampada = new Lampada2();
        ArrayList<Lampada2> arrayLampadas = new ArrayList<>(CAPACIDADE_MAXIMA);
        Scanner entrada = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);

        int continuar = 1;
        while (continuar != 0) {

            System.out.println("- - - - - - - - - - M E N U - - - - - - - - - -\n" +
                    "    1 – Cadastrar lâmpada\n" +
                    "    2 – Exibir todas as lâmpadas\n" +
                    "    3 – Exibir quantidade de lâmpadas cadastradas\n" +
                    "    4 – Consultar quantidade de lâmpadas de uma determinada potência (digitada pelo usuário)\n" +
                    "    5 – Exibir os dados das lâmpadas com preço menor do que o preço médio das lâmpadas cadastradas\n" +
                    "    6 – Exibir a quantidade de lâmpadas acesas e apagadas\n" +
                    "    0 - Sair");

            int opcao = entrada.nextInt();
            switch (opcao) {
                case 1 : //Cadastrar lâmpada
                    System.out.println("Qual o tipo da lâmpada?");
                    lampada.setTipo(entrada.next());
                    System.out.println("Qual a voltagem?");
                    lampada.setVoltagem(entradaInt.nextInt());
                    System.out.println("Qual a cor?");
                    lampada.setCor(entrada.next());
                    System.out.println("Qual a marca?");
                    lampada.setMarca(entrada.next());
                    System.out.println("Qual o preço?");
                    lampada.setPreco(entradaInt.nextDouble());
                    System.out.println("Qual a potência?");
                    lampada.setPotencia(entradaInt.nextInt());
                    arrayLampadas.add(new Lampada2(lampada.getTipo(), lampada.getVoltagem(), lampada.getCor(), lampada.getMarca(), lampada.getPreco(), lampada.getPotencia(), lampada.isStatus()));
                    break;
                case 2 ://Exibir todas as lâmpadas
                    for (Lampada2 la : arrayLampadas) {
                        System.out.println(la.toString());
                    }
                    break;
                case 3 ://Exibir quantidade de lâmpadas cadastradas
                    System.out.println("Quantidade de lâmpadas cadastradas: " + arrayLampadas.size());
                    break;
                case 4 ://Consultar quantidade de lâmpadas de uma determinada potência (digitada pelo usuário)
                    int contadorPotencia = 0;
                    System.out.println("Qual potência deseja pesquisar a quantidade?");
                    int potenciaPesquisada = entradaInt.nextInt();
                    for (int i = 0; i < arrayLampadas.size(); i++) {
                        if (arrayLampadas.get(i).getPotencia() == potenciaPesquisada){
                            contadorPotencia++;
                        }
                    }
                    System.out.printf("Quantidade de lâmpadas com a potência %d: %d%n", potenciaPesquisada, contadorPotencia);
                    break;
                case 5 ://Exibir os dados das lâmpadas com preço menor do que o preço médio das lâmpadas cadastradas
                    double mediaPrecoLampadas = 0;
                    double menorPreco = mediaPrecoLampadas;
                    for(Lampada2 lp : arrayLampadas) {
                        mediaPrecoLampadas += lp.getPreco();
                    }
                    for(Lampada2 lpd : arrayLampadas) {
                        if(lpd.getPreco() < mediaPrecoLampadas) {
                            menorPreco = lpd.getPreco();
                        }
                    }
                    System.out.printf("Preço abaixo da média R$%.2f%n", menorPreco);
                    break;
                case 6 ://Exibir a quantidade de lâmpadas acesas e apagadas
                    int contadorAcesas = 0;
                    int contadorApagadas = 0;
                    for(Lampada2 lamp : arrayLampadas) {
                        if (lamp.isStatus() == true){
                            contadorAcesas++;
                        } else {
                            contadorApagadas++;
                        }
                    }
                    System.out.printf("Lâmpadas acesas: %d%n", contadorAcesas);
                    System.out.printf("Lâmpadas apagadas: %d%n", contadorApagadas);
                    break;
                case 0 : //Sair
                    System.out.println("Saindo!!!");
                    break;
                default:
                    System.out.println("Opção inválida!!!");
                    break;
            }
            continuar = opcao;
        }
        


    }
}
class Lampada2 {
    private String tipo;
    private int voltagem;
    private String cor;
    private String marca;
    private double preco;
    private int potencia;
    private boolean status;

    public Lampada2() {

    }

    public Lampada2(String tipo, int voltagem, String cor, String marca, double preco, int potencia, boolean status) {
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.potencia = potencia;
        this.status = status;
    }
    public String toString() {
        return "Lampada{" +
                "tipo='" + tipo + '\'' +
                ", voltagem=" + voltagem +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", preço=" + preco +
                ", potencia=" + potencia +
                ", status=" + status +
                '}';
    }

    private String toString(String tipo) {
        return tipo;
    }

    public void acender() {
        if(isStatus() == false) {
            System.out.printf("Lâmpada %s acesa!\n", toString(getTipo()));
        } else {
            throw new RuntimeException("Não é possível ligar uma luz que já está ligada!\n");
        }
    }

    public void apagar() {
        if(isStatus() == true) {
            System.out.printf("Lâmpada %s apagada!\n", toString(getTipo()));
        } else {
            throw new RuntimeException("Não é possível apagar uma luz que já está apagada!\n");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isStatus() {
        return status;
    }

}