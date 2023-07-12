package DesafioJava.TerceiroDesafio;

import java.util.HashMap;
import java.util.Map;

public class CountPairs {
    public static int countPairs(int[] arr, int k){
        //Cria um mapa para armazenar a contagem de occurrences de cada elemento
        Map<Integer, Integer> occurrences = new HashMap<>();

        int count = 0;

        for(int num: arr) {

            int diff = num - k;

            //Verifica se a diferença está presente no mapa
            if(occurrences.containsKey(diff)){
                count += occurrences.get(diff);
            }

            diff = num + k;

            //Verifica se a soma está presente no mapa
            if(occurrences.containsKey(diff)){
                count += occurrences.get(diff);
            }

            //Atualiza as occurrences do numero atual
             occurrences.put(num, occurrences.getOrDefault(num, 0)+1);

        }
        return count;
    
    }
}
