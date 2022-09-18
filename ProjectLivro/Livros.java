package ProjectLivro;

public class Livros implements Publicacao {
    private String titulo;
    private String altor;
    private int totalPaginas;
    private int paginaAltual;
    private boolean aberto;
    private Pessoa leitor;

    public Livros(String titulo, String altor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.altor = altor;
        this.paginaAltual = 0;
        this.aberto = false;
        this.totalPaginas = totalPaginas;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "{" +
                " titulo='" + getTitulo() + "'" +
                ", altor='" + getAltor() + "'" +
                ", totalPaginas='" + getTotalPaginas() + "'" +
                ", paginaAltual='" + getPaginaAltual() + "'" +
                ", aberto='" + isAberto() + "'" +
                ", leitor='" + leitor.getNome( )+ "'" +
                "}";
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAltor() {
        return this.altor;
    }

    public void setAltor(String altor) {
        this.altor = altor;
    }

    public int getTotalPaginas() {
        return this.totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAltual() {
        return this.paginaAltual;
    }

    public void setPaginaAltual(int paginaAltual) {
        this.paginaAltual = paginaAltual;
    }

    public boolean isAberto() {
        return this.aberto;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pagina) {
        this.paginaAltual = pagina;
    }

    @Override
    public void avançarPag() {
        this.paginaAltual = this.paginaAltual + 1;
    }

    @Override
    public void voltarPag() {
        this.paginaAltual = this.paginaAltual - 1;
    }

}
