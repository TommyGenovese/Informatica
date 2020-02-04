import java.awt.*;
import processing.core.PApplet;
public class Cerchio {
    private float dim;                          //diametro cerchio..
    private final static int DIM_DEFAULT = 100;
    private float cordX;  //coordinate del centro
    private float cordY;
    private Color colore;  //colore riempimento
    private Color bordo;   //colore bordo
    private PApplet processing;                 //oggetto finestra in cui viene usato

    public Cerchio(PApplet processing){
        this.processing = processing;

        cordX = processing.width/ 2;                //piazzato al centro della finestra
        cordY = processing.height/ 2;
        colore = new abstract Color(255,255,255);          //bianco
        bordo = new Color (0, 0, 0);                //nero
        dim = DIM_DEFAULT;
    }

    public void show(){
        processing.stroke(bordo.getRGB());      //colore bordo
        processing.fill(colore.getRGB());       //colore di riempimento
        processing.circle(cordX, cordY, dim);   //centro X,Y e diametro dim
    }

    public void setDim(float dim){
        if (dim >= 0) this.dim = dim;           //altrimenti lascia invariato
    }
}

