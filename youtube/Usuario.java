package youtube;

public class Usuario extends Pessoa {
    private String login;
    private float tempoAssistido;

    public Usuario(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        setTempoAssistido(0);
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public float getTempoAssistido() {
        return this.tempoAssistido;
    }

    public void setTempoAssistido(float tempoAssistido) {
        this.tempoAssistido = tempoAssistido;
    }

    @Override
    public String toString() {
        return "{" +
                " Usuario='" + super.toString() + "'" +
                " login='" + getLogin() + "'" +
                ", tempoAssistido='" + getTempoAssistido() + "'" +
                "}";
    }

}
