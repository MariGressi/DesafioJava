package DesafioJava.SegundoDesafio;

public class DecompositionNotesCoins {
    public static void calculateRest(double value){
            
        //Arrays que armazena a as notes e coins possiveis para a decomposição
        int [] notes = {100, 50, 20, 10, 5, 2};
        double[] coins = {1, 0.5, 0.25, 0.10, 0.05, 0.01};

        //Função que lê,verificar o a quantidade de cada note e imprimir
        System.out.println("NOTAS:");
        for(int note: notes){
            int amountNotes = (int) (value / note);
            System.out.println(amountNotes + " nota(s) de R$ " + note + ".00");
            value %= note;
        }
       //Função que lê,verificar o a quantidade de cada coin e imprimir
        System.out.println("MOEDAS:");
        for(double coin: coins){
            int amountcoins = (int) (value / coin);
            System.out.println(amountcoins + " moeda(s) de R$ " + String.format("%.2f", coin));
            value %= coin;
        }
    }
    
}
