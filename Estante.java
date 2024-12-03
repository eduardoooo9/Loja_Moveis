public class Estante extends Movel {
    private String cor;
    private float largura;
    private Prateleira prateleira; // agregação: a prateleira pode existir independente da estante.

    public Estante(int id, String nome, float preco, String cor, float largura) {
        super(id, nome, preco);
        this.cor = cor;
        this.largura = largura;
    }

    public Prateleira getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(Prateleira prateleira) {
        this.prateleira = prateleira;
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
}
