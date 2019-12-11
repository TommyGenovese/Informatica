public class Videoteca {
    private String nome;
    private String indir;

    public void add(Cassetta c){

    }

    public void vendo(int codice){

    }
    public String getNome() {
        return nome;
    }
    public String getIndir() {
        return indir;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIndir(String indir) {
        this.indir = indir;
    }

    public double getValoreNegozio(){
        this.getValoreNegozio()= this.getValoreNegozio() +
                DVD.getPrezzo()-DVD.getPrezzo()/Cassetta.getSconto();
        return getValoreNegozio();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
