public class Celular {
    private String marca;
    private String modelo;
    private String numeroIMEI;
    private int capacidadeArmazenamento;

    public Celular(String marca, String modelo, String numeroIMEI, int capacidadeArmazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroIMEI = numeroIMEI;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroIMEI() {
        return numeroIMEI;
    }

    public void setNumeroIMEI(String numeroIMEI) {
        this.numeroIMEI = numeroIMEI;
    }

    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para o número: " + numero);
    }

    public void enviarMensagem(String mensagem, String numero) {
        System.out.println("Enviando mensagem para o número " + numero + ": " + mensagem);
    }

    public void tirarFoto() {
        System.out.println("Tirando uma foto...");
    }

    public void navegarInternet() {
        System.out.println("Navegando na internet...");
    }
}