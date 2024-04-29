public class Relogio {
    private String marca;
    private String modelo;
    private String tipoExibicao;
    private boolean resistenciaAgua;

    public Relogio(String marca, String modelo, String tipoExibicao, boolean resistenciaAgua) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoExibicao = tipoExibicao;
        this.resistenciaAgua = resistenciaAgua;
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

    public String getTipoExibicao() {
        return tipoExibicao;
    }

    public void setTipoExibicao(String tipoExibicao) {
        this.tipoExibicao = tipoExibicao;
    }

    public boolean isResistenciaAgua() {
        return resistenciaAgua;
    }

    public void setResistenciaAgua(boolean resistenciaAgua) {
        this.resistenciaAgua = resistenciaAgua;
    }

    public void mostrarHora() {
        System.out.println("Mostrando a hora...");
    }

    public void configurarAlarme() {
        System.out.println("Configurando o alarme...");
    }

    public void cronometrar() {
        System.out.println("Iniciando o cronômetro...");
    }

    public void ajustarData() {
        System.out.println("Ajustando a data...");
    }
}