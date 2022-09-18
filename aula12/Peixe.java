package aula12;

public class Peixe extends Animal {
    private String corEscama;

    public void soltarBolha() {
        System.out.println("Soltando Bolhas");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Ornivero");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sem Som");
    }

    public String getCorEscama() {
        return this.corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
