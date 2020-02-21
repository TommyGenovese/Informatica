public class Test {
    public static void main(String[] args) throws ValoreNonValido {
        Compagnia spacex = new Compagnia("SpaceX");
        Sito sit = new Sito("Petroliera potente", "america");
        PozzoMarino pozzo_nel_mare = new PozzoMarino(270.0f,25);
        PozzoTerrestre pozzo_sulla_terra = new PozzoTerrestre(12, TipoTerreno.ROCCIOSO);

        System.out.println(pozzo_nel_mare.toString());
        System.out.println(pozzo_sulla_terra.toString());

        sit.addPozzo(pozzo_nel_mare);
        pozzo_sulla_terra.spegni();
        sit.addPozzo(pozzo_sulla_terra);

        spacex.addSito(sit);

        System.out.println(spacex.toString());

        System.out.println(sit.greggioAnnuo());

    }
}
