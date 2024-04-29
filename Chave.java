public class Chave {
    private int tamanho;
    private String forma;
    private String material;
    private String tipoFechadura;

    public Chave(int tamanho, String forma, String material, String tipoFechadura) {
        this.tamanho = tamanho;
        this.forma = forma;
        this.material = material;
        this.tipoFechadura = tipoFechadura;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoFechadura() {
        return tipoFechadura;
    }

    public void setTipoFechadura(String tipoFechadura) {
        this.tipoFechadura = tipoFechadura;
    }

    public void abrir() {
        System.out.println("Abrindo a fechadura com a chave...");
    }

    public void fechar() {
        System.out.println("Fechando a fechadura...");
    }

    public void trancar() {
        System.out.println("Trancando a fechadura...");
    }

    public void destrancar() {
        System.out.println("Destrancando a fechadura...");
    }
}