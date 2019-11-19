public class Telecomando {
    private int canale;
    private boolean acceso;
    private int volume;
    private final int CANALEMAX=100;
    private final int VOLUMEMAX=50;

    public Telecomando(){
        this.canale=1;
        this.volume=25;
        this.acceso=false;
    }

    public int setgetCanale(int canale) {
        if(canale>0&&canale<=CANALEMAX) {
            this.canale = canale;
        }
        return this.canale;
    }

    public int setgetCanale() {
        return this.canale;
    }

    public int getVolume() {
        return volume;
    }

    public void premiOnOff(){
        if(acceso==true) {
            acceso = false;
        }else{
            acceso = true;
        }
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void canaleSu() {
        if(this.canale<CANALEMAX){
            this.canale++;
        }
    }

    public void canaleGiu() {
        if(this.canale>1){
            this.canale--;
        }
    }

    public void volumeSu() {
        if(this.volume<VOLUMEMAX){
            this.volume++;
        }
    }

    public void volumeGiu() {
        if(this.volume>0){
            this.volume--;
        }
    }

    public void muto() {
        this.volume = 0;
    }
}