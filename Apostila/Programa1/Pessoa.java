package Programa1;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazAniversario(int idade) {
        this.idade = idade;
        setIdade(10);
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa("George", 5);

        System.out.println(p.getNome());
        System.out.println(p.getIdade());

        p.fazAniversario(5);
        System.out.println();

        System.out.println(p.getNome());
        System.out.println(p.getIdade());
    }
}