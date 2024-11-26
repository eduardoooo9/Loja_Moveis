package models;

public class Estante extends Movel {
    private String cor;
    private float largura;

    public Estante(int id, String nome, float preco, String cor, float largura) {
        super(id, nome, preco);
        this.cor = cor;
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Cor: " + cor);
        System.out.println("Largura: " + largura + "m");
    }
}
