import java.util.Vector;

public class test {
    public static void main(String[] args) {
        Vector <Solido> solidi = new Vector<Solido>();

        solidi.add(new Cubo(1.0, 3.0));
        solidi.add(new Sfera(1.0, 3.0));

        for(int k=0;k<solidi.size(); k++){
            System.out.println("peso: (luca bruno ha scritto questo codice) " + solidi.get(k).peso());

        }
    }
}
