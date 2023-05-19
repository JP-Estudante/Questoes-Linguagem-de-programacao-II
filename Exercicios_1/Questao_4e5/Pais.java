package Exercicios_1.Questao_4e5;

import java.util.ArrayList;

public class Pais {

    private String ISO, nomePais;
    private int populacao;
    private double dimensao;

    ArrayList<Pais> paisesFronteira = new ArrayList();

    public Pais(String ISO, String nomePais, double dimensao) {
        this.ISO = ISO;
        this.nomePais = nomePais;
        this.dimensao = dimensao;
    }

    public String getISO() {
        return this.ISO;
    }

    public void setISO(String ISO) {
        this.ISO = ISO;
    }

    public String getNomePais() {
        return this.nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public int getPopulacao() {
        return this.populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return this.dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public void AddFronteira(Pais pais){
        this.paisesFronteira.add(pais);
    }
    
    public boolean comparaPais(Pais pais) {
        if (this.ISO.equals(pais.ISO))
            return true;
        else
            return false;

    }

    public boolean fazFronteira(Pais pais){
        return this.paisesFronteira.contains(pais);
    }

    public ArrayList<Pais> getVizinhos(){
        return this.paisesFronteira;
    }

    public double getDensidade(){
        return this.populacao/this.dimensao;
    }
}
