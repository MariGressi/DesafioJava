package DesafioJava.PrimeiroDesafio;

public class OrdinationPairsOddTest {
    public static void main (String[] args){
        OrdinationPairsOdd ordinationPairsOdd = new OrdinationPairsOdd();

        //Adiciona alguns valores de teste
        ordinationPairsOdd.addValue(5);
        ordinationPairsOdd.addValue(12);
        ordinationPairsOdd.addValue(8);
        ordinationPairsOdd.addValue(3);
        ordinationPairsOdd.addValue(10);
        ordinationPairsOdd.addValue(7);


        //Ordena os valores
        ordinationPairsOdd.orderValues();

        //Imprime os valores ordenaos
        ordinationPairsOdd.printValues();

    }
    
}
