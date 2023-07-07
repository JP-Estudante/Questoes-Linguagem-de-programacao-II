package pacote;

public class Titular {
    String nome, fone, cpf;

    public Titular(String nome, String fone, String cpf) {
        this.nome = nome;
        this.fone = fone;
        this.cpf = cpf;
    }


    public String getNome() {
        return this.nome;
    }

    public String getFone() {
        return this.fone;
    }

    public String getCpf() {
        return this.cpf;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", fone='" + getFone() + "'" +
            ", cpf='" + getCpf() + "'" +
            "}";
    }

}
