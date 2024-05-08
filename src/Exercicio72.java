package src;


public class Exercicio72 {

    public static void main(String[] args) {

        Professor72 prof = new Professor72();
        prof.setNome("Professor");
        prof.setSobrenome("Pardal");
        prof.setDisciplina("Ciências");

        Aluno72 aluno = new Aluno72();
        aluno.setNome("Maria");
        aluno.setSobrenome("da Silva");
        aluno.setMatricula(123);

        System.out.println(prof);
        System.out.println(aluno);
    }
}
class Pessoa72 {
    private String nome;
    private String sobrenome;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getSobrenome() { return sobrenome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }
}

//classe aluno
class Aluno72 extends Pessoa72 {
    private int matricula;

    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }

    public Aluno72() {
    }

    public String toString() {
        return "Aluno [" + getNome() + " " + getSobrenome() + " - " + matricula + "]";
    }
}

//classe professor
class Professor72 extends Pessoa72 {
    private String disciplina;

    public String getDisciplina() { return disciplina; }
    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }

    public Professor72(){
    }

    public String toString() {
        return "Professor [" + getNome() + " " + getSobrenome() + " - " + disciplina + "]";
    }
}