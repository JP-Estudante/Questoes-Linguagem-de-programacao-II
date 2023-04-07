package Exemplo_ArrayList;

import java.util.ArrayList;

public class ExArrayList_1 {
    public static void main(String[] args) {
        //declarando um arraylist do tipo string
        ArrayList<String> carros = new ArrayList<>();  
        
        carros.add("Corsa");
        carros.add("Gol");
        carros.add("Pálio");
        carros.add("Uno Mille");
        
        System.out.println("Tamanho da Lista: " + carros.size()); 
        
        /*
        for(int i=0; i<carros.size(); i++){
            System.out.println(carros.get(i));            
        }
        */
        
        for(String carro: carros){
            System.out.println(carro);            
        }

        System.out.println();

        carros.remove(0); //função para remover iten da lista por índice

        System.out.println("Tamanho da Lista: " + carros.size()); 

        for(String carro: carros){
            System.out.println(carro);
        }    
        System.out.println();
            
        carros.remove("Gol"); //função para remover iten da lista por string

        System.out.println("Tamanho da Lista: " + carros.size()); 

        for(String carro: carros){
            System.out.println(carro);  
        }
    }
}
