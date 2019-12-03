public class Venduta {
    private final int DIM = 1000;
    private String nome;
    private String cognome;
    private AutoVenduta vendute[] = new AutoVenduta[DIM];
    private float media;
    private int k = 0;

    public Venduta(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public AutoVenduta getVenduta(int x){
        return vendute[x];
    }
    public void add(AutoVenduta a){
       vendute[k] = a;
       k++;
    }
    public void getMediaPrezzo(){
        float somma;
        int i;
        somma = 0;
        for(i = 0; i < k; i++){
            somma = somma + vendute[i].getPrezzoVendita();
        }
        media = somma / i;
    }
    public String toString(){
        String ciao;

        ciao = "\nnome: " + nome + "\ncognome: " + cognome;
        for(int i = 0; i<k; i++){
            ciao = ciao + "\n\nauto n." + (i+1);
            ciao = ciao + "\nmodello auto: " + vendute[i].getModello() + "\ncilindrata: " + vendute[i].getCilindrata() + "\nprezzo: "+ vendute[i].getPrezzoVendita();
        }
        ciao = ciao + "\n\nmedia prezzi= " + media;
        return ciao;
    }
}
