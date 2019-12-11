public class Cassetta {

    private int codice;
    private String titolo;
    private int durataSec;
    private static double sconto;
    private int nCopie;

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

}
