package Escola;

public class Aluno extends Pessoa {
    private boolean matricula;
    private String curso;

    public Aluno(boolean matricula, String curso) {
        this.matricula = matricula;
        this.curso = curso;
    }

    public void cacelarMatricula() {
        setMatricula(false);
    }

    public boolean isMatricula() {
        return this.matricula;
    }

    public boolean getMatricula() {
        return this.matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
