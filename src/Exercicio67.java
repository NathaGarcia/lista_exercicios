package src;
import java.util.Objects;
import java.util.Scanner;

public class Exercicio67 {

    public static void main(String[] args) {

        Scanner inputString = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do segurado: ");
        String nome = inputString.nextLine();

        System.out.print("Digite a idade do segurado: ");
        int idade = input.nextInt();

        System.out.print("Digite o valor do prêmio da apólice: ");
        double vpa = input.nextDouble();

        Apolice apolice = new Apolice(nome, idade, vpa);

        apolice.calcularPremioApolice(idade, vpa);

        apolice.oferecerDesconto(1);//Escolha uma opção: 1-Curitiba|2-Rio de Janeiro|3-São Paulo|4Belo-Horizonte

        apolice.imprimir();

    }
}

class Apolice {

    private String nomeSegurado;
    private int idadeSegurado;
    private double valorPremioApolice;

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdadeSegurado() {
        return idadeSegurado;
    }

    public void setIdadeSegurado(int idadeSegurado) {
        this.idadeSegurado = idadeSegurado;
    }

    public double getValorPremioApolice() {
        return valorPremioApolice;
    }

    public void setValorPremioApolice(double valorPremioApolice) {
        this.valorPremioApolice = valorPremioApolice;
    }

    public Apolice(String nomeSegurado, int idadeSegurado ) {
        Objects.requireNonNull(nomeSegurado, "Nome segurado é obrigatório!!");
        Objects.requireNonNull(idadeSegurado, "Idade segurado é obrigatório!!");
        this.nomeSegurado = nomeSegurado;
        this.idadeSegurado = idadeSegurado;
    }

    public Apolice(String nomeSegurado, int idadeSegurado, double valorPremioApolice) {
        Objects.requireNonNull(nomeSegurado, "Nome segurado é obrigatório!!");
        Objects.requireNonNull(idadeSegurado, "Idade segurado é obrigatório!!");
        this.nomeSegurado = nomeSegurado;
        this.idadeSegurado = idadeSegurado;
        this.valorPremioApolice = valorPremioApolice;
    }

    public void imprimir(){
        System.out.printf("Nome segurado: %s%n", nomeSegurado);
        System.out.printf("Idade segurado: %d anos%n", idadeSegurado);
        System.out.printf("Valor prêmio apólice à receber: R$%.2f%n", valorPremioApolice);

    }

    public void calcularPremioApolice(int idade, double valorPremio) {
        if ((idade >= 18) && (idade <= 25)) {
            valorPremio += (valorPremio * 20) / 100;
        } else if ((idade > 25) && (idade <= 36)) {
            valorPremio += (valorPremio * 15) / 100;
        } else if (idade > 36) {
            valorPremio += (valorPremio * 10) / 100;
        }
    }

    public void oferecerDesconto(int cidade) {
        switch (cidade) {
            case 1:
                valorPremioApolice -= (valorPremioApolice * 0.20); //Curitiba 20%
                System.out.println("Curitiba tem 20% de desconto");
                break;
            case 2:
                valorPremioApolice -= (valorPremioApolice * 0.15); //Rio de Janeiro 15%
                System.out.println("Rio de Janeiro tem 15% de desconto");
                break;
            case 3:
                valorPremioApolice -= (valorPremioApolice * 0.10); //São Paulo 10%
                System.out.println("São Paulo tem 10% de desconto");
                break;
            case 4:
                valorPremioApolice -= (valorPremioApolice * 0.05); //Belo Horizonte 5%
                System.out.println("Belo Horizonte tem 5% de desconto");
                break;
            default:
                throw new RuntimeException("Sua cidade não possui descontos!!");
        }
    }
}