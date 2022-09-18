package aula04;

public class alula5 {
    public static void main(String[] args) {
        Banco p1 = new Banco();
        p1.setNumConta(5);
        p1.setDono("Cássio");
        p1.abrirConta("cp");

        Banco p2 = new Banco();
        p2.setNumConta(999);
        p2.setDono("Gabriel");
        p2.abrirConta("cc");

        p2.depositar(999);
        p1.sacar(151);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
