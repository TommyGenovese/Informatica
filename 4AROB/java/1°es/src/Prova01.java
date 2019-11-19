import java.lang.*;                              // l' * serve per includere tutte le classi di java.lang
                                                 // è talmente comune la java.lang che viene importata automaticamente (si può non scrivere)
public class Prova01 {
    public static void  main(String[] args){            //out fa parte della classe System
        System.out.println(5+ "ciao " +3 + "bella");    //concatenazione degli elementi tramite il '+' fra valori di diverso tipo (char, int etc...)
        System.out.println("ciao");                     //printLN va a capo alla fine del print

        System.out.println(6 + 3.14);                   //addizione
        System.out.println(6*2);                        //moltiplicazione
        System.out.println(6/2);                        //divisione con risultato intero
        System.out.println(7/2);                        //divisione cmq intera perchè fra numeri interi
        System.out.println(1.0*7/2);                    //divisione castata


    }
}
