package ProjectLivro;

public class ProjectLivro {
    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[2];
        Livros[] livro = new Livros[3];

        pessoa[0] = new Pessoa("Cássio", 21, "M");
        pessoa[1] = new Pessoa("Thiago", 24, "F");

        livro[0] = new Livros("POO - JAVA", "Cássio", 10, pessoa[0]);
        livro[1] = new Livros("PHP - LARAVEL", "SANDRO", 1000, pessoa[1]);
        livro[2] = new Livros("React - CSS&JS", "Breno", 10, pessoa[1]);

        livro[0].abrir();
        livro[2].abrir();
        livro[2].folhear(40);
        livro[2].avançarPag();

        System.out.println(livro[0].detalhes());
        System.out.println(livro[1].detalhes());
        System.out.println(livro[2].detalhes());
    }
}
