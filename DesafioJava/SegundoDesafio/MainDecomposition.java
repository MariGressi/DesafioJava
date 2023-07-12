package DesafioJava.SegundoDesafio;

import java.util.Scanner;

public class MainDecomposition {
     public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        //Recebe  o valor a ser decomposto
        double value = scanner.nextDouble();
        //Chama função que faz a decomposição
        DecompositionNotesCoins.calculateRest(value);

        scanner.close();
    }

    
}
