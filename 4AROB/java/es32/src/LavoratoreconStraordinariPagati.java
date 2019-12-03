public class LavoratoreconStraordinariPagati extends Lavoratore{
    private int oreStraordinario;
    private static final double retribuzioneOraria = 10.0;

    public LavoratoreconStraordinariPagati(String name, int level, int salary, int oreStraordinario){
        super(name, level, salary);
        this.oreStraordinario=oreStraordinario>=0?oreStraordinario:0;
    }

    public LavoratoreconStraordinariPagati(String name, int level, int oreStraordinario){
        super(name, level);
        this.oreStraordinario=oreStraordinario>=0?oreStraordinario:0;
    }

    public void setOreStraordinario(int oreStraordinario) {
        this.oreStraordinario=oreStraordinario>=0?oreStraordinario:0;
    }

    @Override
    public String stampaStipendio() {
        return "\nSalario: "+ (getSalary() + (oreStraordinario*retribuzioneOraria));
    }

    @Override
    public String toString() {
        return "\n\tNome: " + getName() + "\n\t\tLivello: " + getLevel() + "\n\t\tSalario: " + (getSalary() + (oreStraordinario*retribuzioneOraria));
    }
}