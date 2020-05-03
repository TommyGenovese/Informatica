import java.util.Vector;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Libreria {
    private Vector<Libro> libri;

    public Libreria() {
        libri = new Vector<Libro>();
    }

    public void addVolume(Libro libro) {
        libri.add(libro);
    }

    @Override
    public String toString() {
        return "Libreria = " + libri ;
    }

    public void salvaLibreria(String nomeFile){
        JSONObject dettagliLibro = new JSONObject();
        JSONObject dettagliAurore = new JSONObject();
        JSONObject autore = new JSONObject();
        JSONObject libro = new JSONObject();
        JSONArray listaLibri = new JSONArray();

        for(int i =0; i<libri.size(); i++){


            dettagliAurore.put("nome",libri.elementAt(i).getAutore().getNome());
            dettagliAurore.put("cognome",libri.elementAt(i).getAutore().getCognome());

            dettagliLibro.put("autore" , dettagliAurore);
            dettagliLibro.put("titolo", libri.elementAt(i).getTitolo());
            dettagliLibro.put("numero pagine", String.valueOf(libri.elementAt(i).getNumeroPagine()));
            libro.put("libro",dettagliLibro);

            listaLibri.add(libro);

        }
        //Write JSON file
        try (FileWriter file = new FileWriter(nomeFile)) {
            file.write(listaLibri.toJSONString() + "\n");
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }





    }


}