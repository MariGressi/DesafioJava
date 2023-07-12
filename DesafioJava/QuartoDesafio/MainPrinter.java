package DesafioJava.QuartoDesafio;

import java.util.Scanner;

public class MainPrinter {
    public static void main (String [] args){

        try (Scanner scanner = new Scanner(System.in)) {
            //Recebe o numero de linhas
            System.out.println("Digite o numero de linhas a serem impressas: ");
            int numCases = Integer.parseInt(scanner.nextLine());

            System.out.println("Digite as linhas a serem impressas: ");
            String[] lines = new String[numCases];

            //Recebe as linhas
            for(int i= 0; i < numCases; i++){
                lines[i] = scanner.nextLine();
            }

            //Printer  printer = new Printer();

            //Verifica se a linha tem um numero par de caracteres e desembaralha linha por linha
            for(String line: lines) {
                if(line.length() % 2 ==0 ){
                    String originalLine = Printer.decryptLine(line);
                    System.out.println("Frases corrijidas: ");
                    System.out.println(originalLine);
                }else {
                    System.out.println("A linha deve conter um numero par de caracteres!");
                }
            }
        }
    }
    
}
