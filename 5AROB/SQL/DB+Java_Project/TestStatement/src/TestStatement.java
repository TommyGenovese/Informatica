//Il codice del metodo main di questa classe dimostra la connessione al database "test.db" dell'esempio precedente
// gestito da un server DBMS SqLite in esecuzione sullo stesso sistema che esegue l'applicazione;
import java.sql.*;
public class TestStatement {
    public static void main(String[] args) {
        Connection conn = null;
        ResultSet result;
        ResultSet iResult;
        String URL = "jdbc:sqlite";
        String database ="test.db";
        String driver = "org.sqlite.JDBC";
        try {
            Class.forName(driver);
            //il metodo getConnection crea il collegamento con l'URL (jdbc:sqlite:test.db), restituisce un oggetto
            conn= DriverManager.getConnection(URL + ":" + database);
            System.out.println("connessione effettuata");
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("driver non trovato");
        } catch (SQLException e) {
            System.out.println("Errore di connessione");
        }
        if(conn != null){
            try{
                Statement stat1 = conn.createStatement();
                stat1.execute("DELEATE FROM impiegati");
                result = stat1.executeQuery("SELECT * FROM impiegati");
                Statement stat2 = conn.createStatement();
                iResult = stat2.executeQuery("INSERT INTO (nome, cognome, citta) VALUES (Jacopo, Van Cleeff, RoccaSpadiera)");
                System.out.println("record aggiunti: "+ iResult);
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Errore di esequzione query");
            }
        }
    }
}
