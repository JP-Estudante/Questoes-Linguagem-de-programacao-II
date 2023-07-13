/*Modifique o código do programa anterior, da seguinte forma:
a) Adicione um atributo que represente o código de barras do produto (é um valor
obrigatório e, portanto, deve ser pedido no construtor);
b) Sobrescreva o método equals() retornando true se dois produtos possuem o
mesmo código de barras;
c) Na classe Loja, implemente um simples procedimento de busca que, dado um
produto e um array de produtos, indique em que posição do array se encontra o
produto especificado ou imprima que o mesmo não foi encontrado;
d) No método Loja.main(), após a impressão do vetor (feita na questão 2a), escolha
um dos 5 produtos e crie duas novas instâncias idênticas a ele: uma com o mesmo
código de barras e outra com o código diferente. Efetue a busca deste produto no
vetor utilizando as duas instâncias e verifique o resultado.
*/
package exerciciosHeranca.Questao3;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    public static void main(String[] args) {
        CD cd1 = new CD("CD1", 1500, "1456789213456", 50);
        CD cd2 = new CD("CD2", 14.98, "1456789213456", 4);
        Livros lv = new Livros("Livro", 14, "1234567891234", "Robert");
        DVD dvd1 = new DVD("DVD1", 5000, "1478952360198", 230);
        DVD dvd2 = new DVD("DVD2", 19.90, "7909845679812", 35);

        List<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(cd1);
        listaProdutos.add(cd2);
        listaProdutos.add(lv);
        listaProdutos.add(dvd1);
        listaProdutos.add(dvd2);

        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }

        Produto produto1 = new Livros("Livro1", 15.58, "987654321", "Lucassim");
        Produto produto2 = new Livros("Livro2", 17.80, "987654321", "Autor2");

        buscarProduto(produto1, listaProdutos);
        buscarProduto(produto2, listaProdutos);
    }

    private static void buscarProduto(Produto produto, List<Produto> listaProdutos) {
        int posicao = listaProdutos.indexOf(produto);
        if (posicao != -1)
            System.out.println("O produto " + produto.getNome() + " foi encontrado na posição " + posicao + " do vetor.");
        else
            System.out.println("O produto " + produto.getNome() + " não foi encontrado.");
    }
}
