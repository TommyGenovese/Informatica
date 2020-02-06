import java.util.GregorianCalendar;

public class test {
    public static void main(String[] args) {
        Noleggio noleggio = new Noleggio();


        Prodotti tarzan = new Prodotti();
        Prodotti nemo = new Prodotti();

        noleggio.add(tarzan);
        noleggio.add(nemo);

        noleggio.takeFilm("Tommy","Madagascar");

        System.out.println(noleggio.takenFilm());
    }

}