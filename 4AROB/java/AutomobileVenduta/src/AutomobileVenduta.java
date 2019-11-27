public class AutomobileVenduta {
    private String modello;
    private int cilind;
    private float prezzo;
    private final int CILMAX = 5000;
    private final int CILMIN = 500;

    public void AutomobileVenduta(String modello, int cilind, float prezzo){
        this.modello = modello;
        if(cilind<=CILMAX && cilind>=CILMIN)
            this.cilind=cilind;
        else
            this.cilind = CILMIN;
        if (prezzo>=0){
            this.prezzo = prezzo;
        }else
            this.prezzo = 0;
    }

    public int getCilind(){ return cilind;}

    public float getPrezzo() {
        return prezzo;
    }

    public String getModello(){return modello;}

    public void setCilind(int cilind) {
        if(cilind<=CILMAX && cilind>=CILMIN)
            this.cilind=cilind;
        else
            this.cilind = CILMIN;
    }

    public void setPrezzo(float prezzo) {
        if (prezzo>=0)
            this.prezzo = prezzo;
        else
            this.prezzo = 0;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public boolean isPiùCara(AutomobileVenduta a){
        if(a.)
    }

    @Override
    public String toString() {
        return modello + "-" + cilind + "€" + prezzo;
    }
}
