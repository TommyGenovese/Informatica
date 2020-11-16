import java.sql.*;
import java.util.Scanner;

public class TestStatement_LJT {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        DB myDB = new DB();

        //1
        System.out.println("Record modificato: " + myDB.executeUpdate("UPDATE SedeA SET CodR = 3 WHERE CodOperaio = 'PLFR'"));

        //2
        System.out.println("Record modificato: " + myDB.executeUpdate("DELETE FROM SedeB WHERE CodOperaio = 'RSMR'"));

        //3
        int resp1 = Integer.parseInt(String.valueOf(input.next()));
        int resp2 = Integer.parseInt(String.valueOf(input.next()));

        System.out.println("Record modificato: " + myDB.executeUpdate("UPDATE SedeA SET Stipendio = Stipendio+30 WHERE CodR=  '" + resp1 + "' OR CodR= '" + resp2 + "'"));

        //4
        System.out.println("Record modificato: " + myDB.executeUpdate("INSERT INTO SedeB VALUES ('RSMR','F','2011-05-05',880.78,2)"));

        //5
        String nome = String.valueOf(input.next());
        String cognome = String.valueOf(input.next());

        System.out.println("Selezionato: \n" + myDB.executeQuery("SELECT CodOperaio, Assunto_il FROM SedeB, Responsabili WHERE CodR = CodRep AND Nome = '" + nome + "' AND Cognome = '" + cognome + "' ORDER BY Assunto_il"));

        //6
        System.out.println("MAX: " + myDB.executeQuery("SELECT MAX(Stipendio) FROM SedeA") + "\n" + "AVG: " + myDB.executeQuery("SELECT AVG(Stipendio) FROM SedeA") + "\n" + "MIN: " + myDB.executeQuery("SELECT MIN(Stipendio) FROM SedeA") + "\n" );

        //7
        resp1 = Integer.parseInt(String.valueOf(input.next()));
        System.out.println("COUNT: " + myDB.executeQuery("SELECT COUNT(*) FROM SedeB WHERE CodR = " + resp1));
    }
}