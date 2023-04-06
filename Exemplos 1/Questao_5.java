//INCOMPLETA
import java.util.Scanner;

public class Questao_5 {
    public static void main(String[] args) {
        double tmpVolta, menorTmp, somaTmp; //TMP == Tempo
        int numVoltas, voltaMenTmp, i; //voltaMenTmp == VoltaMenorTempo
    
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantidade de voltas: ");
        numVoltas = teclado.nextInt();

        for(i = 0; i < numVoltas; i++){
            System.out.print("Tempo da "+ (i+1) +"º volta: ");
            System.out.println();

            tmpVolta = teclado.nextDouble();
            menorTmp = tmpVolta;
            voltaMenTmp = 1;
            somaTmp = tmpVolta;

            if(tmpVolta < menorTmp){
                menorTmp = tmpVolta;
                voltaMenTmp = i+1;
            }
        }
        teclado.close();
    }
}
