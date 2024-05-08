package src;

//retorno da data Tue Apr 16 00:00:00 BRT 1996
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio75 {

    public static void main(String[] args) throws ParseException {

        Aluno75 aluno = new Aluno75();
        aluno.setNome("Chaves do 8");
        aluno.setNumeroMatricula(123);
        aluno.setDataNascimento("16/04/1996");
        aluno.setBolsista(false);
        aluno.setAnoMatricula(2023);

        System.out.println(aluno.mostraRegistro());

    }
}
class Aluno75 {
    private String nome;
    private int numeroMatricula;
    private String dataNascimento;
    private boolean bolsista;
    private int anoMatricula;
    private double mensalidade = 400;


    public Aluno75 () throws ParseException {
    }

    public Aluno75 (String nome, int matricula, String data, boolean bolsa, int ano) {
        this.nome = nome;
        this.numeroMatricula = matricula;
        this.dataNascimento = data;
        this.bolsista = bolsa;
        this.anoMatricula = ano;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public int getNumeroMatricula() { return numeroMatricula; }

    public void setNumeroMatricula(int numeroMatricula) { this.numeroMatricula = numeroMatricula; }

    public Date getDataNascimento() throws ParseException {
        DateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNasc = formatacao.parse(dataNascimento);
        return dataNasc; }

    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }

    public boolean isBolsista() { return bolsista; }

    public void setBolsista(boolean bolsista) { this.bolsista = bolsista; }

    public int getAnoMatricula() { return anoMatricula; }

    public void setAnoMatricula(int anoMatricula) { this.anoMatricula = anoMatricula; }

    public double getMensalidade() { return mensalidade; }


    //calculaMensalidade()
    public double calculaMensalidade() {
        if (bolsista == true) {
            mensalidade -= (mensalidade * 0.5);
            return mensalidade;
        } else {
            return mensalidade;
        }
    }


    //mostraRegistro()
    public String mostraRegistro() throws ParseException {
        return  "Nome: " + getNome() +"\n"+
                "Matrícula: " + getNumeroMatricula() +"\n"+
                "Data Nascimento: " + getDataNascimento() +"\n"+
                "Bolsista: " + isBolsista() +"\n"+
                "Ano matrícula: " + getAnoMatricula() +"\n"+
                "Mensalidade: " + calculaMensalidade();

    }
}