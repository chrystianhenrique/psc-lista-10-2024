public class GuardaChuva {
    private int tamanho;
    private String cor;
    private String material;
    private String tipoAbertura;

    public GuardaChuva(int tamanho, String cor, String material, String tipoAbertura) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
        this.tipoAbertura = tipoAbertura;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoAbertura() {
        return tipoAbertura;
    }

    public void setTipoAbertura(String tipoAbertura) {
        this.tipoAbertura = tipoAbertura;
    }

    public void abrir() {
        System.out.println("Abrindo o guarda-chuva...");
    }

    public void fechar() {
        System.out.println("Fechando o guarda-chuva...");
    }

    public void segurar() {
        System.out.println("Segurando o guarda-chuva...");
    }

    public void guardar() {
        System.out.println("Guardando o guarda-chuva...");
    }
}