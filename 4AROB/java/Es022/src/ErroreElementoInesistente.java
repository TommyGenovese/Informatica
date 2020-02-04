public class ErroreElementoInesistente extends RuntimeException{
    private String s = "Elemento inesistente";

    public ErroreElementoInesistente(String s){
        super(s); //s= messaggio di errore
    }

    public ErroreElementoInesistente(){
        super("Errore elemento inesistente");
    }
}
