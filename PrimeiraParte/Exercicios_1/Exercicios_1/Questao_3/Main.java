package PrimeiraParte.Exercicios_1.Exercicios_1.Questao_3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Voo voo1 = new Voo(123, LocalDate.of(2023, 5, 1));
        Voo voo2 = new Voo(456, LocalDate.of(2023, 5, 2));

        System.out.println("Próxima cadeira livre no voo1: " + voo1.proximoLivre());

        voo1.ocupa(1);
        voo1.ocupa(3);
        voo1.ocupa(5);

        System.out.println("Cadeira 1 ocupada? " + voo1.verifica(1));
        System.out.println("Cadeira 2 ocupada? " + voo1.verifica(2));
        System.out.println("Cadeira 3 ocupada? " + voo1.verifica(3));

        System.out.println("Número de cadeiras vagas no voo1: " + voo1.vagas());
        System.out.println("Número do voo2: " + voo2.getVoo());
        System.out.println("Data do voo2: " + voo2.getData());
    }
}
