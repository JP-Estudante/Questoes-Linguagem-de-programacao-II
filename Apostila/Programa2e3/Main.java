package Programa2e3;

public class Main {
    public static void main(String[] args) {
        Casa minhCasa = new Casa("Bege");

        Porta portaDaSala = new Porta("Rosa", 0.80, 2.20, 0.40);
        Porta portaDaCosinha = new Porta("Vermelha", 0.80, 2.20, 0.40);

        minhCasa.addPorta(portaDaSala);
        minhCasa.addPorta(portaDaCosinha);

        portaDaCosinha.abrir();

        System.out.println(minhCasa.quantasPortasEstaoAbertas());
    }
}