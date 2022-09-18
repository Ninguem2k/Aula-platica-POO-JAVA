package Faculdade;

public class Faculdade {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setCurso("IF");
        aluno.setIdade(20);
        aluno.setMatricula(52);
        aluno.setNome("Cássio");
        aluno.setSexo("M");
        aluno.pagarMensalidade();
        aluno.fazerAniversario();
        System.out.println(aluno.toString());
    }
}
