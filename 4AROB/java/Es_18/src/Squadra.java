public class Squadra {
    private String nome;
    private Giocatori[] giocatori;
    private final int N_MAX_GIOCATORI=15;
    private int n_giocatori;

    public Squadra(String nome){
        giocatori= new Giocatori[N_MAX_GIOCATORI];
        this.nome=nome.toUpperCase();
        this.n_giocatori=0;
    }

    public void addGiocatore(Giocatori g){
        if(n_giocatori<N_MAX_GIOCATORI){
            giocatori[n_giocatori]=g;
        }
        n_giocatori++;
    }

    public void setPunteggio(String nome,Double punteggio){
        int n,trovato;
        n=0;
        trovato=0;

        while (n<n_giocatori && trovato==0 ){

            if(nome.equals(giocatori[n].getNome())){
                trovato=n;
            }
            n++;
        }
        giocatori[n].setPunteggo(punteggio);
    }

    public double getPunteggioMedio() {
        double pm;
        pm = 0;
        if (n_giocatori > 0) {
            for (int n = 0; n < n_giocatori; n++) {
                pm += giocatori[n].getPunteggo();
            }
            pm = pm / n_giocatori;


        }
        return pm;
    }

    public void passaAnno(){

        for (int k=0;k<n_giocatori;k++){
            giocatori[k].setEta(giocatori[k].getEta());
        }
    }

    public String toString(){
        String s;

        s=" ";

        for (int k=0;k<n_giocatori;k++){
            s+=giocatori[k].toString();
        }
        return "\n squadra : "  + nome + "\n" + s + "\n" + "punteggio medio : " + " " + getPunteggioMedio();
    }

}
