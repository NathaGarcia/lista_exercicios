package src;


public class Exercicio66 {

    public static void main(String[] args) {

        Lampada lampadaLed = new Lampada();
        Lampada lampadaFluorescente = new Lampada("Flourescente",110, "fria", "Osram", 19.90, 10, false);

        lampadaLed.setTipo("Led");
        lampadaLed.setVoltagem(220);
        lampadaLed.setCor("quente");
        lampadaLed.setMarca("Philips");
        lampadaLed.setPreco(6.99);
        lampadaLed.setPotencia(20);

        lampadaLed.acender();
//        lampadaLed.apagar();
        lampadaFluorescente.acender();
//        lampadaFluorescente.apagar();

//        System.out.println(lampadaFluorescente); //imprime os atributos de fluorescente
//        System.out.println(lampadaLed); //imprime os atributos de led

        //verifica maior potencia
        if(lampadaLed.getPotencia() > lampadaFluorescente.getPotencia()) {
            System.out.println("Lâmpada Led possui maior potência!!");
        } else {
            System.out.println("Lâmpada Fluorescente possui maior potência!!");
        }

        //verifica mais cara
        if(lampadaLed.getPreco() > lampadaFluorescente.getPreco()) {
            System.out.println("Lâmpada Led é mais cara!!");
        } else {
            System.out.println("Lâmpada Fluorescente é mais cara!!");
        }
    }
}

class Lampada {

    private String tipo; //led, fluorescente
    private int voltagem;
    private String cor;
    private String marca;
    private double preco;
    private int potencia;
    private boolean status;

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

    public Lampada() {

    }

    public Lampada(String tipo, int voltagem, String cor, String marca, double preco, int potencia, boolean status) {
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

    public void acender() {
        if(isStatus() == false) {
            System.out.printf("Lâmpada %s acesa!\n", toString(getTipo()));
        } else {
            throw new RuntimeException("Não é possível ligar uma luz que já está ligada!\n");
        }
    }

    private String toString(String tipo) {
        return tipo;
    }

    public void apagar() {
        if(isStatus() == true) {
            System.out.printf("Lâmpada %s apagada!\n", toString(getTipo()));
        } else {
            throw new RuntimeException("Não é possível apagar uma luz que já está apagada!\n");
        }
    }
}