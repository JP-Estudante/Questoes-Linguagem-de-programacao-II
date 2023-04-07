/*
* 
* Exemplo de Try e Catch
* 
*/
package Exemplo_ArrayList;

import java.util.ArrayList;

public class ExArrayList_2 {
    public static void main(String[] args) {
        //declarando um arraylist do tipo string
        ArrayList<String> carros = new ArrayList<>();  
        
        carros.add("Corsa");
        carros.add("Gol");
        carros.add("Pálio");
        carros.add("Uno Mille");
        
        System.out.println("Tamanho da Lista: " + carros.size()); 

        for(String carro: carros){
            System.out.println(carro);            
        }

        /*
        for(int i=0; i<carros.size(); i++){
            System.out.println(carros.get(i));            
        }
        */

        if(carros.contains("Pálio")){
            System.out.println();
            System.out.println("Carro Encontrado!");
            System.out.println();

        }else{
            System.out.println("Carro não encontrado!");
            System.out.println();

        }

        carros.set(2, "Opala");//altera o Pálio para Opala

        for(String carro: carros){
            System.out.println(carro);            
        }

        try{
            carros.remove(6);
        }
        catch (Exception e){
            System.out.println("Erro ao Excluir: " + e.getMessage());
        }       
        System.out.println();
    }
}
