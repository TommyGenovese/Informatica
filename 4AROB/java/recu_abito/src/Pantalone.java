public class Pantalone extends Abito{
    private TipoTessuto tessuto;

     Pantalone (String taglia, float prezzo, int quantità, TipoTessuto tessuto){
        super(taglia, prezzo, quantità);
            this.tessuto = tessuto;
    }

    public TipoTessuto getTessuto() {
        return tessuto;
    }

    public String toString() {
        return super.toString() + "i pantaloni sono "+ tessuto;
    }
}
