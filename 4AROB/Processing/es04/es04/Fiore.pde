public class Fiore{
  private static final int nPetali = 4; 
  private Cerchio[] Petali;
  private Cerchio Pistillo;
  private Rettangolo Gambo;
  private float x;  //coordiante x e y
  private float y;
  private float cx;
  private float cy;
  private color colore;  //colore rimepimento e del bordo
  private color bordo;
  
  public Fiore(){
    //imposto di default il colore bianco ed il bordo nero
    colore = color(255,255,255);
    bordo = color(0,0,0);
    
         
    
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

}
