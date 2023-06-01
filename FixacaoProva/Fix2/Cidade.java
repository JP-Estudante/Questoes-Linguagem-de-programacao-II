package FixacaoProva.Fix2;

import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private String nome;
    private int populacao;
    private double areaKM2;
    private List<Cidade> cidadesVizinhas;
    // ArrayList<Cidade> cidadesVizinhas = new ArrayList<>();

    public Cidade(String nome, int populacao, double areaKM2) {
        this.nome = nome;
        this.populacao = populacao;
        this.areaKM2 = areaKM2;
        this.cidadesVizinhas = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setAreaKM2(double areaKM2) {
        this.areaKM2 = areaKM2;
    }

    public double getAreaKM2() {
        return areaKM2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Se os objetos são idênticos, eles são iguais
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cidade outrCidade = (Cidade) obj;

        return nome.equals(outrCidade.nome); // Verifica a igualdade semântica pelo código nome
    }

    public void adicionarCidadeVizinha(Cidade city) {
    //    if (cidadesVizinhas != null)
        cidadesVizinhas.add(city); // Adiciona cidade a lista de vizinhas
    //else
      //  System.out.print("Erro ao apresentar o nome\n");
    }

    public double calcularDensidadePopulacional() {
        return populacao / areaKM2; // retorna a densidade
    }

    public List<Cidade> getCidadesVizinhas() {
        return cidadesVizinhas; // retorna a lista de cidades vizinhas
    }
}
