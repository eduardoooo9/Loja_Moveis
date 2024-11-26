package models;

public class Mesa extends Movel {
    private String tipo;
    private String dimensao;

    public Mesa(int id, String nome, float preco, String tipo, String dimensao) {
        super(id, nome, preco);
        this.tipo = tipo;
        this.dimensao = dimensao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Tipo: " + tipo);
        System.out.println("Dimensão: " + dimensao);
    }
}
