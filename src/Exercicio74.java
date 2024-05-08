package src;


public class Exercicio74 {
    public static void main(String[] args) {
        ContaBancariaSimples contaEspecial = new ContaBancariaSimples();
        ContaBancariaSimples contaSimples = new ContaBancariaSimples();

        contaSimples.abreContaSimples("Bruxa Baratuxa");
        System.out.println(contaSimples.mostraDados());
        contaSimples.depositaValor(200);
        System.out.println(contaSimples.mostraDados());
        contaSimples.retiraValor(199);
        System.out.println(contaSimples.mostraDados());

        contaEspecial.abreConta("Chapolin Colorado", 1000, true);
        System.out.println(contaEspecial.mostraDados());
        contaEspecial.depositaValor(9000);
        System.out.println(contaEspecial.mostraDados());
        contaEspecial.retiraValor(2);
        System.out.println(contaEspecial.mostraDados());
    }
}

class ContaBancariaSimples {
    private String nomeCorrentista;
    private double saldo;
    private boolean contaEspecial;


    public ContaBancariaSimples() {}

    public ContaBancariaSimples(String nomeCorrentista, double saldo, boolean contaEspecial) {
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
        this.contaEspecial = contaEspecial;
    }

    public String getNomeCorrentista() { return nomeCorrentista; }

    public double getSaldo() { return saldo; }

    public boolean isContaEspecial() { return contaEspecial; }

    public void abreConta(String nome, double deposito, boolean contaEspecial) {
        this.nomeCorrentista = nome;
        this.saldo = deposito;
        this.contaEspecial = contaEspecial;

        System.out.println("Realizada a abertura de conta!");
    }

    public void abreContaSimples(String nome) {
        this.nomeCorrentista = nome;
        System.out.println("Realizada a abertura de conta simples!");
    }

    public double depositaValor(double valor) {
        System.out.printf("%s fez um depósito de R$%.2f reais\n", nomeCorrentista, valor);
        return saldo += valor;
    }

    public double retiraValor(double valor) {
        if (valor < saldo) {
            System.out.printf("%s fez um saque de R$%.2f reais\n", nomeCorrentista, valor);
            return saldo -= valor;
        } else {
            throw new RuntimeException("Você não tem saldo para este saque!");
        }
    }

    public String mostraDados() {
        return  "Correntista: " + getNomeCorrentista() +"\n"+
                "Saldo R$ " + getSaldo() +"\n"+
                "Conta Especial: " + isContaEspecial() +"\n"+
                "- - - - - - - - - - - - - - - - - -";

    }

}