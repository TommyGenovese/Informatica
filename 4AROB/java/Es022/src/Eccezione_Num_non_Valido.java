public class Eccezione_Num_non_Valido extends Exception{
    private String s = "numero non intero, non valido";

    public Eccezione_Num_non_Valido(String s){
        super(s); //s= messaggio di errore
    }

    public Eccezione_Num_non_Valido(){
        super("Errore numero inserito non corretto, inserisci un intero");
    }
}
