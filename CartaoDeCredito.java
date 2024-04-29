public class CartaoDeCredito {
    private String nomeTitular;
    private String numeroCartao;
    private String dataValidade;
    private int codigoSeguranca;

    public CartaoDeCredito(String nomeTitular, String numeroCartao, String dataValidade, int codigoSeguranca) {
        this.nomeTitular = nomeTitular;
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(int codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public void pagar() {
        System.out.println("Pagamento realizado com o cartão de crédito.");
    }

    public void comprar() {
        System.out.println("Compra realizada com o cartão de crédito.");
    }

    public void inserirEmTerminais() {
        System.out.println("Inserindo o cartão em terminais de pagamento.");
    }

    public void bloquearAtivar(boolean bloquear) {
        if (bloquear) {
            System.out.println("Cartão bloqueado.");
        } else {
            System.out.println("Cartão ativado.");
        }
    }
}