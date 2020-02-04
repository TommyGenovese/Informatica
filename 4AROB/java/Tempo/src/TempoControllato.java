public class TempoControllato {
    private int ora;
    private int min;
    private int sec;

    public TempoControllato(){

    }
    public void Tempo(int ora, int min){

    }
    public void Tempo(int ore, int min, int sec){

    }
    public int getOra() {
        return ora;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public void setOra(int ora) throws Eccez_Controllata {
        if(ora>=0 && ora<24) {
            this.ora = ora;
        }else{
            throw new Eccez_Controllata("Ora sbagliata");
        }
    }

    public void setMin(int min) throws Eccez_Controllata {
        if(min>-1 && min<60){
            this.min = min;
        }else
            throw new Eccez_Controllata("Minutaggio sbagliato");
    }

    public void setSec(int sec) throws Eccez_Controllata {
        if(sec>-1 && sec<60) {
            this.sec = sec;
        }else
            throw new Eccez_Controllata("secondi scorretti");
    }
}

