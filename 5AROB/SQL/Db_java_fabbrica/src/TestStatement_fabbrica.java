/*
Author: Genovese Tommaso
Date: 15/11/2020
es:Utilizzando il db Fabbrica già creato, creare il progetto Java che permetta di eseguire le seguenti operazioni (già fatte
  per teoria)  nell'ordine:
✔ Per far diventare 3 il responsabile di PLFR
✔ Per eliminare il record dell'operaio  RSMR
✔ Per aumentare di 30€ lo stipendio di tutti gli operai della SedeA dei responsabili con codice A e B inseriti da tastiera
- Per reinserire la riga dell’operaio RSMR
- Codice e data assunzione degli operai/e della sede B del responsabile il cui nome e cognome viene inserito da tastiera in
  ordine crescente di data di assunzione
- Lo stipendio massimo degli operai della sede A, quello minimo e quello medio
- Contare gli operai/e della sede B con responsabile di codice X inserito da tastiera
 */
import java.sql.*;
import java.util.*;
import java.util.zip.DeflaterOutputStream;

public class TestStatement_fabbrica {
    public static void main(String args[]) {
        String URL = "jdbc:sqlite";
        String database ="fabbrica.db";
        String driver = "org.sqlite.JDBC";
        int iResult = 0;

        Connection con = null;
        ResultSet result;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(URL + ":" + database);
            System.out.println("Connessione fatta.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Driver non trovato");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Errore di connessione.");
        }
        if (con != null) {
            try {
                //1
                Statement stat1 = con.createStatement();
                iResult = stat1.executeUpdate("UPDATE SedeA SET CodR = 3 WHERE CodOperaio = 'PLFR'");
                System.out.println("Record modificati: " + iResult);

                //2
                Statement stat2 = con.createStatement();
                iResult = stat2.executeUpdate("DELETE FROM SedeB WHERE CodOperaio = 'RSMR'");
                System.out.println("Record eliminati: " + iResult);


                //3
                System.out.println("Immetti il codice del primo responsabile");
                Scanner input1 = new Scanner(System.in);
                String Resp1 = String.valueOf(input1.nextInt());
                System.out.println("Immetti il codice del secondo responsabile");
                Scanner input2 = new Scanner(System.in);
                String Resp2 = String.valueOf(input2.nextInt());
                Statement stat3 = con.createStatement();
                iResult = stat3.executeUpdate("UPDATE SedeA SET Stipendio = Stipendio+30 " +
                                                  "WHERE CodR="+Resp1+" OR CodR="+Resp2);
                System.out.println("Numero modifiche: " + iResult);


                //4
                System.out.println("Immetti il codice dell'operaio");
                Scanner inputCodOp = new Scanner(System.in);
                String CodOp = String.valueOf(inputCodOp.next());

                System.out.println("Immetti il sesso dell'operaio");
                Scanner inputSes = new Scanner(System.in);
                String Sesso = String.valueOf(inputSes.next());

                System.out.println("Immetti l'assunzione dell'operaio");
                Scanner inputAss = new Scanner(System.in);
                String Assunt = String.valueOf(inputAss.next());

                System.out.println("Immetti lo stipendio dell'operaio");
                Scanner inputStip = new Scanner(System.in);
                String Stip = String.valueOf(inputStip.next());

                System.out.println("Immetti il responsabile dell'operaio");
                Scanner inputCodR = new Scanner(System.in);
                String CodR = String.valueOf(inputCodR.next());

                Statement stat4 = con.createStatement();
                iResult = stat4.executeUpdate("UPDATE SedeA SET CodOperaio='"+CodOp+"', Sesso='"+Sesso+"', Assunto_il='"+Assunt+"', Stipendio="+Stip+", CodR="+CodR+"");
                System.out.println("Record inserito: " + iResult);

                stat1.close();
                stat2.close();
                stat3.close();
                stat4.close();
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Errore di esecuzione query.");
            }
        }

    }
}