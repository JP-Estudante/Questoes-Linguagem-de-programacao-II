package Heranca;

public class Principal {

    public static void main(String[] args) {

        Produto produtoVazio = new Produto();
        Produto produto1 = new Produto("Mouse Gamer RGB MasterPro", 2900.95);
        System.out.println("É caro? " + produto1.eCaro());

        Livro livro1 = new Livro("Como fazer Hello Word em mais de 300 linguagens", 130.90, 80, "Deitel");
        System.out.println("É caro? " + livro1.eCaro());
        System.out.println("É Grandão? " + livro1.ehGrande());

        produto1.imprimir();
        livro1.imprimir();
    }
}