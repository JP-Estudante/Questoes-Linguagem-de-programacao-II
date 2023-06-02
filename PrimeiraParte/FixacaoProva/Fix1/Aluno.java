package PrimeiraParte.FixacaoProva.Fix1;

public class Aluno {
    private String nome, curso;
    private int idade;

    public Aluno(String nome, String curso, int idade){
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getCurso(){
        return curso;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    
}
