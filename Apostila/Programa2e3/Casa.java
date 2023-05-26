package Programa2e3;

import java.util.ArrayList;

public class Casa {

    ArrayList<Porta> portas = new ArrayList<>();

    public ArrayList<Porta> getPortas() {
        return this.portas;
    }

    public void setPortas(ArrayList<Porta> portas) {
        this.portas = portas;
    }

    public void pinta(string novaCor) {
        cor = novaCor;
    }

    public void adicionaPorta(Porta porta) {
        portas.add(porta);
    }

    public int quantasPortasEstaoAbertas() {
        int contador = 0;
        for (Porta porta : portas) {
            if (porta.estaAberta()) {
                contador++;
            }
        }
        return contador;
    }
}
