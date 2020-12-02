import java.sql.*;
import java.util.Scanner;

public class TestMatrimonio {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        DB myDB = new DB();

        System.out.println("scegli cosa fare: \n\t-1: visualizzare candidati ordinati per sesso e nome, eventualmente incolonnati" +
                "\n\t -2: generare i record per i possibili abbinamenti uomo-donna" +
                "\n\t -3: modificare abbinamenti per immissione giudizi (uno solo oppure entrambi)" +
                "\n\t -4: cancellare abbinamenti con media giudizi < 50% oppure un giudizio < 25%" +
                "\n\t -5: tramite una query parametrizzata trova e visualizza le coppie con una media giudizi al di sopra di un valore inputabile da tastiera");

        int chose = Integer.parseInt(String.valueOf(input.next()));

        switch(chose){
            case 1:
                //1-select numero: visualizzare candidati ordinati per sesso e nome, eventualmente incolonnati;
                System.out.println("Select dei candidati in ordine sesso e nome:\n " + myDB.executeQuery("SELECT * FROM Candidati ORDER BY sesso, nome"));
                break;
            case 2:
                //2-generare i record per i possibili abbinamenti uomo-donna;
                System.out.println("2-inserisci l'id della coppia");
                String id = String.valueOf(input.next());
                System.out.println("2-inserisci il nome del papero MASCHIO");
                String nomeM = String.valueOf(input.next());
                System.out.println("2-inserisci il nome della papera FEMMINA");
                String nomeF = String.valueOf(input.next());
                System.out.println("2-inserisci il giudizio del papero "+nomeM+"");
                String giudM = String.valueOf(input.next());
                System.out.println("2-inserisci il giudizio della papera "+nomeF+"");
                String giudF = String.valueOf(input.next());
                System.out.println("Record aggiunti: " + myDB.executeUpdate("INSERT INTO Abbinamenti VALUES ('"+id+"', '"+nomeM+"', '"+nomeF+"', '"+giudM+"', '"+giudF+"')"));
                break;

            case 3:
                //3
                System.out.println("Quale abbinamento vuoi modificare?\n" + myDB.executeQuery("SELECT * FROM Abbinamenti")+ "\n inserisci l' id della coppia: ");
                int acp = Integer.parseInt(String.valueOf(input.next()));
                System.out.println("inserisci il primo giudizio (numero intero, 0-100): ");
                int giud1 = Integer.parseInt(String.valueOf(input.next()));
                System.out.println("Inserisci il secondo giudizio (numero intero, 0-100): ");
                int giud2 = Integer.parseInt(String.valueOf(input.next()));

                myDB.executeUpdate("UPDATE Abbinamenti SET giudizio1 = "+giud1+" WHERE id = "+acp);
                myDB.executeUpdate("UPDATE Abbinamenti SET giudizio2 = "+giud2+" WHERE id = "+acp);

                break;

            case 4:
                //4 cancellare abbinamenti con media giudizi < 50% oppure un giudizio < 25%;
                System.out.println("Record eliminati: " + myDB.executeUpdate("DELETE FROM Abbinamenti WHERE ((giudizio1+giudizio2)/2 < 50) OR giudizio1 < 25 OR giudizio2 < 25"));
                break;

            case 5:
                //5
                System.out.println("inserisci il valore del giudizio: ");
                int giud = Integer.parseInt(String.valueOf(input.next()));

                System.out.println("Accoppiamenti con media giudizi maggiore di "+giud+": \n" + myDB.executeQuery("SELECT Abbinamenti.id1, Abbinamenti.id2, (giudizio1+giudizio2)/2 " +
                        "FROM Abbinamenti" +
                        "WHERE (giudizio1+giudizio2)/2> "+giud));
                break;

            default:
                System.out.println("Opzione non valida");
                break;

        }



    }
}