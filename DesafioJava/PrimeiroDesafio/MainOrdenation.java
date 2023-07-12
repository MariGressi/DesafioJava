package DesafioJava.PrimeiroDesafio;

import java.util.Scanner;

public class MainOrdenation {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de valores: ");
        int N = scanner.nextInt();

        OrdinationPairsOdd ordenationPairsOdd = new OrdinationPairsOdd();

        System.out.print("Digite os valores: ");

        //Ler os valores
        for(int i = 0; i < N; i++){
            int value = scanner.nextInt();
            ordenationPairsOdd.addValue(value);
        }
        //Chama funções que ordena e imprime
        ordenationPairsOdd.orderValues();
        ordenationPairsOdd.printValues();

        scanner.close();

    }
    
}
