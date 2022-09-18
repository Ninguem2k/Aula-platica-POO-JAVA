package Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(true, "informatica");
        Professor professor = new Professor("Biologia", 500f);
        Funcionario funcionario = new Funcionario("Limpeza", true);

        aluno.setNome("Cássio");
        professor.setNome("Eude");
        funcionario.setNome("Marina");

        aluno.setIdade(1);
        professor.setIdade(10);
        funcionario.setIdade(110);

        aluno.setSexo("M");
        professor.setSexo("M");
        funcionario.setSexo("F");

        System.out.println(aluno.toString() + " Matricula " + aluno.getMatricula() + " Curso " + aluno.getCurso());
        professor.fazerAniversario();
        professor.receberAlmento(400f);
        System.out.println(professor.toString() + " Expecilidade " + professor.getExpecilidade() + " Salario "
                + professor.getSalario());
        funcionario.mudarTrabalho();
        System.out.println(funcionario.toString() + " Setor " + funcionario.getSetor() + " trabalhando "
                + funcionario.getTrabalhando());
    }

}
