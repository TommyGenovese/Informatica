/**
 *Questa è la classe CaricaLibreria, dove si ha la possibilità di convertire e
 * salvare la libreria da Java a JSON
 *
 * Della libreria Json.simple (https://code.google.com/archive/p/json-simple/downloads -->json-simple-1.1.1.jar) abbiamo importato:
 *      @see org.json.simple.JSONArray
 *      @see org.json.simple.JSONObject
 *      @see org.json.simple.parser.JSONParser
 *      @see org.json.simple.parser.ParseException
 *      per operare con oggetti e array JSON
 *
 *      @see java.io.FileReader
 *      @see java.io.FileNotFoundException
 *      @see java.io.IOException
 *      per l'utilizzo del file
 *
 *      @see java.util.Vector
 *      per utilizzare un vettore.
 *
 * @author Genovese Tommaso, Bruno Luca, Cuniberti Andrea, Bagnis Gabriele
 * @version 2.2
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LibreriaJson {
    static Vector<Libro> libreria;

    /**
     * E' il metodo costruttore, lo utilizziamo solo per inizializzare il vector
     */
    public LibreriaJson(){
        libreria = new Vector<Libro>();
    }

    /**
     * Il metodo caricaLibreria si occupa di leggere il file json e di trovare le eventuali eccezioni che si possono presentare
     * @param nomeFile e' il nome del file che passiamo al metodo, in modo che lo possa aprire
     */
    public void caricaLibreria(String nomeFile){
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(nomeFile))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray listaLibri = (JSONArray) obj;
            //System.out.println(listaLibri);

            listaLibri.forEach( lib -> parseOgbjectLibro( (JSONObject) lib ) );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * Il metodo statico parseObjectLibro aggiunge al vettore "libreria" i dati di un libro (autore(nome e cognome), titolo, pagine del libro
     * @param l e' un parametro di tipo JSONObject, che contiene tutte le informazioni di un libro
     * @see Libro
     */
    private static void parseOgbjectLibro(JSONObject l)
    {
        String nomeAutore;
        String cognomeAutore;
        String titolo;
        int pagineLibro;

        JSONObject libro = (JSONObject) l.get("libro");
        JSONObject autore = (JSONObject)  libro.get("autore");

        nomeAutore = (String) autore.get("nome");
        cognomeAutore = (String) autore.get("cognome");
        titolo = (String) libro.get("titolo");
        pagineLibro =Integer.parseInt((String) libro.get("numero pagine"));

        libreria.add(new Libro(titolo, new Autore(nomeAutore,cognomeAutore), pagineLibro));
    }

    /**
     * Il metodo toString stampa una stringa out che contiene tutti gli elementi della libreria (tutti i dati di ogni libro)
     * @return out
     */
    @Override
    public String toString() {
        String out = "";
        for (int i =0; i<libreria.size();i++){
            out += libreria.elementAt(i).toString() + "\n";
        }
        return out;
    }
}
