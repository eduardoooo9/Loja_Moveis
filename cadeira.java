package models;

public class Cadeira extends Movel {
    private String material;
    private String tipoAssento;

    public Cadeira(int id, String nome, float preco, String material, String tipoAssento) {
        super(id, nome, preco);
        this.material = material;
        this.tipoAssento = tipoAssento;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoAssento() {
        return tipoAssento;
    }

    public void setTipoAssento(String tipoAssento) {
        this.tipoAssento = tipoAssento;
    }

    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Material: " + material);
        System.out.println("Tipo de Assento: " + tipoAssento);
    }
}
