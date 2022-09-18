package aula12;

public class Ave extends Animal {
    private String corPena;

    public void fazerNinho() {
        System.out.println("Fazendo Ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Sementes e flutos");
    }

    @Override
    public void emitirSom() {
        System.out.println("assoviando");
    }

    public String getCorPena() {
        return this.corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
