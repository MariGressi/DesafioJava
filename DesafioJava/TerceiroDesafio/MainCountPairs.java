package DesafioJava.TerceiroDesafio;

public class MainCountPairs {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;

        int count =CountPairs.countPairs(arr, k);
        System.out.println("Número de pares encontrados: " + count);
    }
    
}
