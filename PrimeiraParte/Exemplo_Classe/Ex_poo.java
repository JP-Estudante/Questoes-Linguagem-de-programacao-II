package PrimeiraParte.Exemplo_Classe;

public class Ex_poo {
    public static void main(String[] args) {

        //ArrayList<Carro> carros = new ArrayList<>();
        
        Ex_carro novoCarro = new Ex_carro("Gol", "ING9687", "VW", "Azul", 2010);
        /*
         * novoCarro.placa = "ING9687";
         * novoCarro.modelo = "Gol";
         * novoCarro.fabricante = "VW";
         * novoCarro.cor = "Azul";
         * novoCarro.ano = 2010;
         */

        /*
         * novoCarro.setPlaca("ING9687");
         * novoCarro.setModelo("Gol");
         * novoCarro.setFabricante("VW");
         * novoCarro.setCor("Azul");
         * novoCarro.setAno(2010);
         */

        /*
         * Metodo Obsoleto
         * System.out.println("**Carro Info**");
         * System.out.println("Fabricante: " + novoCarro.fabricante);
         * System.out.println("Placa: " + novoCarro.placa);
         * System.out.println("Modelo: " + novoCarro.modelo);
         * System.out.println("Ano: " + novoCarro.ano);
         * System.out.println("Cor: " + novoCarro.cor);
         */

        System.out.println("**Carro Info**");
        System.out.println(novoCarro.toString());
        System.out.println("Carro do Ano: " + novoCarro.carroDoAno());
        System.out.println("Ainda paga IPVA: " + novoCarro.pagaIPVA());
    }
}
