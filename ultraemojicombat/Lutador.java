package ultraemojicombat;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
            int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar() {
        System.out.println("Lutador : " + this.getNome());
        System.out.println("Veio de : " + this.getNacionalidade());
        System.out.println("Com : " + this.getIdade() + " anos");
        System.out.println("Medindo : " + this.getAltura() + "m");
        System.out.println("Pesando : " + this.getPeso() + "KG");
        System.out.println("Categoria peso : " + this.getCategoria());
        System.out.println("Com : " + this.getVitorias() + " Vitorias");
        System.out.println("Com : " + this.getDerrotas() + " Derrotas");
        System.out.println("Com : " + this.getEmpates() + " Empates");
    }

    public void status() {
        System.out.println(this.getNome());
        System.out.println("Pesando : " + this.getPeso() + "KG");
        System.out.println("Com : " + this.getVitorias() + " Vitorias");
        System.out.println("Com : " + this.getDerrotas() + " Derrotas");
        System.out.println("Com : " + this.getEmpates() + " Empates");
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);

    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria(peso);
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Float peso) {
        if (peso < 52.2) {
            this.categoria = "Invalido";
        } else if (peso <= 70.2) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Medio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}