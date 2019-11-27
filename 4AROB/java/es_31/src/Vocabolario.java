public class Vocabolario extends Libro {
    private int numDefinizioni;
    private float avePage;
    private static final int DEFIN_DEF = 1000;

    public Vocabolario(int numDefinizioni, int numPagine){
        super(numPagine);
        if(numDefinizioni>0)
            this.numDefinizioni = numDefinizioni;
        else
            this.numDefinizioni = DEFIN_DEF;
    }

    public void definitionMessage(int numDefinizioni, int numPagine){
        pageMessage();
        System.out.println(numDefinizioni);
        System.out.println(numDefinizioni/getNumPagine());
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
