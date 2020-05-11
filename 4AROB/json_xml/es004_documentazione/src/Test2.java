/**
 * La classe Test2 contiene il main, che manda in esecuzione la lettura da file .json
 * @see LibreriaJson
 * @see Libro
 *
 * @author Genovese Tommaso, Bruno Luca, Cuniberti Andrea, Bagnis Gabriele
 * @version 2.0
 */
public class Test2 {
    /**
     * Il metodo main esegue la lettura del file json, passando il nome del file.
     * viene creato anche un oggetto LibreriaJson che viene stampato prima e dopo la lettura del file
     */
    public static void main(String[] args) {
        // creazione nuova libreria vuota
        LibreriaJson l = new LibreriaJson();
        System.out.println("Prima " + l.toString());
        // caricamento libreria da file METODO DA IMPLEMENTARE
        l.caricaLibreria("libreria.json");
        System.out.println("Dopo: " + l.toString());
    }
}
