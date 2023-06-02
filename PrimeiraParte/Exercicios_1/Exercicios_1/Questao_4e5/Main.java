package PrimeiraParte.Exercicios_1.Exercicios_1.Questao_4e5;

public class Main {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        // Criação dos países
        Pais brasil = new Pais("BRA", "Brasil", 8515767.049);
        Pais argentina = new Pais("ARG", "Argentina", 2780400.0);
        Pais uruguai = new Pais("URY", "Uruguai", 176215.0);

        // Adicionar vizinhos
        brasil.adicionarVizinho(argentina);
        brasil.adicionarVizinho(uruguai);
        argentina.adicionarVizinho(brasil);
        uruguai.adicionarVizinho(brasil);

        // Verificar igualdade semântica
        Pais pais1 = new Pais("BRA", "Brasil", 8515767.049);
        System.out.println("brasil.equals(pais1): " + brasil.equals(pais1)); // true

        Pais pais2 = new Pais("USA", "Estados Unidos", 9629091.0);
        System.out.println("brasil.equals(pais2): " + brasil.equals(pais2)); // false

        // Verificar se países são vizinhos
        System.out.println("brasil.ehVizinho(argentina): " + brasil.ehVizinho(argentina)); // true
        System.out.println("brasil.ehVizinho(uruguai): " + brasil.ehVizinho(uruguai)); // true
        System.out.println("argentina.ehVizinho(uruguai): " + argentina.ehVizinho(uruguai)); // false

        // Calcular densidade populacional
        brasil.setPopulacao(209288278.0);
        System.out.println("Densidade populacional do Brasil: " + brasil.calcularDensidadePopulacional());

        // Obter lista de vizinhos
        System.out.println("Vizinhos do Brasil:");
        for (Pais vizinho : brasil.getVizinhos()) {
            System.out.println(vizinho.getNome());
        }

        // Criação do continente
        Continente americaDoSul = new Continente("América do Sul");
        americaDoSul.adicionarPais(brasil);
        americaDoSul.adicionarPais(argentina);
        americaDoSul.adicionarPais(uruguai);

        // Calcular dimensão total do continente
        System.out.println("Dimensão total do continente América do Sul: " + americaDoSul.calcularDimensaoTotal());

        // Calcular população total do continente
        System.out.println("População total do continente América do Sul: " + americaDoSul.calcularPopulacaoTotal());

        // Calcular densidade populacional do continente
        System.out.println("Densidade populacional do continente América do Sul: " + americaDoSul.calcularDensidadePopulacional());

        // País com maior população no continente
        System.out.println("País com maior população no continente América do Sul: " + americaDoSul.getPaisMaiorPopulacao());

        // País com menor população no continente
        System.out.println("País com menor população no continente América do Sul: " + americaDoSul.getPaisMenorPopulacao());

        // País de maior dimensão territorial no continente
        System.out.println("País de maior dimensão territorial no continente América do Sul: " + americaDoSul.getPaisMaiorDimensao());

        // País de menor dimensão territorial no continente
        System.out.println("País de menor dimensão territorial no continente América do Sul: " + americaDoSul.getPaisMenorDimensao());
    }
}
