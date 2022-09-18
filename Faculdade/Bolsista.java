package Faculdade;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("A bolsa de " + this.getNome() + " foi renovada");
    }

    @Override
    public void pagarMensalidade() {

    }

    public float getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}
