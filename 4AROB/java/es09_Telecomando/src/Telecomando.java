public class Telecomando {
    private int canale;
    private String acceso;
    private int volume;
    private final int VOLUME_MAX = 100;
    private final int CANALE_MAX = 10;

    public Telecomando(){
        canale = 1;
        acceso = "no";
        volume = 100;
    }

    @Override
    public String toString() {
        return "\n" + "Canale: " + canale + "\n" + "Acceso: " + acceso + "\n" + "Volume: " + volume + "\n";
    }

    public void setCanaleUp() {
        canale=canale+1;
        if (canale>CANALE_MAX){
            canale=1;
        }
    }

    public void setCanaleDown() {
        canale=canale-1;
        if (canale==0){
            canale = CANALE_MAX;
        }
    }

    public void setCanale(int canale) {
        if (canale>0 && canale<=CANALE_MAX) {
            this.canale = canale;
        }
    }

    public int getCanale() {
        return canale;
    }

    public void setVolumeUp() {
        volume=volume+1;
        if (volume>VOLUME_MAX){
            volume=VOLUME_MAX;
        }
    }

    public void setVolumeDown() {
        volume=volume-1;
        if (volume<0){
            volume = 0;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public String getAcceso() {
        return acceso;
    }
}