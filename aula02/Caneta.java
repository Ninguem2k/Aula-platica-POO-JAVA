package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("uma caneta: " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("está tampada: " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Destampe a caneta antes de usar");
        } else {
            System.out.println("isso não é uma mesa");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

}
