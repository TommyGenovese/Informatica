public class CerchioDinamico extends Cerchio{
  private float speedx;  //coordiante x e y
  private float speedy;
  private float posx=0;
  private float posy=0;
  
  public CerchioDinamico(){
    super();
    speedx = 25;
    speedy = 12.75;
  }
  
  public void move(){
    setX(getX() + speedx);
    setY(getY() + speedy);
  }
  
  public void setspeedx(float speedx){
    this.speedx = speedx;
  }
  
  public void setspeedy(float speedy){
    this.speedy = speedy;
  }
  
  public float getspeedx(){
    return speedx;
  }
  
  public float getspeedy(){
    return speedy;
  }
}
