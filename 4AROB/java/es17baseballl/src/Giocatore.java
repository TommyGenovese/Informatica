//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
import java.lang.*;

public class Giocatore {
    private String name;
    private int eta;
    private double punteggio;

    public Giocatore(String name, int eta) {
        this.name = name;
        this.eta = eta;
        if (eta < 15 && eta > 30) {
            this.eta = 20;
        } else {
            this.eta = eta;
        }

    }

    public Giocatore(String name, int eta, double punteggio) {
        this.name = name;
        this.eta = eta;
        this.punteggio = punteggio;
        if (eta < 15 && eta > 30) {
            this.eta = 20;
        } else {
            this.eta = eta;
        }

        if (punteggio < 0.0D && punteggio > 10.0D) {
            this.punteggio = 5.0D;
        } else {
            this.punteggio = punteggio;
        }

    }

    @Override
    public String toString() {

        return "\n nome: "+ name + "\neta': " + eta + "\npunteggio: " + punteggio;
    }

    public String getName() {
        return this.name;
    }

    public int getEta() {
        return this.eta;
    }

    public double getPunteggio() {
        return this.punteggio;
    }

    public void setPunteggio(double punteggio) {
        this.punteggio = punteggio;
    }
}
