package Exercicios_1.Questao_4e5;

public class Principal {
    public static void main(String[] args) {
        Pais pais1 = new Pais("BRA", "Brasil", 8510000);
        pais1.setPopulacao(2000000);
        Pais pais2 = new Pais("AGR", "Argentina", 2780000);
        pais2.setPopulacao(20000000);
        Pais pais3 = new Pais("URU", "Uruguai", 176215);
        pais3.setPopulacao(20000000);
        Pais pais4 = new Pais("CHI", "Chile", 756950);
        pais4.setPopulacao(20000000);
        
        Continente cont1 = new Continente("América do SUl");

        cont1.addPais(pais1);
        cont1.addPais(pais2);
        cont1.addPais(pais3);
        cont1.addPais(pais4);

        System.out.println("Dimensão do continente: " + cont1.getDimensao());
        System.out.println("População total do continente: " + cont1.getPopulacao());
        System.out.println("Densidade do continente: " + cont1.getDensidade());

        System.out.println("Pais com maior população: " + cont1.getPaisMaiorPopulacao().getNomePais());


        /*
         * System.out.println(pais1.comparaPais(pais1));
         * 
         * if(pais1.comparaPais(pais2) == false)
         * System.out.println("Paises não são iguais");
         * else
         * System.out.println("Paises iguais");
         * 
         * 
         * pais1.AddFronteira(pais2);
         * pais1.AddFronteira(pais3);
         * 
         * System.out.println("Faz Fronteira: " + pais1.fazFronteira(pais4));
         * 
         * System.out.println("Qtd de paises vizinhos: " + pais1.getVizinhos());
         * 
         * System.out.println(pais1.getDensidade());
         */

    }
}