public class Caneta {
    private String cor;
    private String tipoTinta;
    private String marca;
    private String ponta;

    public Caneta(String cor, String tipoTinta, String marca, String ponta) {
        this.cor = cor;
        this.tipoTinta = tipoTinta;
        this.marca = marca;
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoTinta() {
        return tipoTinta;
    }

    public void setTipoTinta(String tipoTinta) {
        this.tipoTinta = tipoTinta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPonta() {
        return ponta;
    }

    public void setPonta(String ponta) {
        this.ponta = ponta;
    }

    public void escrever() {
        System.out.println("Escrevendo...");
    }

    public void desenhar() {
        System.out.println("Desenhando...");
    }

    public void recarregar() {
        System.out.println("Recarregando a caneta...");
    }
}