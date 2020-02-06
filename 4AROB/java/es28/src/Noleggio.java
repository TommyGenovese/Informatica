import java.util.Arrays;
import java.util.GregorianCalendar;

public class Noleggio {
    private static int MAX_ProdottiS = 10000;
    private Prodotti[] Prodottis = new Prodotti[MAX_ProdottiS];
    private int i;  //Prodottis counter

    public Noleggio(){
        this.i = 0;
    }

    public void add(Prodotti film){
        if(i<=MAX_ProdottiS){
            Prodottis[i] = new Prodotti(film.title(), film.genre(), film.dailyPrice());
        }
        else System.out.println("Limite film raggiunto");
        i++;
    }

    public void takeFilm(String client, String name){
        boolean found = false;
        for(int k = 0; k < i; k++){
            if ((Prodottis[k].title()).equals(name)){
                Prodottis[k].taken(false);
                Prodottis[k].client(client);
                found = true;
            }
        }
        if(!found) System.out.println("filme doesn't exist!");
    }

    public void deleteFilm(int p){
        if (p<= i){
            for (int k = p; k < -1; k++){
                Prodottis[k] = Prodottis[k+1];
            }
        }else{
            System.out.println("array index out of bound");
        }
        i--;
    }

    public String takenFilm(){
        String out = "";
        for (int k = 0; k < MAX_ProdottiS; k++){
            out += (Prodottis[k].taken()) ? Prodottis[k].toString(): "";
            out += String.format("\n");
        }
        return out;
    }

    public String takenFilm(String name){
        String out = "";
        for (int k = 0; k < MAX_ProdottiS; k++){
            out += (Prodottis[k].taken() && (Prodottis[k].client()).equals(name)) ? Prodottis[k].toString(): "";
            out += String.format("\n");
        }
        return out;
    }

    @Override
    public String toString() {
        String out = "";
        for (int k = 0; k < i; k++){
            out += String.format("%s\n", Prodottis[k].toString());
        }
        return out;
    }
}