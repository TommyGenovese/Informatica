public class Eccez_Controllata extends Exception{
    private String s;

    public Eccez_Controllata(String s){
        super(s); //s= messaggio di errore
    }

    public Eccez_Controllata(){
        super("Errore di formato del tempo");
    }
}
