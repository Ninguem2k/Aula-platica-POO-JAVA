package ultraemojicombat;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rouds;
    private boolean aprovada;

    public void marcarLuta(Lutador play_1, Lutador play_2) {
        if (play_1.getCategoria().equals(play_2.getCategoria()) && play_1 != play_2) {
            this.aprovada = true;
            this.desafiante = play_1;
            this.desafiado = play_2;
        } else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("## Desafiante ##");
            this.desafiante.apresentar();
            System.out.println("## Desafiado ##");
            this.desafiado.apresentar();
            System.out.println(this.desafiante.getNome() + " VS " + this.desafiado.getNome());

            Random aleRandom = new Random();
            int vencedor = aleRandom.nextInt(3);

            switch (vencedor) {
                case 2:
                    System.out.println(" Vencedor: " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 1:
                    System.out.println(" Vencedor: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 0:
                    System.out.println(" Luta não houve vencedor! ");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;

            }
        } else {
            System.out.println("Luatdores imcopativeis");
        }

    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRouds() {
        return this.rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean isAprovada() {
        return this.aprovada;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
