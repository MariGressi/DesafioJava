package DesafioJava.PrimeiroDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdinationPairsOdd {
    
    private List<Integer> pairs;
    private List<Integer> odd;

    //Array para armazenar pares e impares
    public OrdinationPairsOdd(){
        pairs = new ArrayList<>();
        odd = new ArrayList<>();

    }

    //Função que add cada valor ao devido array
    public void addValue(int value){
        if(value %2 ==0){
            pairs.add(value);
        }else{
            odd.add(value);
        }
    }
    //Função que ordena o array de pares em ordem crescente e o de impares em ordem decrescente
    public void orderValues(){
        Collections.sort(pairs);
        Collections.sort(odd, Comparator.reverseOrder());
    }

    //Função que imprime os arrays
    public void printValues(){
        System.out.println("Pares em ordem crescente: ");
        for(int value: pairs){
            System.out.println(value);
        }

        System.out.println("Impares em ordem decrescente:");
        for(int value: odd){
            System.out.println(value);
        }
    }
    
}