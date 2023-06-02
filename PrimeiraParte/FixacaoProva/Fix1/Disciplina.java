package PrimeiraParte.FixacaoProva.Fix1;

public class Disciplina {
    private String nome;
    private int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }
}
