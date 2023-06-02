package PrimeiraParte.FixacaoProva.Fix2;

public class Main {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        // Criação das cidades
        Cidade saoPaulo = new Cidade("São Paulo", 12345678, 1521.11);
        Cidade rioDeJaneiro = new Cidade("Rio de Janeiro", 6789123, 1182.35);
        Cidade beloHorizonte = new Cidade("Belo Horizonte", 567890, 588.89);

        // Adicionar cidades vizinhas
        saoPaulo.adicionarCidadeVizinha(rioDeJaneiro);
        saoPaulo.adicionarCidadeVizinha(beloHorizonte);
        rioDeJaneiro.adicionarCidadeVizinha(saoPaulo);
        beloHorizonte.adicionarCidadeVizinha(saoPaulo);

        // Verificar igualdade semântica
        Cidade cidade1 = new Cidade("São Paulo", 12345678, 1521.11);
        System.out.println("saoPaulo.equals(cidade1): " + saoPaulo.equals(cidade1)); // true

        Cidade cidade2 = new Cidade("Salvador", 9876543, 800.25);
        System.out.println("saoPaulo.equals(cidade2): " + saoPaulo.equals(cidade2)); // false

        // Calcular densidade populacional
        System.out.println("Densidade populacional de São Paulo: " + saoPaulo.calcularDensidadePopulacional());

        // Obter lista de cidades vizinhas
        System.out.println("Cidades vizinhas de São Paulo:");
        for (Cidade vizinha : saoPaulo.getCidadesVizinhas()) {
            System.out.println(vizinha.getNome());
        }
    }
}

