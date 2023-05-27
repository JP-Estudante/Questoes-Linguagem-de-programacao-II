package Exercicios_1.Questao_4e5;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private List<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    public double calcularDimensaoTotal() {
        double dimensaoTotal = 0;
        for (Pais pais : paises) {
            dimensaoTotal += pais.getDimensao();
        }
        return dimensaoTotal;
    }

    public double calcularPopulacaoTotal() {
        double populacaoTotal = 0;
        for (Pais pais : paises) {
            populacaoTotal += pais.getPopulacao();
        }
        return populacaoTotal;
    }

    public double calcularDensidadePopulacional() {
        double populacaoTotal = calcularPopulacaoTotal();
        double dimensaoTotal = calcularDimensaoTotal();
        return populacaoTotal / dimensaoTotal;
    }

    public Pais getPaisMaiorPopulacao() {
        Pais paisMaiorPopulacao = null;
        double maiorPopulacao = Double.MIN_VALUE;
        for (Pais pais : paises) {
            double populacao = pais.getPopulacao();
            if (populacao > maiorPopulacao) {
                maiorPopulacao = populacao;
                paisMaiorPopulacao = pais;
            }
        }
        return paisMaiorPopulacao;
    }

    public Pais getPaisMenorPopulacao() {
        Pais paisMenorPopulacao = null;
        double menorPopulacao = Double.MAX_VALUE;
        for (Pais pais : paises) {
            double populacao = pais.getPopulacao();
            if (populacao < menorPopulacao) {
                menorPopulacao = populacao;
                paisMenorPopulacao = pais;
            }
        }
        return paisMenorPopulacao;
    }

    public Pais getPaisMaiorDimensao() {
        Pais paisMaiorDimensao = null;
        double maiorDimensao = Double.MIN_VALUE;
        for (Pais pais : paises) {
            double dimensao = pais.getDimensao();
            if (dimensao > maiorDimensao) {
                maiorDimensao = dimensao;
                paisMaiorDimensao = pais;
            }
        }
        return paisMaiorDimensao;
    }

    public Pais getPaisMenorDimensao() {
        Pais paisMenorDimensao = null;
        double menorDimensao = Double.MAX_VALUE;
        for (Pais pais : paises) {
            double dimensao = pais.getDimensao();
            if (dimensao < menorDimensao) {
                menorDimensao = dimensao;
                paisMenorDimensao = pais;
            }
        }
        return paisMenorDimensao;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }
}
