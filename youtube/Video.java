package youtube;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public void player() {
        setReproduzindo(true);
    }

    @Override
    public void pause() {
        setReproduzindo(false);
    }

    @Override
    public void like() {
        setAvaliacao(getAvaliacao() + 1);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int novaAvaliacao = 0;
        novaAvaliacao = (int) ((this.avaliacao + avaliacao) / this.views);
        this.avaliacao = novaAvaliacao;
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int views) {

        this.views = views;
    }

    public int getCurtidas() {
        return this.curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return this.reproduzindo;
    }

    public boolean getReproduzindo() {
        return this.reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "{" +
                " titulo='" + getTitulo() + "'" +
                ", avaliacao='" + getAvaliacao() + "'" +
                ", views='" + getViews() + "'" +
                ", curtidas='" + getCurtidas() + "'" +
                ", reproduzindo='" + isReproduzindo() + "'" +
                "}";
    }

}
