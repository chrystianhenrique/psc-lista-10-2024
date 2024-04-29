public class GarrafaDeAgua {
    private int capacidade;
    private String material;
    private String formato;
    private String marca;

    public GarrafaAgua(int capacidade, String material, String formato, String marca) {
        this.capacidade = capacidade;
        this.material = material;
        this.formato = formato;
        this.marca = marca;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void beber() {
        System.out.println("Bebendo água da garrafa...");
    }

    public void encher() {
        System.out.println("Enchendo a garrafa com água...");
    }

    public void esvaziar() {
        System.out.println("Esvaziando a garrafa...");
    }

    public void carregar() {
        System.out.println("Carregando a garrafa com água...");
    }
}