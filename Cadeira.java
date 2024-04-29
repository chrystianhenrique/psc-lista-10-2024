public class Cadeira {
    private String materialFabricacao;
    private String cor;
    private double altura;
    private double pesoMaximoSuportado;

    public Cadeira(String materialFabricacao, String cor, double altura, double pesoMaximoSuportado) {
        this.materialFabricacao = materialFabricacao;
        this.cor = cor;
        this.altura = altura;
        this.pesoMaximoSuportado = pesoMaximoSuportado;
    }

    public String getMaterialFabricacao() {
        return materialFabricacao;
    }

    public void setMaterialFabricacao(String materialFabricacao) {
        this.materialFabricacao = materialFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPesoMaximoSuportado() {
        return pesoMaximoSuportado;
    }

    public void setPesoMaximoSuportado(double pesoMaximoSuportado) {
        this.pesoMaximoSuportado = pesoMaximoSuportado;
    }

    public void sentar() {
        System.out.println("Alguém sentou na cadeira.");
    }

    public void mover() {
        System.out.println("A cadeira foi movida para outra posição.");
    }

    public void empilhar() {
        System.out.println("A cadeira foi empilhada com outras cadeiras.");
    }

    public void reclinar() {
        System.out.println("A cadeira foi reclinada para trás.");
    }
}