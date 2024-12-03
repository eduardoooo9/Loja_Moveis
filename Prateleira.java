public class Prateleira {
    private String material;
    private float espessura;

    public Prateleira(String material, float espessura) {
        this.material = material;
        this.espessura = espessura;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getEspessura() {
        return espessura;
    }

    public void setEspessura(float espessura) {
        this.espessura = espessura;
    }
}
