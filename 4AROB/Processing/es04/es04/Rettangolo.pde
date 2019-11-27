public class Rettangolo{
  private static final int ALT_DEF = 20;  //dimesione di default
  private static final int LARG_DEF = 5;  //dimesione di default
  private float h;  //diametro del rettangolo
  private float l;
  private float x;  //coordiante x e y
  private float y;
  private color colore;  //colore rimepimento e del bordo
  private color bordo;
  
  public Rettangolo(){
    h = ALT_DEF;
    l = LARG_DEF;
    //imposto di default il colore bianco ed il bordo nero
    colore = color(0, 177, 87);
    bordo = color(0,0,0);
    x = width / 2;
    y = height / 2;
  }
  
  public void setX(float x){
    this.x = x;
  }
  
  public void setY(float y){
    this.y = y;
  }
  
  public void setColor(color colore){
    this.colore = colore;
  }
  
  public void SetStroke(color bordo){
    this.bordo = bordo;
  }
  
  public void setH(float h){
    this.h = h;
  }
  public void setL(float l){
    this.l = l;
  }
  
  public float getX(){
    return x;
  }
  
  public float getY(){
    return y;
  }
  
  public color getColore(){
    return colore;
  }
  
  public color getStroke(){
    return bordo;
  }
  
  public float getH(){
    return h;
  }
  public float getL(){
    return l;
  }
  
  public void show(){
    fill(colore);
    stroke(bordo);
    rect(x,y,l, h);
  }
}
