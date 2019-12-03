public class Lavoratore {
    private String name;
    private int level;
    private int salary;

    public Lavoratore(String name, int level, int salary){
        this.name=name;
        this.level=level>=0?level:0;
        this.salary=salary>=0?salary:0;
    }

    public Lavoratore(String name, int level){
        this.name=name;
        this.level=level>=0?level:0;
        salary=0;
    }

    @Override
    public String toString() {
        return "\nNome: " + name + "\n\tLivello: " + level + "\n\tSalario: " + salary;
    }

    public String stampaStipendio(){
        return "\nSalario: " + salary;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setLevel(int level) {
        this.level=level>=0?level:0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary=salary>=0?salary:0;
    }
}