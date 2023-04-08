import java.util.Scanner;

public class Questao_5 {
    public static void main(String[] args) {
        double tmpVolta, menorTmp = Double.MAX_VALUE, somaTmp = 0; // TMP == Tempo
        int numVoltas, voltaMenTmp = 1, i; // voltaMenTmp == VoltaMenorTempo

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantidade de voltas: ");
        numVoltas = teclado.nextInt();

        try {
            for (i = 0; i < numVoltas; i++) {
                System.out.print("Tempo da " + (i + 1) + "º volta: ");
                tmpVolta = teclado.nextDouble();

                if (tmpVolta < menorTmp) {
                    menorTmp = tmpVolta;
                    voltaMenTmp = i + 1;
                }

                somaTmp += tmpVolta;
            }
        } finally {
            teclado.close();
        }

        System.out.println("Menor tempo: " + menorTmp);
        System.out.println("Volta do menor tempo: " + voltaMenTmp);
        System.out.println("Tempo médio: " + somaTmp / numVoltas);
    }
}
