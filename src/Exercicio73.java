package src;


public class Exercicio73 {
    public static void main(String[] args) {

        Cliente73 cliente = new Cliente73("Seu Madruga", "Vila do Chaves, 72", "8888-8888");
        PessoaFisica73 pf = new PessoaFisica73(cliente.getNome(), cliente.getEndereco(), cliente.getTelefone(), "111.111.111-11");
        PessoaJuridica73 pj = new PessoaJuridica73(cliente.getNome(), cliente.getEndereco(), cliente.getTelefone(), "00.000.000/0000-00", "Zenon Barriga Y Pesado Cobrador de Aluguéis");

        System.out.println(pf.imprimirDados());
        System.out.println(pj.imprimirDados());
    }
}

//classe Cliente
class Cliente73 {
    private String nome;
    private String endereco;
    private String telefone;

    public Cliente73(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}

//classe Pessoa Fisica
class PessoaFisica73 extends Cliente73 {
    private String cpf;

    public PessoaFisica73(String nome, String enderece, String telefone, String cpf) {
        super(nome, enderece, telefone);
        this.cpf = cpf;
    }

    public String getCpf() { return cpf; }

    public String imprimirDados() {
        return "- - - - - - - - - - - - - - - \n" +
                "PESSOA FÍSICA \n" +
                "Nome: " + getNome() +"\n"+
                "Enderece: " + getEndereco() +"\n"+
                "Telefone: " + getTelefone() +"\n"+
                "CPF: "+ getCpf();
    }

}

//classe Pessoa Juridica
class PessoaJuridica73 extends Cliente73 {
    private String cnpj;
    private String nomeFantasia;

    public PessoaJuridica73(String nome, String endereco, String telefone, String cnpj, String nomeFantasia) {
        super(nome,endereco,telefone);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() { return cnpj; }
    public String getNomeFantasia() { return nomeFantasia; }
    public void setNomeFantasia(String nomeFantasia) { this.nomeFantasia = nomeFantasia; }

    public String imprimirDados() {
        return "- - - - - - - - - - - - - - - \n" +
                "PESSOA JURIDICA \n" +
                "Nome: " + getNome() +"\n"+
                "Enderece: " + getEndereco() +"\n"+
                "Telefone: " + getTelefone() +"\n"+
                "CNPJ: "+ getCnpj() +"\n"+
                "Nome Fantasia: " + getNomeFantasia();
        }
}