package pacote;

public class Titular {
    private String nome, fone, cpf;

    //public Titular(){}    
    public Titular(String nome, String fone, String cpf) {
        this.nome = nome;
        this.fone = fone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Titular{" + "nome=" + nome + ", fone=" + fone + ", cpf=" + cpf + '}';
    }   
}
