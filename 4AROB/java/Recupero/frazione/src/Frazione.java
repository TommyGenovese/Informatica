public class Frazione {
    private int numer;
    private int denom;
    private char segno;
    private final char SEG_DEF = '+';
    private final int ZERO = 0;

    public Frazione(int numer, int denom, int segno){
        if(denom==0){
            this.denom=ZERO;
        }else{
            this.denom = denom;
        }
    }

    public int getNumer() {
        return numer;
    }

    public int getDenom() {
        return denom;
    }

    public char getSegno(){
        return segno;
    }

    public void setNumer(int numer) {
        if(numer==0){
            this.numer=1;
        }else{
            this.numer = numer;
        }
    }

    public void setDenom(int denom) {
        if(denom==0){

            this.denom=1;
        }else{
            this.denom = denom;
        }
    }

    public void setSegno(char segno){
        if(segno != '-' || segno != '+'){
            this.segno = SEG_DEF;
        }else{
            this.segno = segno;
        }
    }

    public float getValore(){
        float valore;
        valore = (float)numer/denom;
        if(segno != '+'){
            valore = -valore;
        }
        return valore;
    }

    public boolean isIntero(){
        boolean intero = false;
        if(numer%denom == 0){
            intero = true;
        }
        return intero;
    }

    public String toString(){
        return "il rapport fra "+ numer + " e " + denom + " è: " + (numer/denom);
    }
}
