import java.util.*;
import com.google.gson.Gson;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Test {
    public static void main (String[] args){
        Prova();
        //nome del file in cui andare a salvare
        String nomefile = "libri.json";
        //est sarà = .bin per chi utilizza il file di byte
        //         = .json
        //         = .csv

        Autore collodi = new Autore("Carlo", "Collodi");
        Autore perrault = new Autore("Charles","Perrault");
        Libreria libreria = new Libreria();
        Libro l1 = new Libro("Pinocchio", collodi, 150);
        Libro l2 = new Libro("Pollicino", perrault, 80);
        Libro l3 = new Libro("La bella addormentata nel bosco", perrault, 50);

         // inserimento volumi
        libreria.addVolume(l1);
        libreria.addVolume(l2);
        libreria.addVolume(l3);

        //cambio il prezzo a pagina
        Libro.setCostoPagina(0.01);
        System.out.println(libreria);

        // salvataggio libreria su file METODO DA IMPLEMENTARE
        libreria.salvaLibreria (nomefile);

        // creazione nuova libreria vuota
        //LibreriaJson l = new LibreriaJson();
        //System.out.println("Prima " + l);

        // caricamento libreria da file METODO DA IMPLEMENTARE
        //l.caricaLibreria(nomeFile);
        //System.out.println("Dopo: " + l);
   }

    private static void Prova() {
        /*String strJson;
        String libro2;
        Libreria libreriaTommy = new Libreria();

        Autore carrisi = new Autore("Donato", "Carrisi");
        Autore lippincott = new Autore("Rachel", "Lippincott");

        Libro l4 = new Libro("La ragazza della nebbia", carrisi, 370);
        Libro.setCostoPagina(0.03);
        Gson gson= new Gson();
        strJson = gson.toJson(l4);
        System.out.println(strJson + "\n");

        Libro l5 = new Libro("Five feet apart", lippincott, 276);
        Libro.setCostoPagina(0.05);
        Gson gson1= new Gson();
        libro2 = gson1.toJson(l5);
        System.out.println(libro2 + "\n");

        libreriaTommy.addVolume(l4);
        libreriaTommy.addVolume(l5);

        System.out.println(libreriaTommy);

    */}

}
