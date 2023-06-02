package PrimeiraParte.Exemplo_Classe;

import java.time.Year;

class Ex_carro {
    private String modelo, placa, fabricante, cor;
    private int ano;

    public Ex_carro(String modelo, String placa, String fabricante, String cor, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.fabricante = fabricante;
        this.cor = cor;
        this.ano = ano;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return "\nPlaca: " + placa + "\nFabricante: " + fabricante + "\nModelo: " + modelo + "\nCor: " + cor + "Ano: "
                + ano;
    }

    public boolean carroDoAno() {
        if (Year.now().getValue() == ano) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pagaIPVA() {
        if (Year.now().getValue() - ano < 20)
            return true;
        else
            return false;
    }
}
