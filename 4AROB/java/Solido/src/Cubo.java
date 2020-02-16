public class Cubo extends Solido {
    double lato;
    public Cubo(double pesoSpecifico, double lato){
        super(pesoSpecifico);
        this.lato = lato;
    }
    //codice di luca bruno

    public double getLato(){
        return lato;
    }

    @Override
    public double superfice() {
        return lato * lato * 6;
    }

    @Override
    public double volume() {
        return lato*lato*lato;
    }
}

