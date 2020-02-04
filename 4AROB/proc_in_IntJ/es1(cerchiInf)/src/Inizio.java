import processing.core.PApplet;

public class Inizio extends PApplet {
    public static void main(String[] args){
        PApplet.main("Inizio");
    }

    public void settings(){
        size(640,360);
    }

    public void setup(){
        Cerchio c= new Cerchio(this);
    }

    public void draw(){
        c.show();
    }
}
