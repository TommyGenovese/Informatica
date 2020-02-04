public class Cerchio {
    private float raggio;

    private final float  RAG_DEF = 0;

    public Cerchio(float raggio){
        if(raggio>=0){
            this.raggio= raggio;
        }else{
            this.raggio = RAG_DEF;
        }
    }

    public float getRaggio() {
        return raggio;
    }

    public void setRaggio(float raggio) {
        if(raggio>=0){
            this.raggio= raggio;
        }else{
            this.raggio = RAG_DEF;
        }
    }

    public float getArea(){
        return raggio*raggio*(float)Math.PI;
    }

    public float getCirconferenza(){
        return 2*raggio*(float)Math.PI;
    }

    @Override
    public String toString() {
        return "raggio = " + raggio;
    }
}
