public class Pernas {
    private String material;
    private int quantidade;

    public Pernas(String material, int quantidade) {
        this.material = material;
        this.quantidade = quantidade;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
