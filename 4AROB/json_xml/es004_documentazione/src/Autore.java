/**
 * Classe che rappresenta l'Autore: nome e cognome
 *
 * <pre>
 * Autore a = new Autore(Carlo, Collodi);
 * </pre>
 * @author Genovese Tommaso, Bruno Luca, Cuniberti Andrea, Bagnis Gabriele
 * @version 1.0
 */

public class Autore {
    private String nome;
    private String cognome;

    /**
     *Questo è il costruttore della classe Autore
     * @param nome  Nome dell'autore
     * @param cognome Cognome dell'autore
     */
    public Autore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    /**
     *
     * @return ritorna il nome dell'Autore
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @return ritorna il cognome dell'Autore
     */
    public String getCognome() {
        return cognome;
    }

    /**
     *restituisce il nome+ il cognome dell'Autore
     * @return ritorna una stringa con il nome e il cognome dell'Autore
     */
    @Override
    public String toString() {
        return  nome + cognome;
    }
}
