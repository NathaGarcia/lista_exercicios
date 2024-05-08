package src;


public class Exercicio76 {

    public static void main(String[] args) {
        Estudante76 estudante = new Estudante76("Kiko", 7.5);
        estudante.estatuto.setAlunoEspecial(false);
        estudante.estatuto.setTempoParcial(true);
        estudante.estatuto.setTempoIntegral(false);

        estudante.estatuto.isTempoParcial();
        estudante.estatuto.isTempoIntegral();
        estudante.estatuto.isAlunoEspecial();
        System.out.println(estudante.imprimirDados());

        Empregado76 empregado = new Empregado76("José", 1000, Funcao.ESCRITORIO);
        System.out.println(empregado.imprimir());
        empregado.calculaBonus(empregado.getSalario());
        System.out.println(empregado.imprimir());


    }
}

class Pessoa76 {
    String nome;

    public Pessoa76(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

}

class Estudante76 extends Pessoa76 {
    double media;
    Estatuto estatuto = new Estatuto();

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public Estudante76(String nome, double media) {
        super(nome);
        this.media = media;
    }
    public String imprimirDados() {
        return "- - - - - - ESTUDANTE - - - - - -\n" +
                "Nome: " + getNome() +"\n"+
                "Média: "+ getMedia() +"\n"+
                "Aluno Especial: " + estatuto.isAlunoEspecial() +"\n"+
                "Tempo Parcial: " + estatuto.isTempoParcial() +"\n"+
                "Tempo Integral: " + estatuto.isTempoIntegral();
    }
}
class Estatuto {
    boolean alunoEspecial;
    boolean tempoParcial;
    boolean tempoIntegral;

    public boolean isAlunoEspecial() { return alunoEspecial; }
    public void setAlunoEspecial(boolean alunoEspecial) { this.alunoEspecial = alunoEspecial; }
    public boolean isTempoParcial() { return tempoParcial; }
    public void setTempoParcial(boolean tempoParcial) { this.tempoParcial = tempoParcial; }
    public boolean isTempoIntegral() { return tempoIntegral; }
    public void setTempoIntegral(boolean tempoIntegral) { this.tempoIntegral = tempoIntegral; }
}

class Empregado76 extends Pessoa76 {
    //Os empregados são divididos em duas categorias: o corpo docente (demonstrador, monitor, professor) e o
    // discente (escritório e manutenção).
    // Para todos os empregados, nós devemos prever um campo salário e uma função que permita fixar os salários.
    double salario;
    Funcao funcao;

    public Empregado76(String nome, double salario, Funcao funcao) {
        super(nome);
        this.salario = salario;
        this.funcao = funcao;
    }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public Funcao getFuncao() { return funcao; }
    public void setFuncao(Funcao funcao) { this.funcao = funcao; }

    public String imprimir() {
        return "- - - - - - EMPREGADO - - - - - -\n" +
                "Nome: " + getNome() +"\n"+
                "Salário: " + getSalario() +"\n"+
                "Função: " + getFuncao() +"\n"+
                "Salário ajustado de acordo com função: " + calculaBonus(salario);

    }

    public double calculaBonus(double salario) {
        if ((getFuncao().equals(Funcao.ESCRITORIO)) || (getFuncao().equals(Funcao.MANUTENCAO))) {
            salario += salario * 0.05;
        } else if ((getFuncao().equals(Funcao.DEMONSTRADOR) || (getFuncao().equals(Funcao.MONITOR)) || (getFuncao().equals(Funcao.PROFESSOR)))){
            salario += salario * 0.10;
        }
        return salario;
    }

}

enum Funcao{
    ESCRITORIO("escritório"),
    MANUTENCAO("manutenção"),
    DEMONSTRADOR("demonstrador"),
    MONITOR("monitor"),
    PROFESSOR("professor");

    private String funcao;
    Funcao(String funcao) {
        this.funcao = funcao;
    }
    public String getFuncao() { return funcao; }

}