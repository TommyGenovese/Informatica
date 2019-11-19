
public class Pagella {
    private int periodo;
    private int nMaterie;
    private final int NMAXMATERIE = 15;
    private Materia[] materie;

    public Pagella(int periodo) {
        this.periodo = periodo;
        this.nMaterie = 0;
        this.materie = new Materia[15];
    }

    public String toString() {
        String stampa = " ";

        for(int i = 0; i < this.nMaterie; i++) {
            stampa = stampa + String.format("\n\t") + this.materie[i].toString();
        }
        String var10000 = String.format("pagella del %d periodo:", this.periodo);
        return var10000 + stampa + String.format("\n");
    }

    public void aggiungiMateria(Materia materia) {
        if (this.nMaterie < 15) {
            this.materie[this.nMaterie] = materia;
            ++this.nMaterie;
        }

    }

    public void aggiungiVotoMateria(String materia, Voto v) {
        for(int i = 0; i < this.nMaterie; ++i) {
            if (materia.equals(this.materie[i].getNome())) {
                this.materie[i].aggiungiVoto(v);
            }
        }

    }

    public int getPeriodo() {
        return this.periodo;
    }

    public int getNMaterie() {
        return this.nMaterie;
    }
}
