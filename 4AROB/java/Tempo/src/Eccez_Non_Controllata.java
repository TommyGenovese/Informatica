public class Eccez_Non_Controllata extends RuntimeException {
    public String s;

    public Eccez_Non_Controllata(String s){
        super(s); //s= messaggio di errore
    }

    public Eccez_Non_Controllata(){
        super("Errore di formato del tempo");
    }

}
