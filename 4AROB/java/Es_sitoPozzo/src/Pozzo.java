public abstract class Pozzo {
    private int codice;
    private float cap;
    private boolean attivo;

    public Pozzo(){
        this.attivo = true;
    }
    public void attiva(){
        this.attivo = true;
    }

    public void spegni(){
        this.attivo = false;
    }

}
