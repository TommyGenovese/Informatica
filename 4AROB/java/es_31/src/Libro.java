public class Libro {
    private int numPagine;
    private static final int PAGE_DEF = 50;

    public Libro(int numPagine){
        if(numPagine>5){
            this.numPagine = numPagine;
        }else
            this.numPagine = PAGE_DEF;
    }
    public Libro(){

    }

    public void pageMessage(){
        System.out.println("il numero di pagine e': "+ numPagine);
    }

    public int getNumPagine() {
        return numPagine;
    }

    public void setNumPagine(int numPagine) {
        if(numPagine>5) {
            this.numPagine = numPagine;
        }else
            this.numPagine = PAGE_DEF;
    }

    public String toString(){
        return "il numero di pagine del libro e': " + numPagine;
    }
}
