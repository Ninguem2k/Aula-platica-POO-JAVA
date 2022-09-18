package aula12;

public class Mamifero extends Animal {
    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("andadno ou nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Bebendo leite");

    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");

    }

    public String getCorPelo() {
        return this.corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

}
