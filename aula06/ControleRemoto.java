package aula06;

public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    // Metodos especiasi

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return this.tocando;
    }

    public boolean getTocando() {
        return this.tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        // TODO Auto-generated method stub
        System.out.println("Esta ligado? " + getLigado());
        System.out.println("Esta tocando? " + getTocando());
        System.out.println("Volume? " + getVolume());
        for (int i = 0; i < getVolume(); i++) {
            System.out.print("#");
        }

    }

    @Override
    public void fecharMenu() {
        // TODO Auto-generated method stub
        System.out.println("Fechando Menu!");
    }

    @Override
    public void maisVolume() {
        // TODO Auto-generated method stub
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        // TODO Auto-generated method stub
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        // TODO Auto-generated method stub
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        // TODO Auto-generated method stub
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        if (!(this.getTocando()) && this.getLigado()) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        if (this.getTocando() && this.getLigado()) {
            this.setTocando(false);
        }
    }
}
