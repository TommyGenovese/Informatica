/**
 *Questa è la classe Libreria, dove si ha la possibilità di convertire e salvare la libreria da Java a JSON
 *
 * Della libreria Json.simple (https://code.google.com/archive/p/json-simple/downloads -->json-simple-1.1.1.jar) abbiamo importato:
 *      -JSONArray: i vettori Json
 *      -JSONObject: gli oggetti Json
 *
 * Abbiamo anche importato i Vector, il FileWriter(per scrivere su file) e IOException (per la gestione delle eccezioni IO)
 *
 * @author Genovese Tommaso, Bruno Luca, Cuniberti Andrea, Bagnis Gabriele
 * @version 2.2
 */

import java.util.Vector;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Libreria {

    private Vector<Libro> libri;

    /**
     * Costruttore della classe Libreria
     * Creo un vettore di libri
     */
    public Libreria() {
        libri = new Vector<Libro>();
    }

    /**
     *questo metodo fa in modo di aggiungere un libro al nostro vettore di libri
     * @param libro questo è il libro da aggiungere al vettore
     * @see Libro
     */
    public void addVolume(Libro libro) {
        libri.add(libro);
    }

    /**
     *
     * @return il metodo to-string restituisce i libri presenti nella libreria
     */
    @Override
    public String toString() {
        return "Libreria = " + libri ;
    }


    /**Il metodo salvaLibreria è il succo del progetto; permette infatti di scrivere la libreria
     *  sul file Json tramite questa riga di codice: <pre>file.write(listaLibri.toJSONString());</pre>
     * la funzione .toJSONString() rende la listaLibri di Java una listaLibri scritta in JSON
     *
     *  Il metodo .add() fa parte dei JSONArray e viene usato per aggiungere un oggetto al vettore Json (in questo caso)
     *          <pre>libreria.add(new JSONObject());</pre>
     *      Mentre qua viene usato per aggiungere un elemento(libro) alla lista dei libri
     *          <pre>listaLibri.add(libreria.elementAt(i));</pre>
     *
     *  Il metodo .put() fa parte dei JSONObject e vioene usato per aggiungere il nome, il cognome, il titolo o l'Oggetto Autore all'Autore o al Libro (in questo caso)
     *          <pre>listaDettagliAutore.elementAt(i).put("nome", libri.elementAt(i).getAutore().getNome());</pre>
     *
     * @param nomeFile nome del file ****.json su cui scrivere
     * @see Test
     */
    public void salvaLibreria(String nomeFile){


        JSONObject dettagliLibro = new JSONObject();
        JSONObject dettagliAurore = new JSONObject();
        JSONObject autore = new JSONObject();
        JSONObject libro = new JSONObject();
        JSONArray listaLibri = new JSONArray();
        Vector<JSONObject> libreria = new Vector<JSONObject>();
        Vector<JSONObject> listaDettagliAutore = new Vector<JSONObject>();
        Vector<JSONObject> listaDettagliLibro = new Vector<JSONObject>();

        for(int i =0; i<libri.size(); i++) {
            libreria.add(new JSONObject());
            listaDettagliAutore.add(new JSONObject());
            listaDettagliLibro.add(new JSONObject());



            listaDettagliAutore.elementAt(i).put("nome", libri.elementAt(i).getAutore().getNome());
            listaDettagliAutore.elementAt(i).put("cognome", libri.elementAt(i).getAutore().getCognome());

            listaDettagliLibro.elementAt(i).put("autore", listaDettagliAutore.elementAt(i));
            listaDettagliLibro.elementAt(i).put("titolo", libri.elementAt(i).getTitolo());
            listaDettagliLibro.elementAt(i).put("numero pagine", String.valueOf(libri.elementAt(i).getNumeroPagine()));
            libreria.elementAt(i).put("libro",listaDettagliLibro.elementAt(i));



            listaLibri.add(libreria.elementAt(i));

            System.out.println(listaLibri);
        }

        //Write JSON file
        try (FileWriter file = new FileWriter(nomeFile)) {
            file.write(listaLibri.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}