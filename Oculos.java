public class Oculos {
    private String materialArmacao;
    private String tipoLente;
    private double grauCorrecao;
    private String marca;

    public Oculos(String materialArmacao, String tipoLente, double grauCorrecao, String marca) {
        this.materialArmacao = materialArmacao;
        this.tipoLente = tipoLente;
        this.grauCorrecao = grauCorrecao;
        this.marca = marca;
    }

    public String getMaterialArmacao() {
        return materialArmacao;
    }

    public void setMaterialArmacao(String materialArmacao) {
        this.materialArmacao = materialArmacao;
    }

    public String getTipoLente() {
        return tipoLente;
    }

    public void setTipoLente(String tipoLente) {
        this.tipoLente = tipoLente;
    }

    public double getGrauCorrecao() {
        return grauCorrecao;
    }

    public void setGrauCorrecao(double grauCorrecao) {
        this.grauCorrecao = grauCorrecao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void usar() {
        System.out.println("Usando os óculos...");
    }

    public void limpar() {
        System.out.println("Limpando os óculos...");
    }

    public void ajustar() {
        System.out.println("Ajustando os óculos...");
    }

    public void guardar() {
        System.out.println("Guardando os óculos...");
    }
}