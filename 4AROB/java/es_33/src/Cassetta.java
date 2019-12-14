public class Cassetta {

    protected int codice;
    protected String titolo;
    protected int durataSec;
    protected static double sconto;
    protected int nCopie;

    public Cassetta(String titolo, int durataSec){
        this.titolo = titolo;
        this.durataSec = durataSec;
    }

    public String getTitolo(){
        return titolo;
    }
    public int getDurataSec(){
        return durataSec;
    }
    public static double getSconto(){
        return sconto;
    }

    public void setSconto(double percentuale){
        this.sconto = percentuale;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
