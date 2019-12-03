public class Vocabolario extends Libro {
    private int numDefinizioni;
    private static final int DEFIN_DEF = 1000;

    public Vocabolario(int numDefinizioni, int numPagine){
        super(numPagine);
        if(numDefinizioni>0)
            this.numDefinizioni = numDefinizioni;
        else
            this.numDefinizioni = DEFIN_DEF;
    }

    public void definitionMessage(){
        pageMessage();
        System.out.println("il numero di definizioni e': " + numDefinizioni);
        System.out.println("il numero di definizioni media per pagina e': " + numDefinizioni/getNumPagine());
    }

    public int getNumDefinizioni(){
        return numDefinizioni;
    }
    public void setNumDefinizioni(int numDefinizioni){
        if(numDefinizioni>0)
            this.numDefinizioni = numDefinizioni;
        else
            this.numDefinizioni = DEFIN_DEF;
    }

}
