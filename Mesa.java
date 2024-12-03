import java.util.ArrayList;
import java.util.List;

public class Mesa extends Movel {
    private String tipo;
    private String dimensao;
    private List<Pernas> pernas; // Composição: As pernas fazem parte da mesa que dependem de sua existência.

    public Mesa(int id, String nome, float preco, String tipo, String dimensao) {
        super(id, nome, preco);
        this.tipo = tipo;
        this.dimensao = dimensao;
        this.pernas = new ArrayList<>();
    }

    public void adicionarPerna(Pernas perna) {
        this.pernas.add(perna);
    }

    public List<Pernas> getPernas() {
        return pernas;
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
}
