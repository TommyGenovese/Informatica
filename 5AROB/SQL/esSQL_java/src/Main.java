package eu.itiscuneo;

import java.lang.*;
import java.io.*;

import java.sql.*;
import java.util.Vector;

public class Main {
    static final String SQLCLASS = "org.sqlite.JDBC";
    //static final String SQLCLASS = "org.gjt.mm.mysql.Driver";
    static final String SQLURL = "jdbc:sqlite:test.db";
    //static final String SQLURL = "jdbc:mysql://localhost:3306/test"
    static final String SQLUSER = "";
    static final String SQLPWD = "";
    static Connection conn = null;
    static Statement statm = null;
    static ResultSet rs = null;

    static Vector<eu.itiscuneo.Impiegati> anagrafica;

    static InputStreamReader r = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(r);
    static String sql = null;

    public static void main(String[] args) {
        if (conn == null) {
            try{
                Class.forName(SQLCLASS).newInstance();
                //conn = DriverManager.getConnection(SQLURL,SQLUSER,SQLPWD);
                conn=DriverManager.getConnection(SQLURL);
                statm = conn.createStatement();
            } catch (Exception ex) {
                System.err.println(ex.getClass().getName() + " : " + ex.getMessage());
                System.out.println("Connessione non OK, uscita programma.");
                System.exit(0);
            }
        }
        try{
            rs = statm.executeQuery("SELECT * FROM Impiegati");
            while(rs.next()){
                anagrafica.add(new eu.itiscuneo.Impiegati(rs.getString("nome"), rs.getString("cognome"), rs.getString("citta")));
            }
        } catch (SQLException e) {
            System.err.println(ex.getClass().getName()+ " : "+ ex.getMessage);
            System.out.println("Query "+sql+"ha dato eccezione");
        }
        int scelta = 0;
        do {
            System.out.println("Gestione database");
            System.out.println("=================");
            System.out.println("Premi 1 per visualizzare tutti i record.");
            System.out.println("Premi 2 per aggiungere nuovo record.");
            System.out.println("Premi 3 per cancellare un record.");
            System.out.println("Premi 4 per modificare un record.");
            System.out.println("Premi 5 per uscire.");
            System.out.println("Immettere scelta:");
            try {
                scelta=Integer.parseInt(br.readLine());
            } catch (IOException e) {
                System.out.println("Scelta non riconosciuta");
            }
            switch (scelta) {
                case 1: //visualizza tutti i record
                    eu.itiscuneo.Impiegati tmpImpiegato = null;
                    for (tmpImpiegato : anagrafica) {
                        System.out.println(tmpImpiegato.getNome() + ", " + tmpImpiegato.getCognome() + ", " + tmpImpiegato.getCitta());
                        sql = "SELECT * FROM impiegati;";
                    }
                    break;
                case 2: //aggiungi nuovo record
                    System.out.println("Immetti nome:");
                    String nome = null;
                    try {
                        nome=br.readLine();
                    } catch (IOException e) {
                        System.out.println("Errore in immissione nome.");
                        nome = "errore";
                    }
                    System.out.println("Immetti cognome:");
                    String cognome = null;
                    try {
                        cognome=br.readLine();
                    } catch (IOException e) {
                        System.out.println("Errore in immissione cognome.");
                        cognome = "errore";
                    }
                    System.out.println("Immetti città :");
                    String citta = null;
                    try {
                        citta=br.readLine();
                    } catch (IOException e) {
                        System.out.println("Errore in immissione città.");
                        citta = "errore";
                    }
                    sql = "INSERT INTO impiegati (nome, cognome, citta ) VALUES ('" + nome + "', '" + cognome + "', '" + citta + "' );";
                    break;
                case 3: //cancella record specifico
                    int s=0;
                    System.out.println("Immetti ID record da cancellare:");
                    try {
                        s=Integer.parseInt(br.readLine());
                    } catch (IOException e) {
                        System.out.println("Errore in immissione ID record.");
                        s = 0;
                    }
                    if ( s == 0 ) {
                        System.out.println("Numero record non valido.");
                        sql = "";
                    } else {
                        sql = "DELETE FROM impiegati WHERE _id = "  + s + " ;";
                    }
                    break;
                /*case 4: //update\modifica record x
                    int s=0;
                    System.out.println("Immetti ID record da modificare:");
                    try {
                        s=Integer.parseInt(br.readLine());
                    } catch (IOException e) {
                        System.out.println("Errore in immissione ID record.");
                        s = 0;
                    }
                    if ( s == 0 ) {
                        System.out.println("Numero record non valido.");
                        sql = "";
                    } else {
                        System.out.println("Immetti nome:");
                        String nome = null;
                        try {
                            nome=br.readLine();
                        } catch (IOException e) {
                            System.out.println("Errore in immissione nome.");
                            nome = "errore";
                        }
                        System.out.println("Immetti cognome:");
                        String cognome = null;
                        try {
                            cognome=br.readLine();
                        } catch (IOException e) {
                            System.out.println("Errore in immissione cognome.");
                            cognome = "errore";
                        }
                        System.out.println("Immetti città :");
                        String citta = null;
                        try {
                            citta=br.readLine();
                        } catch (IOException e) {
                            System.out.println("Errore in immissione città.");
                            citta = "errore";
                        }
                        sql = "INSERT INTO impiegati (nome, cognome, citta ) VALUES ('" + nome + "', '" + cognome + "', '" + citta + "' );";
                     }
                    break;*/
                case 5: //uscire dal programma
                    sql="";
                    break;
            }
//*******************DB*************************
            if (conn == null) {
                try{
                    Class.forName(SQLCLASS).newInstance();
                    //conn = DriverManager.getConnection(SQLURL,SQLUSER,SQLPWD);
                    conn=DriverManager.getConnection(SQLURL);
                } catch (Exception ex) {
                    System.err.println(ex.getClass().getName() + " : " + ex.getMessage());
                    System.out.println("Connessione non OK, uscita programma.");
                    System.exit(0);
                }
            }
            System.out.println("In esecuzione: " + sql);
            if (sql != "") {
                try {
                    statm = conn.createStatement();
                    if (scelta == 1) {
                        rs = statm.executeQuery(sql);
                        while (rs.next())
                            System.out.println(rs.getInt("_id") + ", " + rs.getString("nome") + ", " + rs.getString("cognome") + ", " + rs.getString("citta"));
                    } else {
                        statm.execute(sql);
                        //statm.executeQuery(sql);
                    }
                } catch (Exception ex) {
                    System.err.println(ex.getClass().getName() + " : " + ex.getMessage());
                    System.out.println("Query " + sql + " ha dato eccezione");
                }
            }
        } while (scelta != 4) ;
        System.out.println("Programma terminato.");
    }
}