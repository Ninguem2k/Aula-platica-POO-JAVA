package Escola;

public class Professor extends Pessoa {
    private String expecilidade;
    private float salario;

    public Professor(String expecilidade, float salario) {
        this.expecilidade = expecilidade;
        this.salario = salario;
    }

    public void receberAlmento(float almento) {
        setSalario(getSalario() + almento);
    }

    public String getExpecilidade() {
        return this.expecilidade;
    }

    public void setExpecilidade(String expecilidade) {
        this.expecilidade = expecilidade;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
