
//Dichiarare una classe di nome “temperatura” che ha come attributo la temperatura in gradi
// centigradi (temp e imetodi getGradiC e setGradiC). Definire un costruttore per
// inizializzare la temperatura, e un metodo (getGradiF)per convertire la temperatura
// da gradi centigradi a Fahrenheit, sapendo che: F = 32 + ( 9 * C / 5)


public class Temperatura {
    private float gradiC;

    public Temperatura(float gradiC){
        this.gradiC= gradiC;
    }

    public float getGradiF(){
        return 32+(9* gradiC/5);
    }

    public float getGradiC() {
        return gradiC;
    }

    public void setGradiC(float gradiC) {
        this.gradiC = gradiC;
    }
}
