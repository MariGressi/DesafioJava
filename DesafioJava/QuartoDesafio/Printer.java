package DesafioJava.QuartoDesafio;

public class Printer {

    //Função que procura o meio da linha e reorganiza os caracteresdo meio para o inicio e final para o meio.
    public static String decryptLine(String line){

        int length = line.length();
        StringBuilder originalLine = new StringBuilder(length);

        int middleIndex =  length/2;

        for (int i = middleIndex-1; i >= 0; i--){
            originalLine.append(line.charAt(i));
        }

        for(int i = length - 1; i >= middleIndex; i--){
            originalLine.append(line.charAt(i));
        }

        return originalLine.toString();
    }
    
}
