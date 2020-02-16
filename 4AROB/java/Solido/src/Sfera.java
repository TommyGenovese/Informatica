public class Sfera extends Solido{
    double raggio;

    public Sfera(double pesoSpecifico, double lato){
        super(pesoSpecifico);
        this.raggio = raggio;
    }

    @Override
    public double superfice() {
        return 4*Math.PI * raggio * raggio;
    }

    @Override
    public double volume() {
        return 4.0/3* Math.PI * raggio*raggio*raggio;
    }
}
