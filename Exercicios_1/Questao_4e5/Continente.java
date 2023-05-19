package Exercicios_1.Questao_4e5;

import java.util.ArrayList;

public class Continente {
    private String nome;
    ArrayList<Pais> paises = new ArrayList();

    public Continente(String nome) {
        this.nome = nome;
    }

    public void addPais(Pais pais) {
        this.paises.add(pais);
    }
    
    public long getDimensao(){
        long somaDimensao = 0;
        for (Pais paisAtual : paises) {
            somaDimensao += paisAtual.getDimensao();
        }
        return somaDimensao;
    }

    public long getPopulacao(){
        long somaPopulacao = 0;
        for (Pais paisAtual : paises) {
            somaPopulacao += paisAtual.getPopulacao();
        }
        return somaPopulacao;
    }

    public double getDensidade(){
        return getPopulacao() / getDimensao();
    }

    public Pais getPaisMaiorPopulacao(){
        Pais maior = paises.get(0);
        for (Pais paisAtual : paises) {
            if(paisAtual.getPopulacao() > maior.getPopulacao())
                maior = paisAtual;
            
        }
        return maior;
    }
}
