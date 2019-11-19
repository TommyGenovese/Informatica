public class Giocatori {
    private String nome;
    private double punteggio;
    private int eta;
    private String ruolo;

    public Giocatori(String nome,int eta){

        this.nome=nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();

        if (eta<10 || eta>50){
            this.eta=20;
        }else{
            this.eta=eta;
        }
    }

    public Giocatori(String nome,int eta,int punteggio,String ruolo){

        this.nome=nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();

        if (eta<10 || eta>50){
            this.eta=23;
        }else{
            this.eta=eta;
        }


        if(punteggio<40 || punteggio>100){
            this.punteggio=70;
        }else{
            this.punteggio=punteggio;
        }

        ruolo=ruolo.toUpperCase();

        this.ruolo=ruolo;
    }

    public String getNome(){

        return nome;

    }

    public double getPunteggo(){

        return punteggio;

    }

    public int getEta(){

        return eta;

    }

    public String getRuolo(){

        return ruolo;

    }

    public void setEta(int eta) {
        this.eta = eta+1;
    }

    public void setPunteggo(double nuovoPunteggio){

        if(nuovoPunteggio<40 && nuovoPunteggio>100){
            nuovoPunteggio=40;
        }

        this.punteggio=nuovoPunteggio;

    }

    public String toString(){

        return "\n nome :" + nome + " " + " \n punteggio : " + punteggio + " " +  "\n eta : " + eta + " " + "\n ruolo:" + ruolo +  "\n";

    }

}
