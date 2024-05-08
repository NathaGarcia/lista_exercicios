package src;

public class Exercicio65 {

    public static void main(String[] args) {

        Caneta canetaAzul = new Caneta();
        Caneta canetaVermelha = new Caneta("Bic", "Azul", 15);

        canetaAzul.setMarca("Bic");
        canetaAzul.setCor("Azul");
        canetaAzul.setTamanho(16);

        canetaVermelha.getMarca();
        canetaVermelha.getCor();
        canetaVermelha.getTamanho();

        System.out.println(canetaAzul);
        System.out.println("- - - - - - - -");
        System.out.println(canetaVermelha);
    }
}

class Caneta {
    private String marca;
    private String cor;
    private int tamanho;

    public Caneta() {
    }

    public Caneta(String marca, String cor, int tamanho) {
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String toString() {
        return "Marca: " + this.marca + "\nCor: " + this.cor + "\nTamanho: " + this.tamanho;
    }
}
