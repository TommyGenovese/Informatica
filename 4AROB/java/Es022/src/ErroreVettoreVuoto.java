public class ErroreVettoreVuoto extends Exception {
    private String s = "Errore, vettore vuoto";

    public ErroreVettoreVuoto(String s){
        super(s); //s= messaggio di errore
    }

    public ErroreVettoreVuoto(){
        super("Errore, vettore vuoto");
    }
}
