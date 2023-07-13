package DesafioJava.TerceiroDesafio;

public class CountPairsTest {
    public static void main(String[] args) {
        // Exemplo 1: array vazio
        int[] arr1 = {};
        int k1 = 2;
        int expected1 = 0;
        int result1 = CountPairs.countPairs(arr1, k1);
        System.out.println("Test 1 - Expected: " + expected1 + ", Result: " + result1);

        // Exemplo 2: array sem pares
        int[] arr2 = {1, 3, 5, 7};
        int k2 = 2;
        int expected2 = 0;
        int result2 = CountPairs.countPairs(arr2, k2);
        System.out.println("Test 2 - Expected: " + expected2 + ", Result: " + result2);

        // Exemplo 3: array com pares
        int[] arr3 = {1, 5, 3, 4, 2};
        int k3 = 2;
        int expected3 = 3;
        int result3 = CountPairs.countPairs(arr3, k3);
        System.out.println("Test 3 - Expected: " + expected3 + ", Result: " + result3);
    
        // Exemplo 4: array com valores repetidos
        int[] arr4 = {2, 4, 4, 6, 6, 6, 8};
        int k4 = 2;
        int expected4 = 9;
        int result4 = CountPairs.countPairs(arr4, k4);
        System.out.println("Test 4 - Expected: " + expected4 + ", Result: " + result4);
    }
}
