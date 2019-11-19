public class Test {
    public static void main(String[] args) {

        Squadra g2;
        Giocatori g;
        Giocatori g3;

        Squadra g1 ;
        Giocatori g4;
        Giocatori g5;

        g2 = new Squadra("Polli");

        g = new Giocatori("pietro",22,64,"rICEVITORE");
        g3 = new Giocatori("luca",17,55,"battitore");

        g2.addGiocatore(g3);
        g2.addGiocatore(g);

        g1 = new Squadra("Galli");

        g4 = new Giocatori("yuri",99,78,"battitore");
        g5 = new Giocatori("shekawat",21,45,"Ricevitore");

        g1.addGiocatore(g4);
        g1.addGiocatore(g5);

        System.out.println(g2);
        System.out.println(g1);

    }
}
