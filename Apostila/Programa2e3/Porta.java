package Programa2e3;

public class Porta {
    String cor;
    boolean situacao;
    double dimensaoX, dimensaoY, dimensaoZ;

    public Porta(Boolean situacao, String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
        this.situacao = true;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }

    public void abre(){
        situacao = true;
    }

    public void fecha(){
        situacao = false;
    }

    public void pinta(String novaCor){
        cor = novaCor;
    }

    public boolean estaAberta(){
        return situacao;
    }

}
