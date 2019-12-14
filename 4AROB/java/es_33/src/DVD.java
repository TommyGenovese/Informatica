public class DVD extends Cassetta {

    private static double prezzo;
    private int nLingue;
    private TipoLingua lingue;

    public DVD(String titolo, int durataSec){
        super(titolo, durataSec);
    }

    public void addLingua(TipoLingua lingue){
        if(nLingue<5){
            nLingue++;
            this.lingue = lingue;
        }else
            System.out.println("numero massimo di lingue raggiunto," +
                    " impossibile inserire la nuova lingua");
    }

    public int getNLingue(){
        return nLingue;
    }
    public static double getPrezzo(){
        return prezzo;
    }
    public TipoLingua getLingue(){
        return lingue;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return super.toString() + "numero lingue: "+ nLingue;
    }
}
