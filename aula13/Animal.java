package aula13;

public abstract class Animal {
    private float peso;
    private int idade;
    private int mebros;

    public abstract void emitirSom();

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMebros() {
        return this.mebros;
    }

    public void setMebros(int mebros) {
        this.mebros = mebros;
    }

}
