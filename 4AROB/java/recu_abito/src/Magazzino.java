public class Magazzino {
    private String nome;
    private Abito[] articoli;
    private int nArticoli;
    private static final int MAX_ARTICOLI = 1000;

    public Magazzino(String nome) {
        this.nome = nome;
        articoli = new Abito[MAX_ARTICOLI];
        nArticoli = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getnArticoli() {
        return nArticoli;
    }

    public void addArticolo(Abito a){
        if(nArticoli < MAX_ARTICOLI){
            articoli[nArticoli] = a;
            nArticoli ++;
        }
    }

    public void sottoScorta(String tipo, int soglia){
        for(int k=0; k<nArticoli; k++){
            if(tipo.equals("giacca")){
                if(articoli[k] instanceof Giacca && articoli[k].getQuantità() < soglia){
                    System.out.println(articoli[k].toString());
                }
            }else{ //pantalone
                if(articoli[k] instanceof Pantalone && articoli[k].getQuantità() < soglia){
                    System.out.println(articoli[k].toString());
                }
            }
            ((Giacca)articoli[k]).getImbottitura();
        }
    }
}
