package DesafioJava.QuartoDesafio;

public class DecryptLineTest {
    public static void main(String[] args ){

        //Teste 1 
        String line1 = "I ENIL SIHTHSIREBBIG S";
        String descryptedLine1 = Printer.decryptLine(line1);
        System.out.println(descryptedLine1); //Deve imprimir "THIS LINE IS GIBBERISH "

        //Teste 2
        String line2 = "NAM SOG";
        String descryptedLine2 = Printer.decryptLine(line2);
        System.out.println(descryptedLine2);//Deve imprimir "MANGOS"

        //Teste 3
        String line3 = "TOCOCAT";
        String descryptedLine3 = Printer.decryptLine(line3);
        System.out.println(descryptedLine3);//Dee imprimir "CATOACAT"

        //Teste 4 
        String line4 = "LOL";
        String descryptedLine4 = Printer.decryptLine(line4);
        System.out.println(descryptedLine4); //Deve imprimir "LOL"

        //Teste 5 
        String line5 ="ABCDE";
        String descryptedLine5 = Printer.decryptLine(line5);
        System.out.println(descryptedLine5);//Deve imprimir "CBAED" 
    }
    
}
