package aula04;

public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("===========================================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public Banco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void abrirConta(String tipo) {
        this.setStatus(true);
        this.setTipo(tipo);
        if (tipo == "cc") {
            this.setSaldo(50);
        } else if (tipo == "cp") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso ");
    }

    public void fecharConta() {
        if (this.getSaldo() != 0) {
            System.out.println("Operação indisponivel");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso ");
        }
    }

    public void depositar(float deposito) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Deposito realizado com sucesso na conta de:" + this.getDono());
        } else {
            System.out.println("Conta de: " + this.getDono() + ", desativada");
        }
    }

    public void sacar(float sacar) {
        if (sacar <= this.getSaldo() && this.getStatus() == true) {
            this.setSaldo(this.getSaldo() - sacar);
            System.out.println("Saque realizado com sucesso na conta de: " + this.getDono());
        } else {
            System.out.println("Saldo indisponivel");
        }
    }

    public void pagarMensal() {
        if (this.getStatus() == true) {
            float valor_apagar = 0;
            if (this.getTipo() == "cc") {
                valor_apagar = 12;
            } else if (this.getTipo() == "cp") {
                valor_apagar = 20;
            }
            if (this.getSaldo() < valor_apagar) {
                System.out.println("Saldo indisponivel");
            } else {
                this.setSaldo(this.getSaldo() - valor_apagar);
                System.out.println("Mensalidade realizada com sucesso");
            }
        } else {
            System.out.println("usuario com conta desativada");
        }

    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}