package PrimeiraParte.Exercicios_1.Exercicios_1.Questao_3;

import java.time.LocalDate;

public class Voo {
    private int numeroVoo;
    private LocalDate data;
    private boolean[] ocupacao;

    public Voo(int numeroVoo, LocalDate data) {
        this.numeroVoo = numeroVoo;
        this.data = data;
        this.ocupacao = new boolean[100];
    }

    public int proximoLivre() {
        for (int i = 0; i < ocupacao.length; i++) {
            if (!ocupacao[i]) {
                return i + 1; // Retorna o número da próxima cadeira livre (índice + 1)
            }
        }
        return -1; // Retorna -1 se não houver cadeiras livres
    }

    public boolean verifica(int numeroCadeira) {
        if (numeroCadeira < 1 || numeroCadeira > 100) {
            throw new IllegalArgumentException("Número de cadeira inválido");
        }
        return ocupacao[numeroCadeira - 1]; // Retorna true se a cadeira estiver ocupada, false caso contrário
    }

    public boolean ocupa(int numeroCadeira) {
        if (numeroCadeira < 1 || numeroCadeira > 100) {
            throw new IllegalArgumentException("Número de cadeira inválido");
        }
        if (ocupacao[numeroCadeira - 1]) {
            return false; // Cadeira já está ocupada
        }
        ocupacao[numeroCadeira - 1] = true; // Ocupa a cadeira
        return true; // Operação bem sucedida
    }

    public int vagas() {
        int count = 0;
        for (boolean ocupada : ocupacao) {
            if (!ocupada) {
                count++;
            }
        }
        return count; // Retorna o número de cadeiras vagas
    }

    public int getVoo() {
        return numeroVoo; // Retorna o número do vôo
    }

    public LocalDate getData() {
        return data; // Retorna a data do vôo
    }
}
