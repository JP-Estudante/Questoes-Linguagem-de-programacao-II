/*Crie uma hierarquia de classes de domínio para uma loja que venda livros, CDs e
DVDs. Sobrescreva o método toString() para que imprima:
● Para livros: nome, preço e autor;
● Para CDs: nome, preço e número de faixas;
● Para DVDs: nome, preço e duração.
Evite ao máximo repetição de código utilizando a palavra super no construtor e no método
sobrescrito. Em seguida, crie uma classe Loja com o método main() que adicione 5
produtos diferentes (a sua escolha) a um vetor e, por fim, imprima o conteúdo do vetor.
*/
package exerciciosHeranca.Questao2;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    public static void main(String[] args) {
        CD cd1 = new CD("CD", 1500, 50);
        CD cd2 = new CD("CD2", 14.98, 4);
        Livros lv = new Livros("Livro", 14, "Robert");
        DVD dvd1 = new DVD("DVD", 5000, 230);
        DVD dvd2 = new DVD("DVD2", 19.90, 35);

        List<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(cd1);
        listaProdutos.add(cd2);
        listaProdutos.add(lv);
        listaProdutos.add(dvd1);
        listaProdutos.add(dvd2);

        for (Produto produto : listaProdutos) {
            System.out.println("Lista de Produtos: " + produto);
        }
    }
}
