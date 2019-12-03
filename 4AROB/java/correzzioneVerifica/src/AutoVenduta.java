public class AutoVenduta {
    private String modello;
    private float cilindrata;
    private float prezzoVendita;

    public AutoVenduta(String modello, float cilindrata, float prezzoVendita){
        this.modello = modello;
        if(cilindrata>=500 && cilindrata<=5000){
            this.cilindrata = cilindrata;
        }else{
            this.cilindrata = 1000;
        }
        if(prezzoVendita>0) {
            this.prezzoVendita = prezzoVendita;
        }else{
            this.prezzoVendita = 500;
        }
    }
    public String getModello(){
        return modello;
    }
    public void setModello(String modello){
        this.modello = modello;
    }
    public float getCilindrata(){
        return cilindrata;
    }
    public void setCilindrata(float cilindrata){
        if(cilindrata>=500 && cilindrata<=5000){
            this.cilindrata = cilindrata;
        }else{
            this.cilindrata = 1000;
        }
    }
    public float getPrezzoVendita() {
        return prezzoVendita;
    }

    public void setPrezzoVendita(float prezzoVendita) {
        this.prezzoVendita = prezzoVendita;
    }
    public String toString(){
        return "\nmodello: " + modello + "\ncilindrata: " + cilindrata + "\nprezzo vendita: " + prezzoVendita;
    }

    public boolean isPiuCara(AutoVenduta a){
        boolean ciao;
        if(prezzoVendita > a.getPrezzoVendita()){
            ciao = true;
        }else{
            ciao = false;
        }
        return ciao;
    }
}
