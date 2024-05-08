package src;
/*
a) Criar uma classe data com os atributos dia, mes e ano, realizando os testes para saber se é uma data válida.
b) Usando herança, criar as classes Pessoa, Aluno e Funcionário
c) Usando Delegação, criar na classe Pessoa o atributo Data de Nascimento do tipo Data (classe do item a)
d) Na classe Aluno deverá existir um atributo Data da Matricula que deverá ser do tipo Data (classe do item a)
e) Na classe Funcionário deverá existir um atributo Data de Admissão que deverá ser do tipo Data (classe do item a)
f) Criar uma classe Teste com um menu para cadastrar aluno e funcionario.
*/

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Exercicio71 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);

        Aluno71 aluno71 = new Aluno71();
        ArrayList<Aluno71> listaDeAlunos = new ArrayList<>();
        ArrayList<Funcionario71> listaDeFuncionario = new ArrayList<>();
        Funcionario71 funcionario71 = new Funcionario71();

        int continua = 1;
        while (continua != 0) {
            System.out.println("Escolha uma opção:\n" +
                    "1 - Cadastrar Aluno\n" +
                    "2 - Cadastrar Funcionario\n" +
                    "2 - Imprimir Aluno\n" +
                    "2 - Imprimir Funcionario\n" +
                    "0 - Sair\n");
            int opcao = entradaInt.nextInt();
            switch (opcao) {
                case 1 :
                    System.out.println("Informe o nome: ");
                    String nome = entrada.nextLine();
                    System.out.println("Informe o RG: ");
                    String rg = entrada.nextLine();
                    System.out.println("Informe a data de nascimento: ");
                    String dataNascimento = entrada.nextLine();
                    System.out.println("Informe o ra: ");
                    String ra = entrada.nextLine();
                    System.out.println("Informe a data de matrícula: ");
                    String matricula = entrada.nextLine();

                    aluno71 = new Aluno71(nome, rg, dataNascimento, ra, matricula);
                    listaDeAlunos.add(aluno71);

                    break;
                case 2 :
                    System.out.println("Informe o nome: ");
                    nome = entrada.nextLine();
                    System.out.println("Informe o RG: ");
                    rg = entrada.nextLine();
                    System.out.println("Informe a data de nascimento: ");
                    dataNascimento = entrada.nextLine();
                    System.out.println("Informe o salário: ");
                    Double salario = entradaInt.nextDouble();
                    System.out.println("Informe a função: ");
                    String funcao = entrada.nextLine();
                    System.out.println("Informe a data de admissão: ");
                    String admissao = entrada.nextLine();

                    funcionario71 = new Funcionario71(nome, rg, dataNascimento, salario, funcao,admissao);
                    listaDeFuncionario.add(funcionario71);
                    break;
                case 3 :
                    System.out.println("Imprimindo Aluno: ");
                    for (Aluno71 aluno : listaDeAlunos) {
                        System.out.println(aluno.toString());
                    }
                    break;
                case 4 :
                    System.out.println("Imprimindo Funcionário: ");
                    for (Funcionario71 funcionario : listaDeFuncionario) {
                        System.out.println(funcionario.toString());
                    }
                    break;
                case 0 :
                    System.out.println("Até mais!!!");
                    break;

            }
            continua = opcao;
        }
    }
}

class Data71 {

    int dia;
    int mes;
    int ano;

    public Data71() { }

    public Data71(String data) {
        int[] dataInt = converterToArray(data);
        if (validarData(data)) {
            this.dia = dataInt[0];
            this.mes = dataInt[1];
            this.ano = dataInt[2];
        }
    }

    public int getAno() { return ano; }

    public void setAno(int ano) { this.ano = ano; }

    public int getMes() { return mes; }

    public void setMes(int mes) { this.mes = mes; }

    public int getDia() { return dia; }

    public void setDia(int dia) { this.dia = dia; }

    public boolean validarData(String dataString) {
        Calendar dataAtual = Calendar.getInstance();
        int anoAtual = dataAtual.get(Calendar.YEAR);
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        int[] data = converterToArray(dataString);

        int diaDaData = data[0];
        int mesDaData = data[1];
        int anoDaData = data[2];

        if (anoAtual > 0 && anoDaData <= anoAtual) {//ano
            switch (mesDaData) { //mes
                case 1,3,5,7,8,10,12:
//                    System.out.println((data[0] > 0) && (data[0] <= 31));
                    if((diaDaData > 0) && (diaDaData <= 31)) {
                        return true;//dia
                    } else {
                        throw new IllegalArgumentException("DATA INVÁLIDA PARA MESES DE ATÉ 31 DIAS!!!");
                    }

                case 2:
                    if(anoDaData %4 == 0) {//ano
                        if ((diaDaData > 0) && (diaDaData <= 29)) {
                            return true;//dia
                        } else {
                            throw new IllegalArgumentException("DATA INVÁLIDA PARA O MÊS DE FEVEREIRO COM ATÉ 29 DIAS!!!");
                        }

                    } else {
                        if ((diaDaData > 0) && (diaDaData <= 28)) {//dia
                            return true;
                        } else {
                            throw new IllegalArgumentException("DATA INVÁLIDA PARA O MÊS DE FEVEREIRO COM ATÉ 28 DIAS!!!");
                        }
                    }

                case 4,6,9,11:
                    if((diaDaData > 0) && (diaDaData <= 30)) {
                        return true;//dia
                    } else {
                        throw new IllegalArgumentException("DATA INVÁLIDA PARA MESES DE ATÉ 30 DIAS!!!");
                    }

                default:
                    System.out.println("DEFAULT - DATA INVÁLIDA !!!");
                    break;
            }
        }
        return false;
    }

    private int[] converterToArray(String data) {
        String[] dataQuebrada = data.split("/");
        int[] dataInt = new int[3];

        for (int i = 0; i < dataQuebrada.length; i++) {
            dataInt[i] = Integer.parseInt(dataQuebrada[i]);
        }
        return dataInt;
    }

    public String toString() {
        return this.getDia() + "/" + this.getMes() + "/" + this.getAno();
    }

}
class Pessoa71 {

    String nome;
    String rg;
    Data71 dataNascimento;

    public Pessoa71() {
    }

    public Pessoa71(String nome, String rg, String dataNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = new Data71(dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Data71 getDataNascimento() {
        return dataNascimento;
    }

    public void cadastrarPessoa() {
        this.nome = getNome();
        this.rg = getRg();
        this.dataNascimento = getDataNascimento();
    }

}

class Aluno71 extends Pessoa71 {

    String ra;
    Data71 dataMatricula;

    public Aluno71(String nome, String rg, String dataNascimento, String ra, String dataMatricula) {
        super(nome, rg, dataNascimento);
        this.ra = ra;
        this.dataMatricula = new Data71(dataMatricula);
    }

    public Aluno71() {
        super();
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Data71 getDataMatricula() { return dataMatricula; }

    @Override
    public String toString() {
        return "Aluno [" +
                "Nome: " + nome +
                ", RG: " + rg +
                ", Data Nascimento: " + dataNascimento +
                ", RA: " + ra +
                ", Data Matrícula: " + dataMatricula +
                ']';
    }
}

class Funcionario71 extends Pessoa71 {

    Double salario;
    String funcao;
    Data71 dataAdmissao;

    public Funcionario71() { super(); }

    public Funcionario71(String nome, String rg, String dataNascimento, Double salario, String funcao, String dataAdmissao) {
        super(nome, rg, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
        this.dataAdmissao = new Data71(dataAdmissao);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Data71 getDataAdmissao() { return dataAdmissao; }

    @Override
    public String toString() {
        return "Funcionário [" +
                "Nome: " + nome +
                ", RG: " + rg +
                ", Data Nascimento: " + dataNascimento +
                ", Salário: " + salario +
                ", Função: " + funcao +
                ", Data Admissão: " + dataAdmissao +
                ']';
    }
}