package heranca;

public class Livro extends Produto {
    private int paginas;
    private String autor;

    public Livro(String nome, double preco, int paginas, String autor) {
        super(nome, preco);
        this.paginas = paginas;
        this.autor = autor;
    }

    public boolean ehGrande() {
        return (paginas > 200);
    }

    @Override //Exemplo de reescrita de método
    public boolean eCaro(){
        return (preco > 50);
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Páginas: " + paginas + " Autor: " + autor);
    }

}
