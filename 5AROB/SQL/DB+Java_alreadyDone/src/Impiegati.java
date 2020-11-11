package eu.itiscuneo;
public class Impiegati {
    private String nome;
    private String cognome;
    private String citta;

    public Impiegati() {
        this.nome = "Default";
        this.cognome= "Default";
        this.citta= "Default";
    }

    //get
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCitta() {
        return citta;
    }

    //set, non del nome e del cognome perchè la persona "non può" cambiare il suo nome
    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public String toString() {
        return "Impiegati{"
                + "nome: "+ nome
                + "cognome: " + cognome
                + "citta: " + citta;
    }
}
