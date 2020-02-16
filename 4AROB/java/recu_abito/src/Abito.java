public class Abito {
    private String taglia;
    private float prezzo;
    private int quantità;

     Abito(String taglia, float prezzo, int quantità){

        if(taglia.equals("XS") || taglia.equals("S") || taglia.equals("M") || taglia.equals("L") || taglia.equals("XL")){
            this.taglia = taglia;
        }else{

        }
        this.prezzo = (prezzo>=0 ? prezzo : 0);

        if(quantità<=0){
            this.quantità=1;
        }else{
            this.quantità=quantità;
        }
    }

    public void setPrezzo(float prezzo) {
        if(prezzo<=0){
            this.prezzo=5;
        }else{
            this.prezzo=prezzo;
        }
    }
    public void setQuantità(int quantità) {
        if(quantità<=0){
            this.quantità=1;
        }else{
            this.quantità=quantità;
        }
    }
    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }

    public String getTaglia() {
        return taglia;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public int getQuantità() {
        return quantità;
    }

    public String toString() {
        return "la taglia è una " + taglia + ", ne hai presi " + quantità + " al prezzo di €" + prezzo+ " ciascuno ";
    }
}
