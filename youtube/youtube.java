package youtube;

public class youtube {
    public static void main(String[] args) {
        Video[] video = new Video[3];
        video[0] = new Video("POO - JAVA");
        video[1] = new Video("POO - PHP");
        video[2] = new Video("Algoritimo");

        Usuario[] usuario = new Usuario[2];
        usuario[0] = new Usuario("USER01", "M", 25, "U0001");
        usuario[1] = new Usuario("TEST", "F", 55, "U0002");

        Visulizacao[] visulizacao = new Visulizacao[3];
        visulizacao[0] = new Visulizacao(usuario[0], video[2]);
        visulizacao[0].avaliar();
        System.out.println(visulizacao[0].toString());
        visulizacao[1] = new Visulizacao(usuario[0], video[1]);
        visulizacao[1].avaliar(87.0f);
        visulizacao[2] = new Visulizacao(usuario[1], video[1]);
        System.out.println(visulizacao[1].toString());
        System.out.println(visulizacao[2].toString());

        // System.out.println(video[0].toString());
        // System.out.println(usuario[0].toString());
    }
}
