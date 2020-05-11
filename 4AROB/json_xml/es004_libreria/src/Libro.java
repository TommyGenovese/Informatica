/**
 * La classe libro contiene tutte le caratteristiche del libro da vendere:
 * titolo, autore, numero delle pagine e il costo
 * @see Autore
 * L'istanza di questa classe verra' utilizzata nella classe Test2
 * @see Test2
 * @author Genovese Tommaso, Bruno Luca, Cuniberti Andrea, Bagnis Gabriele
 * @version 1.0
 */
public class Libro {

    private String titolo;
    private Autore autore;
    private int numeroPagine;
    private static double costoPagina = 0.05;
    private static final double COSTO_FISSO = 5.5;

    /**
     * Il metodo libro e' il metodo costruttore della classe
     * @param titolo variabile che contiene il titolo del libro
     * @param autore oggetto che contiene il nome e il cognome dell'autore del libro
     * @param numeroPagine varibile che contiene il numero totale delle pagine del libro
     */
    public Libro(String titolo, Autore autore, int numeroPagine) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
    }

    /**
     * Il metodo setCostoPagina stabilisce il costo della pogina
     * @param costo
     */
    public static void setCostoPagina(double costo) {
        costoPagina = costo;
    }

    /**
     * Il metodo getCostoPagina restituisce il costo per ogni pagina
     * @return costoPagina
     */
    public static double getCostoPagina() {
        return costoPagina;
    }

    /**
     * Il metodo getCostoFisso restituisce il costo di default impostato a 5.5
     * @return COSTO_FISSO
     */
    public static double getCostoFisso() {
        return COSTO_FISSO;
    }

    /**
     * Il metodo getTitolo restituisce il titolo del libro
     * @return titolo
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * Il metodo getAutore restituisce nome e cognome dell'autore del libro
     * @return autore
     * @see Autore
     */
    public Autore getAutore() {
        return autore;
    }

    /**
     * Il metodo getNumeroPagine restituisce il numero delle pagine
     * @return numeroPagine
     */
    public int getNumeroPagine() {
        return numeroPagine;
    }

    /**
     * Il metodo getPrezzo restituisce il calcolo del prezzo totale del libro
     * @return COSTO_FISSO + numeroPagine * costoPagina
     */
    public double getPrezzo() {
        return COSTO_FISSO + numeroPagine * costoPagina;
    }

    /**
     * Il metodo toString stampa una stringa contente tutte le informazioni del libro
     * @return s
     */
    @Override
    public String toString() {
        String s = "";
        s = "'" + titolo + "' di " + autore +
                ", numeroPagine=" + numeroPagine +
                ", prezzo=" + getPrezzo() + "\n";
        return s;
    }
}