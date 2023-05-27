package Exercicios_1.Questao_4e5;

import java.util.ArrayList;
import java.util.List;

public class Pais {

    private String codigoISO;
    private String nome;
    private double populacao;
    private double dimensao;
    private List<Pais> vizinhos;

    public Pais(String codigoISO, String nome, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensao = dimensao;
        this.populacao = 0;
        this.vizinhos = new ArrayList<>();
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Se os objetos são idênticos, eles são iguais
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Se o objeto é nulo ou não é da mesma classe, eles são diferentes
        }
        Pais outroPais = (Pais) obj;
        return codigoISO.equals(outroPais.codigoISO); // Verifica a igualdade semântica pelo código ISO
    }

    public boolean ehVizinho(Pais outroPais) {
        return vizinhos.contains(outroPais); // Verifica se outro país está na lista de vizinhos
    }

    public double calcularDensidadePopulacional() {
        if (dimensao == 0) {
            return 0; // Evita divisão por zero
        }
        return populacao / dimensao; // Calcula a densidade populacional
    }

    public List<Pais> getVizinhos() {
        return vizinhos; // Retorna a lista de vizinhos
    }

    public void adicionarVizinho(Pais pais) {
        vizinhos.add(pais); // Adiciona um país à lista de vizinhos
    }

    public void removerVizinho(Pais pais) {
        vizinhos.remove(pais); // Remove um país da lista de vizinhos
    }

    public String toString() {
        return "Pais {Iso: " + codigoISO + ", Nome: " + nome + ", Dimensao: " + dimensao + "}";
    }
}
