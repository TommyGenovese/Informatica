public class Materia {
    private String nome;
    private  int nVoti;
    private final int NMAXVOTI = 10;
    private Voto[] voti;

    public Materia(String nome){
        this.nome = nome;
        nVoti=0;
        voti = new Voto[NMAXVOTI];
    }

    public String toString() {
        String stampa=" ";
        int i;
        for(i=0;i<nVoti;i++){
            stampa= stampa + String.format("\n\t") + voti[i].toString();
        }
        return String.format("Voti della materia %s:",nome) + stampa + String.format("\n");
    }

    public void aggiungiVoto(Voto v){
        if(nVoti<NMAXVOTI){
            voti[nVoti]=v;
            nVoti++;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getnVoti() {
        return nVoti;
    }
}