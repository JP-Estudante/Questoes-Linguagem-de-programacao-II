package PrimeiraParte.Apostila.Programa2e3;

public class Porta {
    String cor;
    boolean situacao;
    double dimensaoX, dimensaoY, dimensaoZ;

    public Porta(String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }

    public void pinta(String novaCor) {
        cor = novaCor;
    }

    public void abre() {
        situacao = true;
    }

    public void fecha() {
        situacao = false;
    }

    public boolean estaAberta() {
        return situacao;
    }

}
