import java.lang.management.GarbageCollectorMXBean;
import java.util.GregorianCalendar;

public class Prodotti {
    private String title;
    private String genre;
    private String client;
    private float dailyPrice;
    private boolean taken;
    private GregorianCalendar date1;
    private GregorianCalendar date2;

    public Prodotti(){
        this.title = "";
        this.genre = "";
        this.client  = "";
        this.dailyPrice = 2.5f;
        this.taken = false;
    }

    public Prodotti(String title, String genre, float dailyPrice){
        this.title = title;
        this.genre = (genre.equals("horror") || genre.equals("bambini") || genre.equals("dramma") || genre.equals("avventura")) ? genre : "none";
        this.client  = "";
        this.dailyPrice = (dailyPrice>0) ? dailyPrice: 2.5f;
        this.taken = false;
    }

    public String title(){
        return this.title;
    }

    public String genre(){
        return this.genre;
    }

    public String client(){
        return this.client;
    }

    public float dailyPrice(){
        return this.dailyPrice;
    }

    public boolean taken(){
        return taken;
    }

    public void title(String title){
        this.title = title;
    }

    public void genre(String genre){
        this.genre = (genre.equals("horror") || genre.equals("bambini") || genre.equals("dramma") || genre.equals("avventura")) ? genre : "none";
    }

    public void client(String s){
        this.client = client;
    }

    public void dailyPrice(float dailyPrice){
        this.dailyPrice = (dailyPrice > 0) ? dailyPrice: 2.0f;
    }

    public void taken(boolean taken) {
        this.taken = taken;
    }

    @Override
    public String toString() {
        return String.format("|%s|\t\t\t(%s)\t->\t%s\t" , this.title, this.genre, this.client);
    }
}