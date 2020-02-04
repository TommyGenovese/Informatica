public class EccezioneVettVuoto extends Exception {
    private String s = "Errore, vettore vuoto";

    public EccezioneVettVuoto(String s){
        super(s); //s= messaggio di errore
    }

    public EccezioneVettVuoto(){
        super("Errore, vettore vuoto");
    }
}
