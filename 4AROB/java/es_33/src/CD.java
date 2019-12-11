public class CD extends Cassetta {

    private static double prezzo;
    private int nBrani;

    public CD(String titolo, int durataSec, int nBrani){
        super(titolo, durataSec);
        this.nBrani=nBrani;
    }

    public int getNBrani(){
        return nBrani;
    }
    public static double getPrezzo(){
        return prezzo;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
