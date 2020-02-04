import java.util.Vector;

public class carburante {
    private Vector <Float> costi;

    private float average;
    private float max;
    private float min;

    public carburante(){
        costi = new Vector<Float>();

        this.average = 0;
        this.max = 0;
        this.min = 0;
    }

    public void add(float value){
        costi.add(value);
    }

    @Override
    public String toString() {

        String out = "|";

        for (float p : costi){
            out += String.format("%f|\t" , p);
        }

        return out;
    }

    public float average(){
        float m = 0;

        for (int i = 0; i < costi.size(); i++){
            m += costi.elementAt(i);
        }

        return m/costi.size();
    }

    public float min() throws Exception{
        float min = costi.elementAt(0);

        if(costi.elementAt(0) == null) {
            for (int i = 1; i < costi.size(); i++) {
                min = (costi.elementAt(i) < min) ? costi.elementAt(i) : min;
            }
        }else{
            throw new EccezioneVettVuoto("Vettore vuoto, impossibile trovare il minimo");
        }
        
        return min;
    }

    public float max(){
        float min = costi.elementAt(0);
        
        for (int i = 1; i < costi.size(); i++){
            min = (costi.elementAt(i)>min) ? costi.elementAt(i): min;
        }
        return min;
    }
}