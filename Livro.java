public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void ler() {
        System.out.println("Lendo o livro...");
    }

    public void folhear(int pagina) {
        System.out.println("Folheando para a página " + pagina + "...");
    }

    public void marcarPagina(int pagina) {
        System.out.println("Marcando a página " + pagina + "...");
    }

    public void escreverNotas(String notas) {
        System.out.println("Escrevendo notas: " + notas);
    }
}