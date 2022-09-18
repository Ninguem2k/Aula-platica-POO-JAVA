package youtube;

public class Visulizacao {
    private Usuario espectador;
    private Video filme;

    public Visulizacao(Usuario espectador, Video filme) {
        setEspectador(espectador);
        setFilme(filme);
        this.espectador.setTempoAssistido(this.espectador.getTempoAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porcetangem) {
        int valotTotal = 0;
        if (porcetangem <= 20) {
            valotTotal = 3;
        } else if (porcetangem <= 50) {
            valotTotal = 5;
        } else if (porcetangem <= 90) {
            valotTotal = 8;
        } else {
            valotTotal = 10;
        }
        this.filme.setAvaliacao(valotTotal);
    }

    public Usuario getEspectador() {
        return this.espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return this.filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "{" +
                " espectador='" + getEspectador() + "'" +
                ", filme='" + getFilme() + "'" +
                "}";
    }

}
