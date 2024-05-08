package src;


import java.util.Scanner;

public class Exercicio70 {

    public static void main(String[] args) {

        Data data = new Data();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um dia: ");
        data.setDia(entrada.nextInt());
        System.out.println("Digite um mês: ");
        data.setMes(entrada.nextInt());
        System.out.println("Digite um ano: ");
        data.setAno((entrada.nextInt()));

        System.out.println(data);
        System.out.println(data.validarData(data.getDia(), data.getMes(), data.getAno()));

    }
}

class Data {

    private int dia;
    private int mes;
    private int ano;


    public Data() {
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() { return dia; }

    public void setDia(int dia) { this.dia = dia; }

    public int getMes() { return mes; }

    public void setMes(int mes) { this.mes = mes; }

    public int getAno() { return ano; }

    public void setAno(int ano) { this.ano = ano; }

    public String toString() {
        return "Data: [" + dia + "/" + mes + "/" + ano + "]";
    }

    public boolean validarData(int dia, int mes, int ano) {
        validaAnoBissexto(ano);
        validaMes(dia, mes, ano);
        return true;
    }

    public void validaMes(int dia, int mes, int ano) {

        if (((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) && dia <= 31) {
            this.mes = mes;
            this.dia = dia;
        } else if (((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) && (dia <= 30)) {
            this.mes = mes;
            this.dia = dia;
        } else if ((validaAnoBissexto(ano) == "s") && ((mes == 2) && (dia <= 29))) {
            this.mes = mes;
            this.dia = dia;
        } else if ((validaAnoBissexto(ano) == "n") && ((mes == 2) && (dia <= 28))) {
            this.mes = mes;
            this.dia = dia;
        } else {
            throw new RuntimeException("data inválida!");
        }
    }

    public String validaAnoBissexto(int ano) {
        if (ano % 4 != 0 && ano % 400 != 0) {
            System.out.println("Não é ano Bissexto!!!");
            return "n";
        } else {
            System.out.println("É ano Bissexto!!!");
            return "s";
        }
    }
}