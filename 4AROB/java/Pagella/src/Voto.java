public class Voto {

    private Data giorno; //giorno in cui è stato assegnato il voto
    private float voto;  //decimale compreso fra 0 e 10
    private float peso;  //peso del voto inserito
    private char tipo;   //tipo di valutazione 'o', 's', 'p'

    public Voto(Data giorno, float voto, float peso, char tipo){
        this.giorno = giorno;
        /*this.voto = (voto>0 && voto<10) ? voto : 1f;
        this.peso = peso;
        this.tipo = tipo;*/

        if (voto>=0 && voto <=10)
            this.voto=voto;
        else
            this.voto=0;
        if (peso>=0)
            this.peso = peso;
        else
            this.peso = 1;
        if (tipo == 's' || tipo == 'o' || tipo == 'p')
            this.tipo = tipo;
        else
            this.tipo = 'o';
    }

    @Override
    public String toString() {
        return this.giorno.toString() +
            String.format(": %.2f (%.2f) %c", this.voto, this.peso, this.tipo);
    }

    public  Data getGiorno(){
        return giorno;
    }

    public char getTipo() {
        return tipo;
    }

    public float getPeso(){
        return peso;
    }

    public float getVoto() {
        return voto;
    }

    public void setGiorno(Data giorno) {
        this.giorno = giorno;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setVoto(float voto) {
        this.voto = voto;
    }
}
