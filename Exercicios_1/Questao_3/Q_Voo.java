package Exercicios_1.Questao_3;

public class Q_Voo {
    private int numeroVoo, data;
    private boolean[] assentos;

    public Q_Voo(int numeroVoo, int data) {
        this.numeroVoo = numeroVoo;
        this.data = data;
        this.assentos = new boolean[100];
    }

    public int proximoLivre() {
        for (int i = 0; i < assentos.length; i++) {
            if (!assentos[i]) {
                return i + 1; // Retorna o número da próxima cadeira livre (adiciona 1, pois os índices
                              // começam em 0)
            }
        }
        return -1; // Retorna -1 se todas as cadeiras estiverem ocupadas
    }

    public boolean verificaCadeiraLivre(int numeroCadeira) {
        if (numeroCadeira < 1 || numeroCadeira > assentos.length) {
            return false;
        }
        int indiceCadeira = numeroCadeira - 1;
        return !assentos[indiceCadeira];
    }

    public boolean ocupa(int numeroCadeira) {
        if (numeroCadeira == 0) {
            return true;
        } else {
            return false;
        }
    }
}
