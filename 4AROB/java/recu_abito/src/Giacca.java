public class Giacca extends Abito{
    private TipoImbottitura imbottitura;

     Giacca(String taglia, float prezzo, int quantità, TipoImbottitura imbottitura) {
        super(taglia, prezzo, quantità);
        this.imbottitura=imbottitura;
    }

    public TipoImbottitura getImbottitura() {
        return imbottitura;
    }

    public String toString() {
        return super.toString() + "la giacca è "+ imbottitura;
    }
}
